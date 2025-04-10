package H4;

public class PokemonYaCapturadoException extends Exception 
{
	private Pokemon pok;
	
	public PokemonYaCapturadoException(Pokemon pok) 
	{
		this.pok = pok;
	}
	@Override
	public String toString() 
	{
		return "El pokemon "+pok.getNombre()+" ya pertenece al entrenador "+pok.getEntrenador().getNombre()+" y no puede ser capturado";
	}
 
	public void mostrarError()
	{
		System.err.println("ERROR: "+toString());
	}
}
