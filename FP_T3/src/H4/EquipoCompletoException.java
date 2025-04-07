package H4;

public class EquipoCompletoException extends Exception 
{
	private Pokemon pokemon;
	private String nombreE;
	
	public EquipoCompletoException(Pokemon pokemon, String nombreE)
	{
		this.pokemon = pokemon;
		this.nombreE = nombreE;
	}
	
	@Override
	public String toString()
	{
		return "EXCEPCIÓN: No se pudo agregar a "+this.pokemon.getNombre()+" porque el equipo del entrenador "+nombreE+" está completo";
	}
	
	public void MostrarError()
	{
		System.err.println(toString());
	}
}
