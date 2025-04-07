package H4;

public class EquipoIncorrectoException extends Exception 
{
	private Equipo equipo;
	private Entrenador entrenador;
	
	public EquipoIncorrectoException(Equipo equipo,Entrenador entrenador) 
	{
		this.equipo = equipo;
		this.entrenador = entrenador;
	}
	
	@Override
	public String toString() 
	{
		return "El entrenador "+entrenador.getNombre()+" del equipo "+ entrenador.getEquipo()
		       +" no puede dejar Pokémon en el gimnasio controlado por el equipo "+equipo;
	}
	
	public void MostrarError()
	{
		System.err.println("\nERROR: "+toString());
	}
	
}
