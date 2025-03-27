package EJ_OPCIONAL;

public class Revista extends Publicacion
{
	private int numero;
	////////////////////////////////////////
	public int getNumero() 
	{
		return numero;
	}

	public void setNumero(int numero) 
	{
		this.numero = numero;
	}
	////////////////////////////////////////
	
	////////////////////////////////////////
	public Revista(int codigo, int año, int numero) 
	{
		super(codigo, año);
		this.numero = numero;
	}
	////////////////////////////////////////
	
	@Override
	public void prestar() 
	{
		this.setPrestado(true);
		System.out.println("La revista número "+getNumero()+" ha sido prestada");
	}
	
	@Override
	public void devolver() 
	{
		this.setPrestado(false);
		System.out.println("La revista número "+getNumero()+" ha sido devuelta");
	}
	
	@Override
	public void prestado() 
	{
		if(this.prestado == false) System.out.println("La revista número "+getNumero()+" está disponible");
	}
}