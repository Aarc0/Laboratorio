package H5;

import java.util.ArrayList;

public class PokemonNoDisponibleException extends Exception
{
	private ArrayList<Pokemon> poke = new ArrayList();
	private Gimnasio gym;
	
	public PokemonNoDisponibleException(ArrayList<Pokemon> poke) 
	{
		this.poke = poke;
	}
	public PokemonNoDisponibleException(Gimnasio gym)
	{
		this.gym = gym;
	}

	public void mostrarE1(int posicion)
	{
		System.out.println("La posicion "+posicion+" está fuera de los límites del equipo");
	}
	
	public void mostrarE2()
	{
		System.err.println("El entrenador no cuenta con suficientes pokemon para realizar el ataque");
	}
	
	public void mostrarE3()
	{
		System.err.println("El entrenador no cuenta con pokemons con vida para poder atacar el gimnasio del equipo "+gym.getEquipo());
	}
}
