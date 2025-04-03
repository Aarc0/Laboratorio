package H4;

public class Entrenador 
{
	private Pokemon [] poke;
	private Pokeball [] pkb;
	private int nivel;
	private String nombre;
	private Equipo equipo;
	
	//Pongo esta variable para saber los pokemons atrapados que tengo
	private int pat = 0;
	
	//Esta variable controla los pokemon que se dejan
	private int pod = 0;
	
	public Entrenador(String nombre, int nivel, Pokeball[] pkb, Equipo equipo) 
	{
		this.poke = new Pokemon[6];
		this.pkb = pkb;
		this.nombre = nombre;
		this.nivel = nivel;
		this.equipo = equipo;
	}

	//////////////////////////////////////////
	public Pokemon[] getPoke() 
	{
		return poke;
	}

	public void setPoke(Pokemon poke, int i) 
	{
		this.poke[i] = poke;
	}
	//////////////////////////////////////////
	
	//////////////////////////////////////////
	public Pokeball[] getPkb() 
	{
		return pkb;
	}

	public void setPkb(Pokeball[] pkb) 
	{
		this.pkb = pkb;
	}
	//////////////////////////////////////////
	
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
	public Equipo getEquipo() 
	{
		return equipo;
	}
	public void setEquipo(Equipo equipo) 
	{
		this.equipo = equipo;
	}
	//////////////////////////////////////////
	
	public void Captura(Pokemon poke)
	{			
		//Para saber si fue atrapado o no
		boolean b;	
		int i;
		
		//Busca la pokeball con integridad mayor que 0
		for(i = 0;i<pkb.length;i++)
		{
			if(pkb[i].getIntegridad()>0) break;
		}
		
		//Condición que pongo para que el código se ejecute mientras el equipo no esté lleno
		if(pat<6) 
		{
			//Si la integridad es mayor a 0 entra

			//Si atrapa al pokemon "b" se hace verdadero
			
			//Llama al método de la pokeball "Captura" y le paso como parametro un solo pokemon 
			b = pkb[i].Captura(poke);
			if(b)
			{
				setPoke(poke,pat);
				pat++;
			}
		}
		else System.out.println("\nNo hay espacio para capturar a "+poke.getNombre()+", tienes el equipo lleno");
	}

	public void MostrarPoks()
	{
		System.out.println("\n\nEl entrenador "+getNombre()+" tiene los siguientes pokemon:");
		int i = 0;
		while(i<poke.length)
		{
			if(poke[i] == null) break;
			System.out.println("Nombre: "+poke[i].getNombre()+" Tipo: "+poke[i].getTipo()+" Nivel: "+poke[i].getNivel()+" Velocidad: "+poke[i].getVelocidad()+" Experiencia: "+poke[i].getExperiencia()+" Salud: "+poke[i].getSalud());
			i++;
		}
	}
	
	//Lanza la excepción para arriba, es decir hasta donde se llamo
	//En este caso yo la voy a llamar desde el MAIN
	public void DejarPokemon(Gimnasio gym) throws EquipoIncorrecto 
	{
		//Si el equipo es distinto y además el gimnasio no es nulo lanzo la excepsión
		if(gym.getEquipo() != equipo && gym.getEquipo() != null) throw new EquipoIncorrecto(gym.getEquipo());
		//Si no son las condiciones anteriores dejo el pokemon y además seteo el equipo del gimnasio
		else
		{
			gym.setEquipo(equipo);
			gym.setPok(poke[pod], pod);
			pod++;
		}
	}
	
	public void Atacar(Gimnasio gym)
	{
		int i = 0;
		while(i<poke.length-3) 
		{
			poke[i].atacar(gym.getPok(i));
			
		}
	}
}
