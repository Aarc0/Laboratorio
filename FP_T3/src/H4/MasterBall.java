package H4;

public class MasterBall extends Pokeball
{
	private double estabilidad;

	public MasterBall(double percent, double estabilidad) 
	{
		super(4,percent);
		this.estabilidad = estabilidad;
	}

	public double getEstabilidad() 
	{
		return estabilidad;
	}

	public void setEstabilidad(double estabilidad) 
	{
		this.estabilidad = estabilidad;
	}
	public boolean Captura(Pokemon pok)
	{
		System.out.println("Usando la "+this.getClass().getSimpleName()+" probabilida de captura: "+ Math.round(this.percent*100)+"% | Estabilidad: "+this.estabilidad);
		System.out.println("¡Captura exitosa! "+pok.getNombre()+" ahora es tuyo");
		boolean	b = true;
		this.setIntegridad(this.integridad-4);
		double daño = Math.round(pok.getSalud()*(1-getEstabilidad()));
		int salud = pok.getSalud()-(int)daño;
		pok.setSalud(salud);			
		return b;
	}	
}
