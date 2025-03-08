package EJ_OP_2;

public class Arco 
{
	private int nPasajeros;
	private int nPasajerosSospechosos;
	
	public Arco() {}

	///////////////////////////////////////////
	public int getnPasajeros() 
	{
		return nPasajeros;
	}
	public void setnPasajeros(int nPasajeros) 
	{
		this.nPasajeros = nPasajeros;
	}
	///////////////////////////////////////////
	
	///////////////////////////////////////////
	public int getnPasajerosSospechosos() 
	{
		return nPasajerosSospechosos;
	}
	public void setnPasajerosSospechosos(int nPasajerosSospechosos) 
	{
		this.nPasajerosSospechosos = nPasajerosSospechosos;
	}
	///////////////////////////////////////////
	
	public boolean escanear(Pasajero p) 
	{
		boolean b = p.getMaleta().isVisible();
		if(b)
		{
			System.out.println("-La maleta es visible");
			b = p.getMaleta().isMetal();
			if(b)
			{
				System.out.println("-La maleta lleva algo de metal\n");
				return false;
			}
			else
			{
				System.out.println("-La maleta no lleva nada de metal\n");
				return true;
			}
		}
		else
		{
			System.out.println("-La maleta no es visible");
			return false;
		}
	}
}
