
public class Publicacion 
{
	protected String titulo;
	protected String autores;
	protected int[] fecha;
	public Publicacion(String titulo, String autores, int dia, int mes, int año) 
	{
		this.titulo = titulo;
		this.autores = autores;
		fecha = new int[3];
		fecha[0] = dia;
		fecha[1] = mes;
		fecha[2] = año;
	}
	
	/////////////////////////////////////////
	public String getTitulo() 
	{
		return titulo;
	}
	public void setTitulo(String titulo) 
	{
		this.titulo = titulo;
	}
	/////////////////////////////////////////
	
	/////////////////////////////////////////
	public String getAutores() 
	{
		return autores;
	}
	public void setAutores(String autores) 
	{
		this.autores = autores;
	}
	/////////////////////////////////////////
	
	/////////////////////////////////////////
	public int[] getFecha() 
	{
		return fecha;
	}
	public void setFecha(int[] fecha) 
	{
		this.fecha = fecha;
	}
	/////////////////////////////////////////
	
	
	
}
