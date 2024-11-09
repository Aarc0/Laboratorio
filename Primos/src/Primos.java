/*
 * Grupo: Lab_A06
 * Miembro1: Andrés Alejandro Rojas Cardona
 * Miembro2: Jason Armijos Avendaño
 * Miembro3: Alberto José Ramos Fernandez
 * Miembro4: Carlos Ramos Cabañas
 * 
 * Fecha: 11/11/2024
 * Descripción: El programa consiste en analizar el numero que ingresa el usuario y diferencia entre si es primo o no.   
 * Versión: 1.0
 * 
 */

import java.util.Scanner;

public class Primos 
{

	public static void main(String[] args) 
	{
		Scanner n = new Scanner(System.in);
		boolean a = true;
		System.out.println("Ingrese un número");
		int num = n.nextInt();
		if(num < 0)
		{
			num = -num;
			System.out.println("No hay numeros primos negativos, tu numero será convertido a positivo: " +num);
		}
		if(num==1 || num == 0)
		{
			System.out.println("El número " +num+ " no es primo");
			n.close();
			return;
		}
		for(int i = 2; i<num; i++)
		{	
			if(num%i == 0)
			{
				a = false;
				break;
			}
		}
		if (a == true)
		{
			System.out.println(num+" es primo");
		}
		else if (a == false)
		{
			System.out.println(num+" no es primo");
		}
		n.close();
	}
}
