/*
 * Grupo: Lab_A06
 * Miembro1: Andrés Alejandro Rojas Cardona
 * Miembro2: Jason Armijos Avendaño
 * Miembro3: Alberto José Ramos Fernandez
 * Miembro4: Carlos Ramos Cabañas
 * 
 * Fecha: 11/11/2024
 * Descripción: El programa consiste en analizar un rango de numeros (desde el numero 1 hasta el numero que ingrese el usuario) 
 * e imprimir los numeros primos que haya entre 1 y el numero indicado por el usuario.  
 * Versión: 1.0
 * 
 */

import java.util.*;


public class CuentaPrimos 
{
	public static void main(String[] args) 
	{
		Scanner n = new Scanner(System.in);
		System.out.println("Ingrese el numero hasta el cual se quieran contar los numeros primos que hay: ");
		int num = n.nextInt();
		boolean a = true;
		int p = 0;
		int np = 0;
		for(int j = 1;j<=num;j++)
		{
			if(j == 1) a = false;
			for(int i = 2; i<j;i++)
			{
				if(j%i==0)
				{
					a = false;
					break;
				}
				
			}
			if (a == true)
			{
				System.out.print(j+"-");
				p++;
			}
			else if (a == false)
			{
				np++;
				a = true;
			}
			
		}
		System.out.println("\nHay "+p + " numeros primos" );
		System.out.println("Hay "+np + " numeros que no son primos entre estos numeros" );
		n.close();
	}
}