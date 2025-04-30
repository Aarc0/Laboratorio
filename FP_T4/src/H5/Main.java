package H5;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		//Variables varias
		Scanner leer;
		Equipo equipo;
		Nombre nom;
		
		//Gimnasios
		Gimnasio G1;
		Gimnasio G2;
		
		//Entrenadores
		Entrenador [] Ent = new Entrenador[3];
		
		//Ficheros
		String pkb;
		String poke;
		
		//Para poder llegar al fichero que queremos es necesario establecer la ruta a él
		pkb = "C:/Users/Andres/Desktop/Laboratorio/FP_T4/pokeballs.txt";
		poke = "C:/Users/Andres/Desktop/Laboratorio/FP_T4/pokemons.txt";
		
		System.out.println("== Inicializando el mundo Pokémon ==\n");
		
		//Creamos primero los dos gimnasios que se nos piden
		Gimnasio [] gym = new Gimnasio[2];
		gym[0] = new Gimnasio(null, "Ciudad A");
		gym[1] = new Gimnasio(null, "Ciudad B");
		
		try 
		{
			leer = new Scanner(new FileReader(pkb));
			for (int i = 0; i < Ent.length; i++) 
			{
				Ent[i] = new Entrenador(Nombre.values()[i],1,cargarPokeballs(leer),Equipo.values()[i+1]);
			}
			leer.close();
			leer = new Scanner(new FileReader(poke));

			//Aquí le estoy pasando el archivo por referencia
			int x = 0;

			Pokemon [] pok = cargarPokemons(leer);
			for (int i = 0; i < pok.length; i++) 
			{
				while(pok[i].getEntrenador()==null)
				{
					Ent[x].captura(pok[i]);
					x++;
					if(x==3) x = 0;
				}
			}
			System.out.println("Hola");
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("=== FINALIZACIÓN DEL MUNDO POKEMON ===");

	}
	public static Pokeball[] cargarPokeballs(Scanner leer)
	{
		Pokeball[] pkbE = new Pokeball[10];			
		
		//Con esa variable itero entre los espacios del array que guarda las pokeballs del entrenador
		int x = 0;
		
		while(leer.hasNext() && x < 10)
		{
			//Aquí leo la linea completa
			String separar_espacios = leer.nextLine();
			
			//Luego separo por espacios
			String [] separado = separar_espacios.split(" ");
				
			// separado[0] contiene el tipo de pokeball
			// separado[1] contiene la integridad o la estabilidad
			
			if(separado[0].equals("Pokeball")) 
			{
				pkbE[x] = new Pokeball(Integer.valueOf(separado[1]));
			}
			else if(separado[0].equals("MasterBall")) 
			{
				pkbE[x] = new MasterBall(Double.valueOf(separado[1]));
			}
			else if(separado[0].equals("SuperBall")) 
			{
				pkbE[x] = new SuperBall(Integer.valueOf(separado[1]));
			}
			else if(separado[0].equals("UltraBall")) 
			{
				pkbE[x] = new UltraBall(Integer.valueOf(separado[1]));
			}
			
			x++;
		}
		return pkbE;
	}
	
	public static Pokemon[] cargarPokemons(Scanner leer)
	{
		Pokemon [] poke = new Pokemon[17];
		int x = 0;
		
		while(leer.hasNext()&&x<17) 
		{
			String separar_espacios = leer.nextLine();
			String [] separado = separar_espacios.split(" ");
			
			String nombre = separado[0];
			String tipo = separado[1];
			int nivel = Integer.valueOf(separado[2]);
			int velocidad = Integer.valueOf(separado[3]);
			int experiencia = Integer.valueOf(separado[4]);
			int salud = Integer.valueOf(separado[5]);
			double Atributo = Integer.valueOf(separado[6]);
			
			if(separado[1].equals("Agua")) 
			{
				poke[x] = new PokemonAgua(nombre,tipo,nivel,velocidad,experiencia,salud,Atributo);
			}
			else if(separado[1].equals("Fuego"))
			{
				poke[x] = new PokemonFuego(nombre,tipo,nivel,velocidad,experiencia,salud,Atributo);
			}
			else if(separado[1].equals("Planta"))
			{
				poke[x] = new PokemonPlanta(nombre,tipo,nivel,velocidad,experiencia,salud,Atributo);
			}
			x++;
		}
		return poke;
	}
	
	public static void dejarPokemon(Gimnasio []G,Entrenador[]E)
	{
		for (int i = 0; i < E.length-1; i++) 
		{
			E[i].dejarPokemon(G[i]);
		}
	}
}
