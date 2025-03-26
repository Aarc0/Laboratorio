package EJ_OPCIONAL;

public abstract class Biblioteca implements programas
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
	
	public Biblioteca(int codigo, int año, boolean prestado) 
	{
		this.codigo = codigo;
		this.año = año;
		this.prestado = prestado;
	}
	
}
