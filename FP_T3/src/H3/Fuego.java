package H3;

public class Fuego extends Pokemons
{
	private double temperaturaLlama;
	
	
	public Fuego(String nombre, String tipo, int nivel, int velocidad, int experiencia, int salud, double temperaturaLlama) 
	{
		super(nombre, tipo, nivel, velocidad, experiencia, salud);
		this.temperaturaLlama = temperaturaLlama;
	}

	public double getTemperaturaLlama()
	{
		return temperaturaLlama;
	}
	
	@Override
	public void atacar(Pokemons pok) 
	{
		int daño;
		
		System.out.println(getNombre()+" ataca a "+pok.getNombre());
		daño = (int)((getNivel()*FACTOR_NIVEL_FUEGO)+(temperaturaLlama*FACTOR_TEMPERATURA_LLAMA));
		
		if(pok.getClass().getSimpleName().equals("Planta")) 
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
	public void MostrarPokemon() 
	{
		System.out.println("Nombre: "+getNombre()+" Tipo: "+getTipo()+" Nivel: "+getNivel()+" Velocidad: "+getVelocidad()+" Experiencia: "+getExperiencia()+" Salud: "+getSalud()+" Temperatura de la llama: "+getTemperaturaLlama()+"ºC");
	}

	
	@Override
	public String toString() 
	{
		return " Nombre: "+getNombre() +" Nivel: "+getNivel()+" Velocidad: "+getVelocidad()+" Experiencia "+getExperiencia()+" Salud: "+getSalud()+" Temperatura de la llama: "+getTemperaturaLlama();
	}
}
