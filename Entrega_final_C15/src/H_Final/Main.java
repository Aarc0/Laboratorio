package H_Final;
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
		String combates = "log.txt";
		File fichero = new File(combates);
		
		
		//Variable para provocar excepciones
		Scanner exception = new Scanner(System.in);
		
		//Gimnasios
		Gimnasio [] gym;
		
		//Entrenadores
		Entrenador [] Ent = new Entrenador[5];
		Ent[0] = new Entrenador(Nombre.values()[0],1,Equipo.values()[1]);
		Ent[1] = new Entrenador(Nombre.values()[1],1,Equipo.values()[3]);
		Ent[2] = new Entrenador(Nombre.values()[2],1,Equipo.values()[1]);
		Ent[3] = new Entrenador(Nombre.values()[3],1,Equipo.values()[2]);
		Ent[4] = new Entrenador(Nombre.values()[4],1,Equipo.values()[3]);

		//Ficheros
		String pkb;
		String poke;
		
		//Para poder llegar al fichero que queremos es necesario establecer la ruta a él

		//Ordenador principal
		pkb = "C:/Users/andre/git/Laboratorio/Entrega_final_C15/pokeballs2.txt";
		poke = "C:/Users/andre/git/Laboratorio/Entrega_final_C15/pokemons3.txt";
		

		
		//Creamos primero los dos gimnasios que se nos piden
		gym = new Gimnasio[5];
		gym[0] = new Gimnasio(Equipo.Neutral, "Ciudad A");
		gym[1] = new Gimnasio(Equipo.Neutral, "Ciudad B");
		gym[2] = new Gimnasio(Equipo.Neutral, "Ciudad C");
		gym[3] = new Gimnasio(Equipo.Neutral, "Ciudad D");
		gym[4] = new Gimnasio(Equipo.Neutral, "Ciudad E");
		
		try 
		{
			PrintWriter salida = new PrintWriter(new FileWriter(fichero));
			
			//Con esta parte asigno las pkballs
			leer = new Scanner(new FileReader(pkb));
			for (int i = 0; i < Ent.length; i++) 
			{
				Ent[i].setPkb((cargarPokeballs(leer)));
			}
			leer.close();
			//Con esta parte traigo las pkballs a un array para manejarlas de manera más sencilla
			leer = new Scanner(new FileReader(poke));
			//Aquí le estoy pasando el archivo por referencia
			Pokemon [] pok = cargarPokemons(leer);			
			
			System.out.println("\n=== FASES DE CAPTURA DE LOS POKEMON ===");
			atraparPokemon(pok,Ent);
			
			System.err.println("\n===PROVOCANDO EXCEPCIONES===");
			/*System.out.println("Ingresar numero de entrenador con pokemons llenos: ");
			Pokemon pokprueba = new PokemonAgua("Prueba","Agua",101,101,101,101,101);
			Ent[exception.nextInt()].captura(pokprueba);*/
			
			try 
			{
				System.out.println(Ent[0].getPoke(100));
			}
			catch(PokemonNoDisponibleException e)
			{
				e.mostrarE1();
			}
			
			System.out.println("==GIMNASIO 1===");
			System.out.println("\n===HACER QUE EL ENTRENADOR (ROJO) DEJE SU POKÉMON EN POSICIÓN 0 DE SU EQUIPO===");
			Ent[0].dejarPokemonEspecifico(gym[0],0);
			
			System.out.println("\n===Intentar que el segundo entrenador (AMARILLO) deje su Pokémon en posición 0, lo que provocará EquipoIncorrectoException===");
			Ent[1].dejarPokemonEspecifico(gym[0],0);
			
			System.out.println("===Hacer que el primer entrenador (ROJO) deje su Pokémon en posición 1===");
			Ent[0].dejarPokemonEspecifico(gym[0],1);
			
			System.out.println("===Hacer que el tercer entrenador (ROJO) intente dejar su Pokémon en posición 0, su Pokémon en posición 1, y finalmente su Pokémon en posición 2===");
			Ent[2].dejarPokemonEspecifico(gym[0],0);
			
			//Desde aquí salta la excepción pq el gimnasio tiene una capacidad máxima de 3 pokemon y ya han dejado 2 pok ash y 1 pok misty
			Ent[2].dejarPokemonEspecifico(gym[0],1);
			Ent[2].dejarPokemonEspecifico(gym[0],2);
			
			
			System.out.println("===GIMNASIO 2 ===");
			System.out.println("===Hacer que el segundo entrenador (AMARILLO) deje sus Pokémon en posiciones 0, 1 y 2 de su equipo.===");
			Ent[1].dejarPokemon(gym[1]);
			
			System.out.println("===GIMNASIO 3===");
			System.out.println("Hacer que el tercer entrenador (ROJO) deje su Pokémon en posición 2 de su array equipo.");
			Ent[2].dejarPokemonEspecifico(gym[2],2);
			System.out.println("Hacer que el primer entrenador (también ROJO) deje sus Pokémon en posiciones 2 y 3 de su equipo.");
			Ent[0].dejarPokemonEspecifico(gym[2],2);
			Ent[0].dejarPokemonEspecifico(gym[2],2);
			
			System.out.println("===GIMNASIO 4===");
			System.out.println("Hacer que el cuarto entrenador (AZUL) deje sus Pokémon en posiciones 0 y 1 de su equipo (dejando una posición vacía en el gimnasio).");
			Ent[3].dejarPokemonEspecifico(gym[3],0);
			Ent[3].dejarPokemonEspecifico(gym[3],1);
			
			System.out.println("===GIMNASIO 5===");
			System.out.println("Hacer que el quinto entrenador (AMARILLO) deje sus Pokémon en posiciones 0,	1 y 2 de su equipo.");
			Ent[4].dejarPokemon(gym[4]);
			
			
			System.out.println("===COMBATES ENTRE GIMNASIOS===");
			System.out.println("El entrenador AMARILLO (segundo) ataca el gimnasio 1 (ROJO).");
			atacarGimnasioEspecifico(Ent[1],gym[0],salida);
			
			System.out.println("El entrenador ROJO (tercero) ataca el gimnasio 2 (AMARILLO).");
			atacarGimnasioEspecifico(Ent[2],gym[1],salida);
			
			System.out.println("El entrenador AZUL (cuarto) ataca el gimnasio 3 (ROJO).");
			atacarGimnasioEspecifico(Ent[3],gym[2],salida);
			
			System.out.println("El entrenador ROJO (primero) ataca el gimnasio 5 (AMARILLO).");
			atacarGimnasioEspecifico(Ent[0],gym[4],salida);
			
			System.out.println("El entrenador AMARILLO (quinto) ataca el gimnasio 4 (AZUL)");
			atacarGimnasioEspecifico(Ent[4],gym[3],salida);

			
			System.out.println("Crear un sexto entrenador que tenga menos de 3 Pokémon e intentar que ataque alguno de los gimnasios. ");
			Entrenador E_prueba = new Entrenador(Nombre.Prueba,0,Equipo.Amarillo);
			
			Pokeball[] PKB_prueba = new Pokeball[1];
			PKB_prueba[0] = new MasterBall(0.8);
			E_prueba.setPkb(PKB_prueba);
			
			Pokemon[] POK_pruebas = new Pokemon[1];
			POK_pruebas[0] = new PokemonAgua("prueba","prueba",2000,2000,2000,2000,2000);
			
			E_prueba.captura(POK_pruebas[0]);
			
			E_prueba.atacarGimnasio(gym[0], salida);
			salida.close();
			
			System.out.println("==== PRUEBA POKEMONDEBILITADOEXCEPTION ===");
			for (int i = 0; i < Ent.length; i++) 
			{
				Ent[i].atacarPokemonEspecifico(POK_pruebas[0]);
			}
			
			System.out.println("\n\n===Mostrar el estado de todos los entrenadores, sus Pokémon y pokeballs restantes.===");
			for (int i = 0; i < Ent.length; i++) 
			{
				System.out.println(Ent[i].toString());
			}
			
			System.out.println("\nMostrar el estado actual de todos los gimnasios, incluyendo equipo controlador y defensores.");
			for (int i = 0; i < Ent.length; i++) 
			{
				System.out.println(gym[i].toString());
			}
			System.err.println("\nACLARACIÓN: Los gimnasios que aparecen sin defensores es que a lo largo de las batallas estos han ido siendo derrotados y por consiguiente se han quitado de los gimnasios");
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e1) 
		{
			e1.printStackTrace();
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
		Pokemon [] poke = new Pokemon[27];
		int x = 0;
		
		while(leer.hasNext()&&x<27) 
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
		//Contador de entrenadores
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
					if(j==Ent.length-1) j = 0;
					
					//En cambio si estoy en otro, avanzo al siguiente
					else j++;
					break;
				}
				if(pok[i].getEntrenador()==null && j == Ent.length-1) j = -1;
			}
		}
	}
	
	public static void atacarGimnasioSecuencial(Entrenador atacante, Gimnasio[] gym)
	{
		String combates = "log.txt";
		File fichero = new File(combates);
		try 
		{
			PrintWriter salida = new PrintWriter(new FileWriter(fichero));
			
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

	
	//Este tiene una mayor utilidad que el secuencial ya que el anterior estaba hecho para un caso hipotético que seguramente nunca llegue a pasar en la vida real
	public static void atacarGimnasioEspecifico(Entrenador atacante, Gimnasio gym, PrintWriter salida)
	{
		atacante.atacarGimnasio(gym, salida);		
	}
	
}
