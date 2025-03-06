package H2;

public class Entrenador 
{
	private Pokemons [] poke;
	private Pokeball [] pkb;
	private int nivel;
	private String nombre;
	
	
	public Entrenador(String nombre, int nivel, Pokeball[] pkb ) 
	{
		this.poke = new Pokemons[6];
		this.pkb = pkb;
		this.nombre = nombre;
		this.nivel = nivel;
	}

	//////////////////////////////////////////
	public Pokemons[] getPoke() 
	{
		return poke;
	}

	public void setPoke(Pokemons poke, int i) 
	{
		this.poke[i] = poke;
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
	
	public void Captura(Pokemons poke)
	{
		//iterador de pokeball
		int i = 0;
		
		//Contador pokemons atrapados
		int po = 0;
		
		//Para saber si fue atrapado o no
		boolean b = false;
		
		//Iterador de pokemons
		int x = 0;
		
		while(i<pkb.length)
		{
			if(pkb[i].getIntegridad()>0)
			{
				b = pkb[i].Captura(poke);
				if(b)
				{
					setPoke(poke,po);
				}
			}
			else
			{
				i++;
			}
		}
	}
	public void MostrarPoks()
	{
		System.out.println("\n\n===Estado final de los Pokemons de "+getNombre()+"===");
		int i = 0;
		while(i<poke.length)
		{
			if(poke[i] == null) break;
			System.out.println("Nombre: "+poke[i].getNombre()+" Tipo: "+poke[i].getTipo()+" Nivel: "+poke[i].getNivel()+" Velocidad: "+poke[i].getVelocidad()+" Experiencia: "+poke[i].getExperiencia()+" Salud: "+poke[i].getSalud());
			i++;
		}
	}
}
