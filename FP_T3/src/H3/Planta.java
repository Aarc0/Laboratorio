package H3;

public class Planta extends Pokemons 
{
	private double densidadEsporas;
	
	public Planta(String nombre, String tipo, int nivel, int velocidad, int experiencia, int salud, double densidadEsporas) 
	{
		super(nombre, tipo, nivel, velocidad, experiencia, salud);
		this.densidadEsporas = densidadEsporas;
	}

	public double getDensidadEsporas()
	{
		return densidadEsporas;
	}
	

	@Override
	public void atacar(Pokemons pok) 
	{
		int daño;
		
		System.out.println(getNombre()+" ataca a "+pok.getNombre());
		daño = (int)((getNivel()*FACTOR_NIVEL_PLANTA)+(densidadEsporas*FACTOR_DENSIDAD_ESPORAS));
		
		if(pok.getClass().getSimpleName().equals("Agua")|| pok.getClass().getSimpleName().equals("Roca")) 
		{
			System.out.println("¡Es super efectivo!");
			daño *= MULTIPLICADOR_VENTAJA;
			pok.setSalud(pok.getSalud()-daño);
			System.out.println(getNombre()+" lanza un ataque tipo planta causando "+ daño + " puntos de daño\n");
		}
		
		else 
		{
			System.out.println("No es muy efectivo");
			daño *= MULTIPLICADOR_DESVENTAJA;
			pok.setSalud(pok.getSalud()-daño);
			System.out.println(getNombre()+" lanza un ataque tipo planta causando "+ daño + " puntos de daño\n");
		}
	}
	
	@Override
	public void MostrarPokemon() 
	{
		System.out.println("Nombre: "+getNombre()+" Tipo: "+getTipo()+" Nivel: "+getNivel()+" Velocidad: "+getVelocidad()+" Experiencia: "+getExperiencia()+" Salud: "+getSalud()+" Densidad de esporas: "+getDensidadEsporas()+" esporas/cm^3");
	}

	@Override
	public String toString() 
	{
		return " Nombre: "+getNombre() +" Nivel: "+getNivel()+" Velocidad: "+getVelocidad()+" Experiencia "+getExperiencia()+" Salud: "+getSalud()+" Densidad esporas: "+getDensidadEsporas();
	}
	
}
