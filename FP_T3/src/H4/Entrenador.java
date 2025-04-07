package H4;

import java.util.ArrayList;

public class Entrenador 
{
	private ArrayList<Pokemon> poke = new ArrayList();
	private Pokeball [] pkb;
	private int nivel;
	private String nombre;
	private Equipo equipo;
	
	public Entrenador(String nombre, int nivel, Pokeball[] pkb, Equipo equipo) 
	{
		this.pkb = pkb;
		this.nombre = nombre;
		this.nivel = nivel;
		this.equipo = equipo;
	}

	//////////////////////////////////////////
	public Pokemon getPoke(int i) 
	{
		return poke.get(i);
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
			e.MostrarError();
		}
	}
	public void RemoverPokemon(Pokemon poke)
	{
		this.poke.remove(poke);
	}
	//////////////////////////////////////////

	//////////////////////////////////////////
	public Pokeball[] getPkb() 
	{
		return pkb;
	}
	public void setPkb(Pokeball[] pkb) 
	{
		this.pkb = pkb;
	}
	//////////////////////////////////////////
	
	//////////////////////////////////////////
	public String getNombre() 
	{
		return nombre;
	}
	public void setNombre(String nombre) 
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
	
	public void Captura(Pokemon poke)
	{			
		//Para saber si fue atrapado o no
		boolean b;	
		int i;
	
		//Busca la pokeball con integridad mayor que 0
		for(i = 0;i<pkb.length;i++)
		{
			if(pkb[i].getIntegridad()>0) break;
		}
		try 
		{
			//Condición que pongo para que el código se ejecute mientras el equipo no esté lleno
			if(this.poke.size()<6) 
			{
				if(poke.getEntrenador() != null) throw new PokemonYaCapturadoException(poke);
				else 
				{
					//Si atrapa al pokemon "b" se hace verdadero
					//Llama al método de la pokeball "Captura" y le paso como parametro un solo pokemon 
					b = pkb[i].Captura(poke);
					if(b)
					{
						setPoke(poke);
						//De esta manera asocio solo los pokemons que el entrenador atrape al entrenador
						poke.setEntrenador(this);
					}
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
			e.MostrarError();
		} catch (PokemonYaCapturadoException e) 
		{
			e.MostrarError();
		}
	}

	public void MostrarPoks()
	{
		System.out.println("\nEl entrenador "+getNombre()+" tiene los siguientes pokemon:");
		for (int i = 0; i < poke.size(); i++) 
		{
			System.out.println((i+1)+". Nombre: "+poke.get(i).getNombre()+" Tipo: "+poke.get(i).getTipo()+" Nivel: "+poke.get(i).getNivel()+" Velocidad: "+poke.get(i).getVelocidad()+" Experiencia: "+poke.get(i).getExperiencia()+" Salud: "+poke.get(i).getSalud());
		}
	}
	
	public void DejarPokemon(Gimnasio gym)
	{
		try
		{
			//Si el equipo es distinto y además el gimnasio no es nulo lanzo la excepsión
			if(gym.getEquipo() != equipo && gym.getEquipo() != Equipo.Neutral) throw new EquipoIncorrectoException(gym.getEquipo(),this);
			
			//Si no son las condiciones anteriores dejo el pokemon y además seteo el equipo del gimnasio
			else
			{
				gym.AñadirPokemon(this);
				gym.setEquipo(equipo);
			}
		}
		catch(EquipoIncorrectoException e)
		{
			e.MostrarError();
		}
		catch(GimnasioPlenoException e)
		{
			e.MostrarError();
		}
	}
	public void AtacarGimnasio(Gimnasio gym)
	{
		Pokemon [] atacantes = new Pokemon[3];
		System.out.println("\n"+nombre+" ("+equipo+") atacará al gimnasio del equipo "+gym.getEquipo()+"\n");
		try 
		{
			//Compruebo que el entrenador tiene los pokemon suficientes para atacar al gimnasio (3)
			for (int i = 0; i < 3; i++) 
			{
				//Si no tiene suficientes pokemon, lanzo una excepción informandole de que no hay suficientes pokemon
				if(poke.size() < 3) throw new PokemonNoDisponibleException(poke);
				else atacantes[i] = poke.get(i);
			}
			
			for (int i = 0; i < atacantes.length; i++) 
			{
				gym.Combates(atacantes[i]);
			}
			gym.setEquipo(equipo);
		}catch(PokemonNoDisponibleException e)
		{
			e.MostrarE2();
		}
	}

}
