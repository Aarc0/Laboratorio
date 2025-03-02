package H2;

public class Entrenador 
{
	private Pokemons [] poke;
	private Pokeball [] pkb;
	private int nivel;
	private String nombre;
	
	
	public Entrenador(String nombre, int nivel, Pokeball[] pkb ) 
	{
		this.poke = new Pokemons[9];
		this.pkb = pkb;
		this.nombre = nombre;
		this.nivel = nivel;
	}

	//////////////////////////////////////////
	public Pokemons[] getPoke() 
	{
		return poke;
	}

	public void setPoke(Pokemons[] poke) 
	{
		this.poke = poke;
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
		
	
	
	
}
