package H2;

public class Entrenador 
{
	private Pokemons [] poke;
	private Pokeball [] pkb;
	private int nivel;
	private String nombre;
	
	//Pongo esta variable para saber los pokemons atrapados que tengo
	private static int pat = 0;
	
	public Entrenador(String nombre, int nivel, Pokeball[] pkb ) 
	{
		this.poke = new Pokemons[6];
		this.pkb = pkb;
		this.nombre = nombre;
		this.nivel = nivel;
	}

	//////////////////////////////////////////
	public Pokemons[] getPoke() 
	{
		return poke;
	}

	public void setPoke(Pokemons poke, int i) 
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
	
	public boolean Captura(Pokemons poke, int i)
	{			
		//Para saber si fue atrapado o no
		boolean b;	
		
		//Condición que pongo para que el código se ejecute mientras el equipo no esté lleno
		if(Entrenador.pat<6) 
		{
			//Si la integridad es mayor a 0 entra
			if(pkb[i].getIntegridad()>0)
			{
				//Si atrapa al pokemon "b" se hace verdadero
				
				//Llama al método de la pokeball "Captura" y le paso como parametro un solo pokemon 
				b = pkb[i].Captura(poke);
				if(b)
				{
					setPoke(poke,Entrenador.pat);
					Entrenador.pat++;
				}
			}
			//Si no es mayor a 0 devuelve falso lo que significa que no hay integridad
			else
			{
				return false;
			}
		}
		else System.out.println("\nNo hay espacio para capturar a "+poke.getNombre()+", tienes el equipo lleno");
		
		//Para todo lo demás devuelve verdadero
		return true;
	}
	public void MostrarPoks()
	{
		System.out.println("\n\n===Estado final de los Pokemons de "+getNombre()+"===");
		int i = 0;
		while(i<poke.length)
		{
			if(poke[i] == null) break;
			System.out.println("Nombre: "+poke[i].getNombre()+" Tipo: "+poke[i].getTipo()+" Nivel: "+poke[i].getNivel()+" Velocidad: "+poke[i].getVelocidad()+" Experiencia: "+poke[i].getExperiencia()+" Salud: "+poke[i].getSalud());
			i++;
		}
	}
}
