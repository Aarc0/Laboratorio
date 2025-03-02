
public class Periodico extends Publicacion
{
	private String hostOrganization; 
	
	public Periodico(String titulo, String autores, String hostOrganization, int dia, int mes, int año)
	{
		super(titulo, autores,dia, mes,año);
		this.hostOrganization = hostOrganization;
	}
	
	/////////////////////////////////////////
	public String getHostOrganization()
	{
		return hostOrganization;
	}
	public void setHostOrganization(String hostOrganization)
	{
		this.hostOrganization = hostOrganization;
	}
	/////////////////////////////////////////
}
