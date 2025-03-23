package H3;

public class Roca extends Pokemons
{
	private double DensidadRoca;
	
	public Roca(String nombre, String tipo, int nivel, int velocidad, int experiencia, int salud, double DensidadRoca) 
	{
		super(nombre, tipo, nivel, velocidad, experiencia, salud);
		this.DensidadRoca = DensidadRoca;
	}
	
	public double getRoca()
	{
		return DensidadRoca;
	}

	@Override
	public void MostrarPokemon() 
	{
		System.out.println("Nombre: "+getNombre()+" Tipo: "+getTipo()+" Nivel: "+getNivel()+" Velocidad: "+getVelocidad()+" Experiencia: "+getExperiencia()+" Salud: "+getSalud()+" Tamaño Roca: "+getRoca()+" Cm^3");
	}

	@Override
	public String toString() 
	{
		return " Nombre: "+getNombre() +" Nivel: "+getNivel()+" Velocidad: "+getVelocidad()+" Experiencia "+getExperiencia()+" Salud: "+getSalud()+" Tamaño roca: "+getRoca()+ " bares";
	}

	@Override
	public void atacar(Pokemons pok) 
	{
		int daño;
		
		System.out.println(getNombre()+" ataca a "+pok.getNombre());
		daño = (int)((getNivel()*FACTOR_NIVEL_ROCA)+(DensidadRoca*FACTOR_TAMAÑO_ROCA));
		
		if(pok.getClass().getSimpleName() == "Fuego") 
		{
			System.out.println("¡Es super efectivo!");
			daño *= MULTIPLICADOR_VENTAJA;
			pok.setSalud(pok.getSalud()-daño);
			System.out.println(getNombre()+" lanza un ataque tipo roca causando "+ daño + " puntos de daño\n");
		}
		
		else 
		{
			System.out.println("No es muy efectivo");
			daño *= MULTIPLICADOR_DESVENTAJA;
			pok.setSalud(pok.getSalud()-daño);
			System.out.println(getNombre()+" lanza un ataque tipo roca causando "+ daño + " puntos de daño\n");
		}
		
		
	}

}
