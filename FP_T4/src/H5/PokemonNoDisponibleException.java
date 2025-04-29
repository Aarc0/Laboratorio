package H5;

import java.util.ArrayList;

public class PokemonNoDisponibleException extends Exception
{
	private ArrayList<Pokemon> poke = new ArrayList();
	
	public PokemonNoDisponibleException(ArrayList<Pokemon> poke) 
	{
		this.poke = poke;
	}

	public void mostrarE1(int posicion)
	{
		System.out.println("La posicion "+posicion+" está fuera de los límites del equipo");
	}
	
	public void mostrarE2()
	{
		System.err.println("No hay ningún Pokemon en la posición "+(poke.size()+1)+" del equipo\n");
	}
}
