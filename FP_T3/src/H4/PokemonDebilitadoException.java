package H4;

//Se lanza cuando se intenta usar un Pokemon con salud 0 para atacar
public class PokemonDebilitadoException extends Exception
{
	
	private Pokemon pokemon;
	
	public PokemonDebilitadoException(Pokemon pokemon)
	{
		this.pokemon = pokemon;
	}

	@Override
	public String toString() 
	{
		return pokemon.getNombre() + " está debilitado y no puede atacar\n";
	}
	
	public void mostrarError()
	{
		System.err.println("¡Combate finalizado! "+toString());
	}
}
