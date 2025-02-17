package Pokemon;

public class Entrenador 
{
	private String nombre;
	private String pok1;
	private String pok2;
	private String pok3;
	
	public String getNombre() 
	{
		return nombre;
	}
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	public String getPok1() {
		return pok1;
	}
	public void setPok1(String pok1) 
	{
		this.pok1 = pok1;
	}
	
	public String getPok2() 
	{
		return pok2;
	}
	public void setPok2(String pok2) 
	{
		this.pok2 = pok2;
	}
	
	public String getPok3() 
	{
		return pok3;
	}
	public void setPok3(String pok3) 
	{
		this.pok3 = pok3;
	}
	
	public Entrenador(String nombre) 
	{
		this.nombre = nombre;
	}
	
	
	
}
