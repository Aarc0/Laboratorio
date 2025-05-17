package EJ4_AndresAlejandro_RojasCardona;

public class Cilindro extends Circulo
{
	private double altura;
	
	public Cilindro(double radio, double altura) 
	{
		super(radio);
		this.altura = altura;
		verificacion();
	}

	
	public void verificacion()
	{
		try
		{
			if(getRadio()<0 || altura<0)throw new NumeroNegativoException(this);
		}
		catch(NumeroNegativoException e)
		{
			e.mostrarError();
		}
	}
	public double getAltura() 
	{
		return altura;
	}

	public void setAltura(double altura) 
	{
		this.altura = altura;
	}

	public double calculoVolumen()
	{
		double volumen = altura * super.calculoArea();
		return volumen;
	}
	
	@Override
	public double calculoArea()
	{
		double superficieTotal = 2*Math.PI*getRadio()*(getRadio()+altura);
		
		return superficieTotal;
	}


	@Override
	public String toString() {
		return "Cilindro [altura=" + altura + ", toString()=" + super.toString() + "]";
	}	
	
	
}
