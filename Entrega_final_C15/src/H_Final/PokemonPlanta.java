package H_Final;

public class PokemonPlanta extends Pokemon 
{
	private double densidadEsporas;
	
	public PokemonPlanta(String nombre, String tipo, int nivel, int velocidad, int experiencia, int salud, double densidadEsporas) 
	{
		super(nombre, tipo, nivel, velocidad, experiencia, salud);
		this.densidadEsporas = densidadEsporas;
	}

	public double getDensidadEsporas()
	{
		return densidadEsporas;
	}
	

	@Override
	public void atacar(Pokemon pok) throws PokemonDebilitadoException 
	{
		int daño;
		
		if(salud <= 0) throw new PokemonDebilitadoException(this);
		System.out.println(getNombre()+" ataca a "+pok.getNombre());
		
		daño = (int)((getNivel()*FACTOR_NIVEL_PLANTA)+(densidadEsporas*FACTOR_DENSIDAD_ESPORAS));
		
		if(pok.getClass().getSimpleName().equals("PokemonAgua")|| pok.getClass().getSimpleName().equals("PokemonRoca")) 
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
	public void mostrarPokemon() 
	{
		System.out.println("Nombre: "+getNombre()+" Tipo: "+getTipo()+" Nivel: "+getNivel()+" Velocidad: "+getVelocidad()+" Experiencia: "+getExperiencia()+" Salud: "+getSalud()+" Densidad de esporas: "+getDensidadEsporas()+" esporas/cm^3");
	}

	@Override
	public String toString() 
	{
		return " Nombre: "+getNombre() +" Salud: "+getSalud();
	}
	
}
