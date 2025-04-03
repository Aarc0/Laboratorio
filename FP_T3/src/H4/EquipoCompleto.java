package H4;

public class EquipoCompleto extends Exception 
{
	private Pokemon pokemon;
	private Entrenador entrenador;
	
	public EquipoCompleto(Pokemon pokemon, Entrenador entrenador)
	{
		this.pokemon = pokemon;
		this.entrenador = entrenador;
	}
	
	@Override
	public String toString()
	{
		return "EXCEPCIÓN: No se pudo agregar a "+this.pokemon.getNombre()+" porque el equipo del entrenador "+entrenador.getNombre()+" está completo";
	}
	
	public void MostrarError()
	{
		System.out.println(toString());
	}
}
