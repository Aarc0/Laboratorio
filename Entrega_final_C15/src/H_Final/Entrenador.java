package H_Final;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Entrenador 
{
	private ArrayList<Pokemon> poke = new ArrayList();
	private Pokeball [] pkb;
	private int nivel;
	private Nombre nombre;
	private Equipo equipo;
	
	public Entrenador(Nombre nombre, int nivel, Equipo equipo) 
	{
		this.nombre = nombre;
		this.nivel = nivel;
		this.equipo = equipo;
	}

	//////////////////////////////////////////
	public Pokemon getPoke(int i) throws PokemonNoDisponibleException 
	{
		try
		{
			poke.get(i);
		}catch(IndexOutOfBoundsException e)
		{
			throw new PokemonNoDisponibleException(i,this);
		}		
		return poke.get(i);
	}
	public int sizeEquipo()
	{
		return poke.size();
	}
	public void setPoke(Pokemon poke) 
	{
		try
		{
			if(this.poke.size()<6) this.poke.add(poke);
			else throw new EquipoCompletoException(poke,nombre);
		}
		catch(EquipoCompletoException e)
		{
			poke.setEntrenador(null);
			e.mostrarError();
		}
	}
	public void removerPokemon(Pokemon poke)
	{
		this.poke.remove(poke);
	}
	//////////////////////////////////////////

	//////////////////////////////////////////
	public Pokeball getPkb(int i) 
	{
		return pkb[i];
	}
	public void setPkb(Pokeball[] pkb) 
	{
		this.pkb = pkb;
	}
	//////////////////////////////////////////
	
	//////////////////////////////////////////
	public Nombre getNombre() 
	{
		return nombre;
	}
	public void setNombre(Nombre nombre) 
	{
		this.nombre = nombre;
	}
	//////////////////////////////////////////
	
	//////////////////////////////////////////
	public Equipo getEquipo() 
	{
		return equipo;
	}
	public void setEquipo(Equipo equipo) 
	{
		this.equipo = equipo;
	}
	//////////////////////////////////////////
	
	public void captura(Pokemon poke)
	{			
		//Para saber si fue atrapado o no
		boolean b = false;	
		int i;
		for(i = 0;i<pkb.length;i++)
		{
			if(pkb[i].getIntegridad()>0 || i ==9) break;
		}
		try 
		{
			//Busca la pokeball con integridad mayor que 0
			System.out.println("\nEntrenador que está realizando la captura:"+nombre);
			//Condición que pongo para que el código se ejecute mientras el equipo no esté lleno
			if(this.poke.size()<6) 
			{
				if(poke.getEntrenador() != null) throw new PokemonYaCapturadoException(poke);
				else 
				{
					//Si atrapa al pokemon "b" se hace verdadero
					//Llama al método de la pokeball "Captura" y le paso como parametro un solo pokemon 
					if(pkb[i].getIntegridad()>0) b = pkb[i].captura(poke);
					if(b)
					{
						setPoke(poke);
						//De esta manera asocio solo los pokemons que el entrenador atrape al entrenador
						poke.setEntrenador(this);
					}
					else return;
				}
			}
			//Esta excepción se lanza cuando un entrenador intenta capturar más pokemon de los que puede
			else
			{
				System.out.println("Usando la "+pkb[i].toString());
				throw new EquipoCompletoException(poke,nombre);
			}
			//Pasamos el pokemon en específico y le pasamos al entrenador completo aunque en realidad podríamos pasarle solo el nombre del entrenador
		}
		catch(EquipoCompletoException e) 
		{
			e.mostrarError();
		} 
		catch (PokemonYaCapturadoException e) 
		{
			e.mostrarError();
		} 

	}

	public void mostrarPoks()
	{
		System.out.println("\nEl entrenador "+getNombre()+" tiene los siguientes pokemon:");
		for (int i = 0; i < poke.size(); i++) 
		{
			System.out.println((i+1)+". Nombre: "+poke.get(i).getNombre()+" Tipo: "+poke.get(i).getTipo()+" Nivel: "+poke.get(i).getNivel()+" Velocidad: "+poke.get(i).getVelocidad()+" Experiencia: "+poke.get(i).getExperiencia()+" Salud: "+poke.get(i).getSalud());
		}
	}

	public void dejarPokemon(Gimnasio gym)
	{
		try
		{
			
			if(gym.getEquipo()==Equipo.Neutral || gym.getEquipo() == equipo)
			{
				gym.añadirPokemon(this);
				gym.setEquipo(equipo);
			}
			
			else if(gym.getEquipo() != equipo && gym.getEquipo() != Equipo.Neutral) 
			{
				throw new EquipoIncorrectoException(gym.getEquipo(),this);
			}
		}
		catch(EquipoIncorrectoException e)
		{
			e.mostrarError();
		}
		catch(GimnasioPlenoException e)
		{
			e.mostrarError();
		}
	}

	public void dejarPokemonEspecifico(Gimnasio gym, int x)
	{
		try
		{
			if(gym.getEquipo()==Equipo.Neutral || gym.getEquipo() == equipo)
			{
				gym.añadirPokemonEspecifico(this, x);
				gym.setEquipo(equipo);
			}
			
			else if(gym.getEquipo() != equipo && gym.getEquipo() != Equipo.Neutral) 
			{
				throw new EquipoIncorrectoException(gym.getEquipo(),this);
			}
		}
		catch(EquipoIncorrectoException e)
		{
			e.mostrarError();
		}
		catch(GimnasioPlenoException e)
		{
			e.mostrarError();
		}
	}
	
	public void atacarGimnasio(Gimnasio gym,PrintWriter salida)
	{	
		boolean b = true;
		
		//Esta variable me ayuda a determina si el entrenador tiene todos sus pokemon sin salud
		int y = 0;
		/*
		 * Un entrenador envía sus 3 primero pokemon a atacar para ello hice un equipo separado de atacantes
		 * luego estos atacantes tienen vida, con esta variable determino si todos esos atacantes tiene vida o no
		 * para ello cada vez evalúa a un pokemon diferente y observa si tiene vida o no
		 * Si esta variable alcanza el numero de atacantes (2) (empezando desde 0) significa que no tengo atacantes con vida 
		 * y por lo tanto que no conquisté el gimnasio
		 */
		
		//Esta variable me ayuda a contar cuantos pokemon tengo en el equipo que no tengan salud
		int j = 0;
		
		//Me sirve para ir iterando entre los distintos pokemon que van a atacar
		int count = 0;
				
		
		int combates = 1;
		Pokemon [] atacantes = new Pokemon[3];
		System.out.println(nombre+" ("+equipo+") atacará al gimnasio del equipo "+gym.getEquipo()+"\n");
		try 
		{
			salida.println("\n"+"[ATAQUE] "+nombre +" (Equipo "+equipo+") vs "+gym.getNombreG());

			//Compruebo que el entrenador tiene los pokemon suficientes para atacar al gimnasio (3)
			if(poke.size() < 3) 
			{
				if(atacantes[2]== null) salida.println("El entrenador no cuenta con suficientes pokemon para realizar el ataque");
			}
			if(poke.size() < 3) 
			{
				throw new PokemonNoDisponibleException(poke,gym,this);				
			}
			
			//Primero queremos que recorra TODO el array de pokeballs
			//Luego queremos que en si los atacantes están completos se salga del bucle
			//queremos además que siempre empiece a rellenar los atacantes desde el indice 0 
			for (int i = 0; i < poke.size() && b; i++) 
			{				
				
				if(atacantes[2] != null) b = false;
				
				else if(poke.get(i).getSalud()>0) 
				{
					atacantes[count] = poke.get(i);
					count++;
				}
				
				if(poke.get(i).getSalud()<=0) j++;
			}
			
			
			if(atacantes[2]== null) salida.println("El entrenador no cuenta con suficientes pokemon para realizar el ataque");
			
			
			if(j==poke.size() || atacantes[2]==null)
			{
				throw new PokemonNoDisponibleException(poke,gym,this);
			}
			
			//la logica como tal de los combates es que si tengo un pokemon con vida ese sea el que vaya a atacar
			for (int i = 0; i < atacantes.length; i++) 
			{
				while(atacantes[i].getSalud()>0)
				{
					gym.combates(atacantes[i],salida,combates);
					combates++;			
				}
				if(atacantes[i].getSalud()<=0) y++;
			}
			if(y == atacantes.length) 
			{
				salida.println("Resultado final: No conquistado");
			}
		}
		catch(PokemonNoDisponibleException e)
		{
			if(j==poke.size()) 
			{
				e.mostrarE3();
			}
			else
			{
				e.mostrarE2();
			}
		} 
		catch (GimnasioSinDefensoresException e) 
		{
			e.mostrarError();
			salida.println("Resultado final: Conquistado");
			gym.setEquipo(equipo);
		}
	}

	public boolean comprobarPokeballs()
	{
		boolean b = false;
		for (int i = 0; i < pkb.length; i++) 
		{
			if(pkb[i].getIntegridad()>0) b = true;
		}
		return b;
	}
	
	public void atacarPokemonEspecifico(Pokemon defensor)
	{
		try 
		{
			if(poke.size()<1)
			{
				throw new PokemonNoDisponibleException(0,this);
			}
			while(true)
			{
				poke.get(0).atacar(defensor);
				defensor.atacar(poke.get(0));
			}
		}
		catch (PokemonDebilitadoException e) 
		{
			e.mostrarError();
		} 
		catch (PokemonNoDisponibleException e) 
		{
			e.mostrarE2();
		}
	}
	
	
	@Override
	public String toString() 
	{
		return "Entrenador [nombre= "+nombre+ ", equipo=" + equipo+", Pokemons=" + poke + ", Pokeballs=" + Arrays.toString(pkb) + "]";
	}

	
	
}
