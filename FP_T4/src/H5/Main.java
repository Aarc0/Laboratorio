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
		Entrenador [] entrenadores = new Entrenador[3];
		
		//Ficheros
		String pkb;
		String poke;
		
		//Para poder llegar al fichero que queremos es necesario establecer la ruta a él
		pkb = "C:/Users/andre/OneDrive/Escritorio/Programas_Eclipse/FP_T4/pokeballs.txt";
		poke = "C:/Users/andre/OneDrive/Escritorio/Programas_Eclipse/FP_T4/pokemons.txt";
		
		System.out.println("== Inicializando el mundo Pokémon ==\n");
		
		//Creamos primero los dos gimnasios que se nos piden
		G1 = new Gimnasio(null, "Ciudad A");
		G2 = new Gimnasio(null, "Ciudad B");
		
		try 
		{
			leer = new Scanner(new FileReader(pkb));
			for (int i = 0; i < entrenadores.length; i++) 
			{
				entrenadores[i] = new Entrenador(Nombre.values()[i],1,cargarPokeballs(leer),Equipo.values()[i+1]);
			}
			leer.close();
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
		
		
		while(leer.hasNext())
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
			if(x == 10)
			{
				break;
			}
		}
		return pkbE;
	}
}
