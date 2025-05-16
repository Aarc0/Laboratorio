package H_Final;

public class PokemonAgua extends Pokemon 
{
	private double presionAgua;
	
	public PokemonAgua(String nombre, String tipo, int nivel, int velocidad, int experiencia, int salud, double presionAgua) 
	{
		super(nombre, tipo, nivel, velocidad, experiencia, salud);
		this.presionAgua = presionAgua;
	}

	public double getPresionAgua()
	{
		return presionAgua;
	}

	@Override
	public void atacar(Pokemon pok) throws PokemonDebilitadoException
	{
		int daño;
		
		if(salud <= 0) throw new PokemonDebilitadoException(this);
		System.out.println(getNombre()+" ataca a "+pok.getNombre());
		
		
		daño = (int)((getNivel()*FACTOR_NIVEL_AGUA)+(presionAgua*FACTOR_PRESION_AGUA));
		
		if((pok.getClass().getSimpleName().equals("PokemonFuego")) || (pok.getClass().getSimpleName().equals("PokemonRoca"))) 
		{
			System.out.println("¡Es super efectivo!");
			daño *= MULTIPLICADOR_VENTAJA;
			pok.setSalud(pok.getSalud()-daño);
			System.out.println(getNombre()+" lanza un ataque tipo agua causando "+ daño + " puntos de daño\n");
		}

		else 
		{
			System.out.println("No es muy efectivo");
			daño *= MULTIPLICADOR_DESVENTAJA;
			pok.setSalud(pok.getSalud()-daño);
			System.out.println(getNombre()+" lanza un ataque tipo agua causando "+ daño + " puntos de daño\n");
		}
	}

	@Override
	public void mostrarPokemon() 
	{
		System.out.println("Nombre: "+getNombre()+" Tipo: "+getTipo()+" Nivel: "+getNivel()+" Velocidad: "+getVelocidad()+" Experiencia: "+getExperiencia()+" Salud: "+getSalud()+" Presión del agua: "+getPresionAgua()+" bares");
	}

	@Override
	public String toString() 
	{
		return " Nombre: "+getNombre() +" Salud: "+getSalud();
	}
	
	

	
	
}
