/*
 * Grupo: Lab_A06
 * Miembro1: Andrés Alejandro Rojas Cardona
 * Miembro2: Jason Armijos Avendaño
 * Miembro3: Alberto José Ramos Fernandez
 * Miembro4: Carlos Ramos Cabañas
 * 
 * Fecha: 9/12/2024
 * Descripción:	Este programa calcula el minimo común divisor de dos numeros que el usuario ingrese. 
 * 
 * Versión: 1.0
 * 
 */

import java.util.*;

public class Comun_divisor 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese de cuales numeros desea calcular el máximo común divisor");
		int N = scan.nextInt();
		int M = scan.nextInt();
		while(M<=N)
		{
			System.out.print("Ingrese un segundo número mayor que el primero: ");
			M = scan.nextInt();
		}
		mcd(N,M);
		
		scan.close();
	}
	public static int mcd(int n, int m)
	{
		int r = m%n;
		if(r == 0)
		{
			System.out.println("El mcd es: " + n);
			return n;
		}
		else
		{
			m = n;
			n = r;
			mcd(n,m);
		}
		return n;
	}
}