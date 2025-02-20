package Pokemon;
public class Entrenador 
{
	private String nombre;
	private Pokemons [] pok;
	private Pokeball [] pkb;
	
	
	/////////////////////////////////
	public Pokemons[] getpok()
	{
		return pok;
	}
	
	public void setpok(Pokemons[] pok)
	{
		this.pok = pok;
	}
	/////////////////////////////////
	
	/////////////////////////////////
	public Pokeball[] getPkb() 
	{
		return pkb;
	}

	public void setPkb(Pokeball[] pkb) 
	{
		this.pkb = pkb;
	}
	/////////////////////////////////
	
	public String getNombre() 
	{
		return nombre;
	}
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	/////////////////////////////////
	
	public Entrenador()
	{
		
		this.pok = new Pokemons[3];
		this.pkb = new Pokeball[6];
	}
	
}