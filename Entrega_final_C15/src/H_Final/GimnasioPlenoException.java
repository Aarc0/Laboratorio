package H_Final;

public class GimnasioPlenoException extends Exception 
{
	public String toString() 
	{
		return "\nERROR: El gimnasio ya tiene el máximo de defensores. No se pueden añadir más pokemon";
	}
	
	public void mostrarError()
	{
		System.err.println(toString());
	}
}
