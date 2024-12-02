import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class manejaFichero {
	public static void main(String[] args) throws IOException
	{
		Scanner n = new Scanner(System.in);
		
		String puntos = "puntos.dat";
		//Se define el nombre del fichero y su tipo
		
		File fichero = new File(puntos);
		//Declaro el nombre del fichero
		//Se define que tipo de archivo va a tener la variable "fichero" que va a ser el que tenga "punto"
		
		Scanner leer = new Scanner(fichero);
		//Este Scanner servirá para leer el fichero
		
		PrintWriter salida = new PrintWriter(new FileWriter(puntos));
		//Es necesario para poder escribir en el fichero
		//lo vamos a usar para escribir en el fichero
		
		boolean rep = true;
		
		do
		{
			System.out.print("Introduzca su alias: ");
			String alias = n.next();
			//En esta parte lo unico que hace es decirle al usuario que introduzca su alias
		
			salida.println(alias);
			//Luego en esta parte lo que hace es asociarle lo que el usuario ponga en "alias" a la variable "salida"
			//Que luego lleva esa información al fichero "punto"
		
			System.out.println("\nQuiere introducir más nombres? Sí/no");
			alias = n.next();
			if(alias.charAt(0) == 'S' || alias.charAt(0)=='s')
			{
				rep = true;
			}
			else
			{
				rep = false;
			}
			
			
		}while(rep);
		salida.close();
		
		while(leer.hasNext())
		{
			String alias = leer.next();
			//se usa "leer" en vez de "n" pq se quiere leer el fichero, no introducir algo en él
			
			
			System.out.println(alias);
			//Imprime el fichero
		}
		leer.close();n.close();
		
	}

}
