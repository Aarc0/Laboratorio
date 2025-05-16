package H_Final;

public class EquipoCompletoException extends Exception 
{
	private Pokemon pokemon;
	private Nombre nombreE;
	
	public EquipoCompletoException(Pokemon pokemon, Nombre nombreE)
	{
		this.pokemon = pokemon;
		this.nombreE = nombreE;
	}
	
	@Override
	public String toString()
	{
		return "EXCEPCIÓN: No se pudo agregar a "+this.pokemon.getNombre()+" porque el equipo del entrenador "+nombreE+" está completo";
	}
	
	public void mostrarError()
	{
		System.err.println(toString());
	}
}
