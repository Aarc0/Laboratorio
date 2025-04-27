package EJ_OPCIONAL_T3;

public class AgotadoException extends Exception 
{

	@Override
	public String toString() 
	{
		return "Estoy agotado...";
	}
	
	public void mostrarMensaje()
	{
		System.out.println(toString());
	}
}
