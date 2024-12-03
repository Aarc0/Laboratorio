import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class manejaFichero 
{
	public static void main(String[] args) throws IOException
	{
		Scanner n = new Scanner(System.in);
		
		//Se define el nombre del fichero y su tipo
		String puntos = "puntos.dat";
		
		File fichero = new File(puntos);
		//Declaro el nombre del fichero
		//Se define que tipo de archivo va a tener la variable "fichero" que va a ser el que tenga "punto"
		
		
		Scanner leer = new Scanner(fichero);
		//Este Scanner servirá para leer el fichero
		
		PrintWriter salida = new PrintWriter(new FileWriter(puntos));
		//Es necesario para poder escribir en el fichero
		
		boolean rep = true;
		int i = 0;
		do
		{
			System.out.print("Introduzca su alias: ");
			String alias = n.next();
			//En esta parte lo unico que hace es decirle al usuario que introduzca su alias
			int num = (int)(Math.random()*999999);
			salida.println(alias + ";" + num);
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
			i++;
		}while(rep);
		salida.close();
		


		
		int z = 0;
		String[] nom = new String[i];
		String[] num = new String[i];
		while(leer.hasNext())
			
		//Evalua si el scanner "leer" tiene siguiente valor
		{
			String separado = leer.next();
			//Esto guarda los datos enteros, nombre, numero
			String []separado1 = separado.split(";");
			
			nom[z] = separado1[0];
			num[z] = separado1[1];
			System.out.println(">"+nom[z]+" = "+num[z]);
			z++;
			//Aqui lo que hago es pasar del fichero a la memoria para manejar el array
			
		}
		
		
		
		n.close();leer.close();
	}
}