package H_Final;

import java.util.ArrayList;

public class PokemonNoDisponibleException extends Exception
{
	private ArrayList<Pokemon> poke = new ArrayList();
	private Gimnasio gym;
	private int posicion;
	private Entrenador entrenador;
	
	public PokemonNoDisponibleException(ArrayList<Pokemon> poke, Gimnasio gym, Entrenador entrenador) 
	{
		this.poke = poke;
		this.gym = gym;
		this.entrenador = entrenador;
	}
	public PokemonNoDisponibleException(int posicion, Entrenador entrenador)
	{
		this.entrenador = entrenador;
		this.posicion = posicion;
	}

	public void mostrarE1()
	{
		System.err.println("La posicion "+posicion+" está fuera de los límites del equipo");
	}
	
	public void mostrarE2()
	{
		System.err.println("El entrenador "+entrenador.getNombre()+" no cuenta con suficientes pokemon para realizar el ataque");
	}
	
	public void mostrarE3()
	{
		System.err.println("El entrenador no cuenta con pokemons con vida para poder atacar el gimnasio del equipo "+gym.getEquipo());
	}
}
