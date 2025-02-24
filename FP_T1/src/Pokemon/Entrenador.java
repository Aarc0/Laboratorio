package Pokemon;

import java.util.Arrays;

public class Entrenador 
{
	private String nombre;
	private Pokemons [] pok;
	private Pokeball [] pkb;
	
	public Entrenador(String nombre, Pokeball [] pkb)
	{
		this.nombre = nombre;
		this.pok = new Pokemons[3];
		this.pkb = pkb;
	}
	
	/////////////////////////////////
	public Pokemons[] getpok()
	{
		return pok;
	}
	
	public void setPok(Pokemons pok, int x) 
	{
		this.pok[x] = pok;
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

	public void atrapar(Pokemons pok, int x)
	{
		int its = 0;			
		pkb[x] = new Pokeball(pkb[x].captura(pok.Getnombre(), its, pkb[x].getIntegridad(),x));
		if (x < 3) setPok(pok, x);
	}

	@Override
	public String toString() 
	{
		return "Entrenador [nombre=" + nombre + ", pok=" + Arrays.toString(pok) + ", pkb=" + Arrays.toString(pkb) + "]";
	}
	
}