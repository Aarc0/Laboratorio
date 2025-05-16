package H_Final;

public class GimnasioSinDefensoresException extends Exception
{
	private Entrenador E;
	public GimnasioSinDefensoresException(Entrenador E)
	{
		this.E = E;
	}
	public void mostrarError()
	{
		System.err.println("El gimnasio no cuenta con defensores para protegerlo, declarando gimnasio como del equipo "+E.getEquipo());
	}
}
