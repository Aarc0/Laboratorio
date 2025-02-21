package Pokemon;
public class Entrenador 
{
	private String nombre;
	private Pokemons [] pok;
	private Pokeball [] pkb;
	
	public Entrenador(String nombre,Pokemons[] pok, Pokeball[] pkb)
	{
		this.nombre = nombre;
		this.pok = pok;
		this.pkb = pkb;
	}
	
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
	

	
	public String atrapar(Pokeball pkb[])
	{
		int x = 0;
		String aux = "a";
		int its = 0;
		
		if(x<pkb.length)
		{			
			pkb[x] = new Pokeball(pkb[x].usos(pok[x].Getnombre(), its, pkb[x].getIntegridad()));
			aux = pok[x].Getnombre();
			x++;
			return aux;
		}
		else return aux;
		
	}
	
}