package H_Final;

public class SuperBall extends Pokeball 
{
	private int fallo;

	public SuperBall(int integridad) 
	{
		super(integridad);
		this.percent = 0.2;
		this.fallo = 0;
	}
	
	//////////////////////////////////////////////
	public int getFallo() 
	{
		return fallo;
	}

	public void setFallo(int fallo) 
	{
		this.fallo = fallo;
	}
	//////////////////////////////////////////////

	
	public boolean captura(Pokemon pok)
	{
		double random = Math.random();
		boolean b = false;
		

		System.out.println("Usando la "+this.getClass().getSimpleName()+" probabilida de captura: "+ Math.round(this.percent*100)+"% | Integridad: "+this.integridad+" | Rachas: "+this.fallo);
			
		
		if(this.percent >= random)
		{
			System.out.println("¡Captura exitosa! "+pok.getNombre()+" ahora es tuyo");
			b = true;
			this.setIntegridad(this.integridad-4);
			this.setFallo(0);
			if(this.getFallo()==0) setPercent(0.2);
			return b;
		}
		else
		{
			this.setIntegridad(this.integridad-4);
			this.setPercent(this.getPercent()+0.1);
			this.setFallo(this.getFallo()+1);
			System.out.println("La captura de "+pok.getNombre()+" falló");
		}
		return b;
	}

	@Override
	public String toString() 
	{
		return "SuperBall probabilidad de captura: "+ Math.round(this.percent*100)+"% | Integridad: "+integridad+" | Rachas: "+fallo;
	}
	
}
