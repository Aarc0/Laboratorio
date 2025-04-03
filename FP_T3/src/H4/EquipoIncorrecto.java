package H4;

public class EquipoIncorrecto extends Exception 
{
	private Equipo equipo;
	private Entrenador entrenador;
	
	public EquipoIncorrecto(Equipo equipo) 
	{
		this.equipo = equipo;
	}
	
	@Override
	public String toString() 
	{
		return "El entrenador "+entrenador.getNombre()+" del equipo "+ entrenador.getEquipo()
		       +" no puede dejar Pokémon en el gimnasio controlado por el equipo "+equipo;
	}
	
	public void MostrarError()
	{
		System.out.println("ERROR: "+toString());
	}
	
}
