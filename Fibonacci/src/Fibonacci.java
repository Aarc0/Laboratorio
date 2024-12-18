 /*
 * Grupo: Lab_A06
 * Miembro1: Andrés Alejandro Rojas Cardona
 * Miembro2: Jason Armijos Avendaño
 * Miembro3: Alberto José Ramos Fernandez
 * Miembro4: Carlos Ramos Cabañas
 * 
 * Fecha: 9/12/2024
 * Descripción:	Este programa lo que hace es realizar la serie de fibonacci
 * de manera recursiva. 
 * 
 * Versión: 1.0
 * 
 */

import java.util.*;

public class Fibonacci 
{
	public static void main(String[] args) 
	{
		Scanner n = new Scanner(System.in);	
		System.out.print("Ingrese el numero hasta el cual quiere contar la sucesión de Fibonacci: ");
		int num = n.nextInt();
		while(num<0)
		{
			System.err.println("Ingrese un número mayor que 0");
			num = n.nextInt();
		}
		/*int i = 0;
		int z = 0, y = 0;
		while(i<num-1)
		{
			z = fibonacci(i);
			i++;
		}
		i=0;
		while(i<num-2)
		{
			y = fibonacci(i);
			i++;
		}
		System.out.println("este es z: "+ z);
		System.out.println("este es y: "+ y);

		int x = z + y; */
		
		System.out.printf("%d", fibonacci(num));
		System.out.printf("\nla suma es: %d", suma(num));
		n.close();
	}
	public static int fibonacci(int n)
	{
		if(n<=1)
		{
			return n;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}
	public static int suma(int n)
	{
		if(n<=0)
		{
			return n;
		}
		return fibonacci(n)+suma(n-1);
	}
}