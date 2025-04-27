package EJ_OPCIONAL_T3;

public class Corredor 
{
	private int energia_corredor;
	
	public Corredor(int energia_corredor) 
	{
		this.energia_corredor = energia_corredor;
	}
	
	///////////////////////////////////////////////////////
	public int getEnergia_corredor() 
	{
		return energia_corredor;
	}
	public void setEnergia_corredor(int energia_corredor) 
	{
		this.energia_corredor = energia_corredor;
	}
	///////////////////////////////////////////////////////
	
	public void recargar_energia(int energia)
	{
		energia_corredor += energia;
	}
	
	///////////////////////////////////////////////////////
	public void correr() throws AgotadoException
	{
		if(energia_corredor >= 10)
		{
			System.out.println("Corriendo...");
			energia_corredor = energia_corredor-10;
		}
		else throw new AgotadoException();
	}
	///////////////////////////////////////////////////////
	
	
}
