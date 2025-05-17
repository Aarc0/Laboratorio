package EJ3_AndresAlejandro_RojasCardona;

public class ClienteRestaurante 
{
	private int numeroMesa;
	private String nombreContacto;
	public ClienteRestaurante(int numeroMesa, String nombreContacto)
	{
		this.numeroMesa = numeroMesa;
		this.nombreContacto = nombreContacto;
	}
	
	public int getNumeroMesa() 
	{
		return numeroMesa;
	}
	public void setNumeroMesa(int numeroMesa) 
	{
		this.numeroMesa = numeroMesa;
	}
	
	public String getNombreContacto() 
	{
		return nombreContacto;
	}
	public void setNombreContacto(String nombreContacto) 
	{
		this.nombreContacto = nombreContacto;
	}

	@Override
	public String toString() 
	{
		return "ClienteRestaurante [numeroMesa=" + numeroMesa + ", nombreContacto=" + nombreContacto + "]";
	}
	
	
}
