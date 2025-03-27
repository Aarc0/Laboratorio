package EJ_OPCIONAL;

public class Publicacion implements programas
{
	protected int codigo;
	protected int año;
	protected boolean prestado;
	
	////////////////////////////////////////
	public int getCodigo() 
	{
		return codigo;
	}
	public void setCodigo(int codigo) 
	{
		this.codigo = codigo;
	}
	////////////////////////////////////////
	
	////////////////////////////////////////
	public int getAño() 
	{
		return año;
	}
	public void setAño(int año) 
	{
		this.año = año;
	}
	////////////////////////////////////////
	
	////////////////////////////////////////
	public boolean isPrestado() 
	{
		return prestado;
	}
	public void setPrestado(boolean prestado) 
	{
		this.prestado = prestado;
	}
	////////////////////////////////////////
	
	public Publicacion(int codigo, int año) 
	{
		this.codigo = codigo;
		this.año = año;
		this.prestado = false;
	}
	
	@Override
	public void prestar() {}
	
	@Override
	public void devolver() {}
	
	@Override
	public void prestado() {}
	
}
