package H4;

public class UltraBall extends Pokeball
{
	private double potencia;

	//////////////////////////////////////////////
	public double getPotencia() 
	{
		return potencia;
	}
	public void setPotencia(double potencia) 
	{
		this.potencia = potencia;
	}
	//////////////////////////////////////////////
	
	public UltraBall(int integridad, double percent, double potencia)
	{
		super(integridad,percent);
		this.potencia = potencia;
	}
	public boolean Captura(Pokemon pok)
	{
		double random = Math.random();
		boolean b = false;
		

		System.out.println("Usando la "+this.getClass().getSimpleName()+" probabilida de captura: "+ Math.round(this.percent*100)+"% | Integridad: "+this.integridad+" | Potencia: "+this.potencia);
		if(this.percent >= random)
		{
			System.out.println("¡Captura exitosa! "+pok.getNombre()+" ahora es tuyo");
			b = true;
			this.setIntegridad(this.integridad-4);
			this.setPotencia(0);
			return b;
		}
		else
		{
			this.setIntegridad(this.integridad-4);
			setPotencia(getPotencia()+0.2);
			if(getPotencia()==0.4) setPercent(1);
			System.out.println("La captura de "+pok.getNombre()+" falló");
		}
		return b;
	}
	@Override
	public String toString()
	{
		return "Usando la UltraBall probabilidad de captura: "+ Math.round(this.percent*100)+"% | Integridad: "+integridad+" | Potencia: "+potencia;
	}
	
	
}
