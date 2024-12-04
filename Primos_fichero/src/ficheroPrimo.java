/*
 * Grupo: Lab_A06
 * Miembro1: Andrés Alejandro Rojas Cardona
 * Miembro2: Jason Armijos Avendaño
 * Miembro3: Alberto José Ramos Fernandez
 * Miembro4: Carlos Ramos Cabañas
 * 
 * Fecha: 02/112/2024
 * Descripción: El programa crea un fichero en el que almacena muchos numeros aleatorios y luego filtra los numeros
 * 				en otro fichero por si son primos o no, esto lo hace con una función booleana que devuelve true si es primo
 * 				o false si no lo es.
 * Versión: 1.0
 */




import java.io.*;
import java.util.*;
public class ficheroPrimo 
{

	public static void main(String[] args) throws IOException 
	{
		//Metodos para el fichero 
		Scanner n = new Scanner(System.in);
		String nums = "numeros.dat";
		File fichero = new File(nums);
		Scanner leer = new Scanner(fichero);
		PrintWriter salida = new PrintWriter(new FileWriter(nums));
		
		
		boolean i = true;
		int x = 0;
		do 
		{
			salida.println((int)(Math.random()*999999));
			
			x++;
			if(x == 2000)
			{
				i = false;
			}
			
		}while(i);
		salida.close();
		

		i = true;
		
		
		String primos = "primos.dat";
		File prim = new File(primos);
		
		PrintWriter salida2 = new PrintWriter(new FileWriter(primos));
		
		while(leer.hasNext())
		//Aquí leo el fichero original para filtrar los numeros primos que existen dentro de él
		//Para determinar luego si un numero es primo o no uso la función construida en sesiones anteriores
		//para filtrar numeros primos
		{
			String numeros = leer.next();
			int pri = Integer.valueOf(numeros);
			boolean b = func(pri);
			if(b)
			{
				salida2.println(pri);

			}
			else
			{
				i = true;
			}
			
		}
		salida2.close();
		n.close();
		leer.close();	
	}
	public static boolean func(int i)
	{
		boolean b = true;
		for(int z = 2; z<i;z++)
		{
			if(i%z == 0)
			{
				b = false;
				break;
			}
		}
		return b;
	}
}
