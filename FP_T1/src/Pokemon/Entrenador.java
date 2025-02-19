package Pokemon;

public class Entrenador 
{
	private String nombre;
	private String Np;
	private String Tp;
	
	public String getPokn()
	{
		return Np;
	}
	public String getPokt()
	{
		return Tp;
	}
	public void setpok(String Np, String Tp)
	{
		this.Np = Np;
		this.Tp = Tp;
	}
	
	public String getNombre() 
	{
		return nombre;
	}
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	public Entrenador(String nombre, String Np, String Tp)
	{
		this.nombre = nombre;
		this.Np = Np;
		this.Tp = Tp;
	}
}