package EJ4_AndresAlejandro_RojasCardona;

public class Circulo 
{
	private double radio;
	
	Circulo(double radio)
	{
		this.radio = radio;
		verificacion();
	}

	public void verificacion()
	{
		try
		{
			if(radio<0)throw new NumeroNegativoException(this);
		}
		catch(NumeroNegativoException e)
		{
			e.mostrarError();
		}
	}
	
	public double getRadio() 
	{
		return radio;
	}

	public void setRadio(double radio) 
	{
		this.radio = radio;
	}
	
	public double calculoArea()
	{
		double area = Math.PI*(radio*radio);
		return area;
	}
	public double calculoCircunferencia()
	{
		double circunferencia = 2*Math.PI*radio;
		return circunferencia;
	}

	@Override
	public String toString() 
	{
		return "Circulo [radio=" + radio + "]";
	}
	
	
}
