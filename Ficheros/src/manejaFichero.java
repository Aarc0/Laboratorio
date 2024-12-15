/*
 * Grupo: Lab_A06
 * Miembro1: Andrés Alejandro Rojas Cardona
 * Miembro2: Jason Armijos Avendaño
 * Miembro3: Alberto José Ramos Fernandez
 * Miembro4: Carlos Ramos Cabañas
 * 
 * Fecha: 02/12/2024
 * Descripción: El programa le pide al usuario que ingrese un alias de usuario, a este alias luego se le asigna un valor,
 * 				el proyecto consistia en filtrar estos alias por el que tenía mayor puntuación, luego se indica cual es el alias
 * 				con el mayor valor y lo muestra en pantalla.
 * Versión: 1.0
 */

import java.util.Scanner;
import java.io.File;
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
		int guardar = 0;
		int index = 0;
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
			//Aqui lo que hago es pasar del fichero a la memoria para manejar el array

			int punto = Integer.valueOf(separado1[1]);
			if(punto > guardar)
			{
				guardar = punto;
				index = z;
			}
			z++;
		}
		System.out.println("El alias " + nom[index]+" tiene la puntuación más alta con "+num[index]+" puntos" );
		
		n.close();leer.close();
	}
}