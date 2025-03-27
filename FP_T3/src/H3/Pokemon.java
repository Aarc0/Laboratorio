package H3;

public abstract class Pokemon implements IFormulasDaño
{
	protected String nombre, tipo;
	protected int nivel,velocidad,experiencia,salud;
	
	//////////////////////////////////////////
	public String getNombre() 
	{
		return nombre;
	}
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	//////////////////////////////////////////
	
	//////////////////////////////////////////
	public String getTipo() 
	{
		return tipo;
	}
	public void setTipo(String tipo) 
	{
		this.tipo = tipo;
	}
	//////////////////////////////////////////
	
	//////////////////////////////////////////
	public int getNivel() 
	{
		return nivel;
	}
	public void setNivel(int nivel) 
	{
		this.nivel = nivel;
	}
	//////////////////////////////////////////
	
	//////////////////////////////////////////
	public int getVelocidad() 
	{
		return velocidad;
	}
	public void setVelocidad(int velocidad) 
	{
		this.velocidad = velocidad;
	}
	//////////////////////////////////////////
	
	//////////////////////////////////////////
	public int getExperiencia() 
	{
		return experiencia;
	}
	public void setExperiencia(int experiencia) 
	{
		this.experiencia = experiencia;
	}
	//////////////////////////////////////////
	
	//////////////////////////////////////////
	public int getSalud() 
	{
		return salud;
	}
	public void setSalud(int salud) 
	{
		this.salud = salud;
	}
	//////////////////////////////////////////
	public Pokemon(String nombre, String tipo, int nivel, int velocidad, int experiencia, int salud) 
	{
		this.nombre = nombre;
		this.tipo = tipo;
		this.nivel = nivel;
		this.velocidad = velocidad;
		this.experiencia = experiencia;
		this.salud = salud;
	}
	
	public abstract void MostrarPokemon();
	
	public abstract void atacar(Pokemon pok);
	
	public static void Examinar(Pokemon pok)
	{
		if(pok.getSalud()<=0)
		{
			pok.setSalud(0);
		}
	}
}
