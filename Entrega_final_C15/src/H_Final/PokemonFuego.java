package H_Final;

public class PokemonFuego extends Pokemon
{
	private double temperaturaLlama;
	
	
	public PokemonFuego(String nombre, String tipo, int nivel, int velocidad, int experiencia, int salud, double temperaturaLlama) 
	{
		super(nombre, tipo, nivel, velocidad, experiencia, salud);
		this.temperaturaLlama = temperaturaLlama;
	}

	public double getTemperaturaLlama()
	{
		return temperaturaLlama;
	}
	
	@Override
	public void atacar(Pokemon pok) throws PokemonDebilitadoException 
	{
		int daño;

		if(salud <= 0) throw new PokemonDebilitadoException(this);
		System.out.println(getNombre()+" ataca a "+pok.getNombre());
		
		daño = (int)((getNivel()*FACTOR_NIVEL_FUEGO)+(temperaturaLlama*FACTOR_TEMPERATURA_LLAMA));
		
		if(pok.getClass().getSimpleName().equals("PokemonPlanta")) 
		{
			System.out.println("¡Es super efectivo!");
			daño *= MULTIPLICADOR_VENTAJA;
			pok.setSalud(pok.getSalud()-daño);
			System.out.println(getNombre()+" lanza un ataque tipo fuego causando "+ daño + " puntos de daño\n");
		}
		
		else 
		{
			System.out.println("No es muy efectivo");
			daño *= MULTIPLICADOR_DESVENTAJA;
			pok.setSalud(pok.getSalud()-daño);
			System.out.println(getNombre()+" lanza un ataque tipo fuego causando "+ daño + " puntos de daño\n");
		}
	}
	
	@Override
	public void mostrarPokemon() 
	{
		System.out.println("Nombre: "+getNombre()+" Tipo: "+getTipo()+" Nivel: "+getNivel()+" Velocidad: "+getVelocidad()+" Experiencia: "+getExperiencia()+" Salud: "+getSalud()+" Temperatura de la llama: "+getTemperaturaLlama()+"ºC");
	}

	
	@Override
	public String toString() 
	{
		return " Nombre: "+getNombre() +" Salud: "+getSalud();
	}
}
