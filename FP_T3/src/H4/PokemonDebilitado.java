package H4;

//Se lanza cuando se intenta usar un Pokemon con salud 0 para atacar
public class PokemonDebilitado extends Exception
{
	
	private Pokemon pokemon;
	
	public PokemonDebilitado(Pokemon pokemon)
	{
		this.pokemon = pokemon;
	}

	@Override
	public String toString() 
	{
		return pokemon.getNombre() + "está debilitado y no puede atacar porque es tremendo mariconazo";
	}
	
	public void MostrarError()
	{
		System.out.println("ERROR: "+toString());
	}
	
	
}
