package EJ_OPCIONAL;

public class Libro extends Publicacion
{
	private String autor;
	
	////////////////////////////////////////
	public String getAutor() 
	{
		return autor;
	}
	////////////////////////////////////////
	
	////////////////////////////////////////
	public void setAutor(String autor) 
	{
		this.autor = autor;
	}
	////////////////////////////////////////
	
	////////////////////////////////////////
	public Libro(int codigo, int año, String autor) 
	{
		super(codigo, año);
		this.autor = autor;
	}
	////////////////////////////////////////
	
	@Override
	public void prestar() 
	{
		this.setPrestado(true);
		System.out.println("El libro del autor "+getAutor()+" ha sido prestado");
	}
	
	@Override
	public void devolver() 
	{
		this.setPrestado(false);
		System.out.println("El libro del autor "+getAutor()+" ha sido devuelto");
	}
	
	@Override
	public void prestado() 
	{
		if(this.prestado == false) System.out.println("El libro del autor "+getAutor()+" está disponible");	
	}
}