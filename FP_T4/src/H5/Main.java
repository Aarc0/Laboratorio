package H5;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		//Variable para leer archivos
		Scanner leer;
		
		//Gimnasios
		Gimnasio [] gym;
		
		//Entrenadores
		Entrenador [] Ent = new Entrenador[3];
		
		//Ficheros
		String pkb;
		String poke;
		
		//Para poder llegar al fichero que queremos es necesario establecer la ruta a él

		//Ordenador principal
		pkb = "C:/Users/andre/git/Laboratorio/FP_T4/pokeballs.txt";
		poke = "C:/Users/andre/git/Laboratorio/FP_T4/pokemons.txt";
		
		//Portatil
		//pkb = "C:/Users/Andres/Desktop/Laboratorio/FP_T4/pokeballs.txt";
		//poke = "C:/Users/Andres/Desktop/Laboratorio/FP_T4/pokemons.txt";
		
		//Creamos primero los dos gimnasios que se nos piden
		gym = new Gimnasio[2];
		gym[0] = new Gimnasio(Equipo.Neutral, "Ciudad A");
		gym[1] = new Gimnasio(Equipo.Neutral, "Ciudad B");
		
		try 
		{
			//Con esta parte asigno las pkballs
			leer = new Scanner(new FileReader(pkb));
			for (int i = 0; i < Ent.length; i++) 
			{
				Ent[i] = new Entrenador(Nombre.values()[i],1,cargarPokeballs(leer),Equipo.values()[i+1]);
			}
			leer.close();
			//Con esta parte traigo las pkballs a un array para manejarlas de manera más sencilla
			leer = new Scanner(new FileReader(poke));
			//Aquí le estoy pasando el archivo por referencia
			Pokemon [] pok = cargarPokemons(leer);			
			
			System.out.println("\n=== CAPTURA DE LOS POKEMON ===");
			atraparPokemon(pok,Ent);
			
			System.out.println("\n=== DEJAR POKEMON EN LOS GYM ===");
			dejarPokemon(gym,Ent);
			
			System.out.println("\n=== ATACAR GIMNASIO ===");
			atacarGimnasio(Ent[2],gym);
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
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
	
	public static boolean comprobarEntrenador(Entrenador E)
	{
		boolean b = false;
		boolean t;
		//Si el entrenador puede tener más pokemon en su equipo vuelve b verdadero
		if(E.sizeEquipo()<6)
		{
			b = true;
		}
		//Si el entrenador tiene pkballs disponibles vuelve t verdadero, si no lanzamos excepción
		t = E.comprobarPokeballs();
		
		//Si ambas son verdadero el entrenador es apto para capturar pokemons
		if(b&&t)
		{
			return true;
		}
		return false;	
	}
	
	public static boolean entrenadoresDisponibles(Entrenador []E)
	{
		/*
		 * Flujo:
		 * Primero compruebo a un entrenador
		 * Si el entrenador es apto sigo sin problema
		 * Si no es apto tengo un contador que lo que hace es contar si j es igual al numero de entrenadores
		 * Si J es igual al numero de entrenadores significa que ningun entrenador es apto por lo que tiene que devolver verdadero
		 * Si J no lo es significa que algún entrenador es apto por lo que devuelve falso
		 */
		boolean b;
		int j = 0;
		for (int i = 0; i < E.length; i++) 
		{
			//Primero compruebo al entrenador
			b = comprobarEntrenador(E[i]);
			
			//Si b es verdadero significa que el entrenador es apto
			//Si b es falso no es apto
			if(b == false) j++;
		}
		
		if(j==E.length) 
		{
			System.err.println("NINGÚN ENTRENADOR ES APTO PARA REALIZAR LA CAPTURA DE POKEMON");
			return true;
		}
		else return false;
	}
	
	public static void atraparPokemon(Pokemon[] pok,Entrenador[]Ent)
	{
		boolean b = false;
		boolean t = false;
		int j = 0;
		//Este bucle me servirá para iterar entre los pokemons 
		for (int i = 0; i < pok.length && t ==false; i++) 
		{
			//Esto me sirve para comprobar si un entrenador específico puede o no atrapar pokemons
			for (; j < Ent.length && t ==false; j++) 
			{
				//Esto comprueba si el entrenador es apto(verdadero) o no apto(falso) para capturar pokemon
				b = comprobarEntrenador(Ent[j]);
				
				//Caso de que el entrenador sea apto
				if(b)
				{
					Ent[j].captura(pok[i]);
				}
				else
				{
					//Lo que sucede es que si todos los entrenadores dejan de estar disponibles entra en un bucle infinito
					//Con esta nueva función deja ese bucle
					t = entrenadoresDisponibles(Ent);
				}
				//Si el pokemon tiene entrenador se sale del primer bucle para cambiar de pokemon
				if(pok[i].getEntrenador()!=null) 
				{
					//Primero valoro si estoy en el último entrenador, y si es así vuelvo al primero
					if(j==2) j = 0;
					
					//En cambio si estoy en otro, avanzo al siguiente
					else j++;
					break;
				}
				if(pok[i].getEntrenador()==null && j == 2) j = -1;
			}
		}
	}
	
	public static void atacarGimnasio(Entrenador atacante, Gimnasio[] gym)
	{
		//String combates = "C:/Users/andre/git/Laboratorio/FP_T4/log.txt";
		String combates = "log.txt";
		File fichero = new File(combates);
		try 
		{
			PrintWriter salida = new PrintWriter(new FileWriter(combates));
			
			for (int i = 0; i < gym.length; i++) 
			{
				atacante.atacarGimnasio(gym[i], salida);
			}
			
			salida.close();
		}
		catch(FileNotFoundException e)
		{
			e.getMessage();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
}
