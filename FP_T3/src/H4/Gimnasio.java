package H4;

public class Gimnasio 
{
	private String nombreG;
	private Equipo equipo;
	private Pokemon[] pok = new Pokemon[3];
	
	////////////////////////////////////////////
	public void setEquipo(Equipo equipo)
	{
		this.equipo = equipo;
	}
	public Equipo getEquipo()
	{
		return equipo;
	}
	////////////////////////////////////////////
	
	////////////////////////////////////////////
	public String getNombreG() 
	{
		return nombreG;
	}
	public void setNombreG(String nombreG) 
	{
		this.nombreG = nombreG;
	}
	////////////////////////////////////////////
	
	////////////////////////////////////////////
	public Pokemon getPok(int i) 
	{
		return pok[i];
	}
	public void setPok(Pokemon pok, int i) 
	{
		this.pok[i] = pok;
	}
	////////////////////////////////////////////
	
	public Gimnasio(Equipo equipo, String nombreG)
	{
		this.equipo = equipo;
		this.nombreG = nombreG;
	}
	
	public void Combates(Pokemon pok1, Pokemon pok2)
	{
		
	}
}
