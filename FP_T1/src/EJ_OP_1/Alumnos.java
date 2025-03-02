package EJ_OP_1;

public class Alumnos 
{
	private int edad;
	private String discapacitado;
	private double pago;
	
	public int getEdad() 
	{
		return edad;
	}
	public void setEdad(int edad) 
	{
		this.edad = edad;
	}
	
	public String getDiscapacitado() 
	{
		return discapacitado;
	}
	public void setDiscapacitado(String discapacitado) 
	{
		this.discapacitado = discapacitado;
	}
	
	public double getPago()
	{
		return pago;
	}
	public void setPago(double pago)
	{
		this.pago = pago;
	}

	public Alumnos(int edad, String discapacitado) 
	{
		this.edad = edad;
		this.discapacitado = discapacitado;
	}
	

	
	

}
