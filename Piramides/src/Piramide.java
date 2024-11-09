/*
 * Grupo: Lab_A06
 * Miembro1: Andrés Alejandro Rojas Cardona
 * Miembro2: Jason Armijos Avendaño
 * Miembro3: Alberto José Ramos Fernandez
 * Miembro4: Carlos Ramos Cabañas
 * 
 * Fecha: 11/11/2024
 * Descripción: El programa imprime un patron en forma de piramide con tantas filas como ingrese el usuario   
 * Versión: 1.0
 * 
 */

import java.util.*;

public class Piramide 
{
	public static void main(String[] args) 
	{
		Scanner n = new Scanner(System.in);
		System.out.print("Ingrese el numero de filas que tendrá la pirámide: ");
		int filas = n.nextInt();
		System.out.print("\n");
		int it = filas;
		//Se crea el contador inverso de los espacios que hay entre las filas y la pared imaginaria de la izquierda
		for(int i = 1; i<=filas;i++)
		{	
			for(int k = 1; k<it; k++)
			{
				System.out.print(" ");
				//Recorre los espacios hasta llegar un espacio antes de la posicion a la que va a estar el primer asterisco
			}
			for(int j = 1; j<=(i*2)-1;j++)
			{
				System.out.print("*");
				/*Este bucle imprime el numero de asteriscos correspondiente a la fila en la que se encuentra
				  el numero de asteriscos es la fila, por dos menos 1*/
			}
			System.out.print("\n");
			
			it--;
			//Le resta uno al numero de espacios que hay que recorrer.
		}
		n.close();
	}
	
}
