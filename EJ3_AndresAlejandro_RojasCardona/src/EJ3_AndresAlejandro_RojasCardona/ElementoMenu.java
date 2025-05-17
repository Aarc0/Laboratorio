package EJ3_AndresAlejandro_RojasCardona;

public class ElementoMenu 
{
	private int idElemento;
	private String nombre;
	private String categoria;
	private double precio;
	public ElementoMenu(int idElemento, String nombre, String categoria, double precio)
	{
		this.idElemento = idElemento;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
	}
	
	public int getIdElemento() 
	{
		return idElemento;
	}
	public void setIdElemento(int idElemento) 
	{
		this.idElemento = idElemento;
	}
	public String getNombre() 
	{
		return nombre;
	}
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	public String getCategoria() 
	{
		return categoria;
	}
	public void setCategoria(String categoria) 
	{
		this.categoria = categoria;
	}
	public double getPrecio() 
	{
		return precio;
	}
	public void setPrecio(double precio) 
	{
		this.precio = precio;
	}

	@Override
	public String toString() 
	{
		return "ElementoMenu [idElemento=" + idElemento + ", nombre=" + nombre + ", categoria=" + categoria	+ ", precio=" + precio + "]";
	}
	
	
}
