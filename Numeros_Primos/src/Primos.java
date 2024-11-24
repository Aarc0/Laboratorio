/*
 * Grupo: Lab_A06
 * Miembro1: Andrés Alejandro Rojas Cardona
 * Miembro2: Jason Armijos Avendaño
 * Miembro3: Alberto José Ramos Fernandez
 * Miembro4: Carlos Ramos Cabañas
 * Fecha: 18/11/2024
 * Descripción: El programa consiste en preguntarle al usuario cuantos numeros primos quiere que se muestren
 * 				para que luego el programa muestra esa misma cantidad en pantalla. 
 * Versión: 1.0
 * 
 */
import java.util.*;

public class Primos 
{
	static Scanner n = new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("Cuantos números primos quiere que se muestren: ");
		int ca = n.nextInt();
		ListarNPrimos(ca);		
		n.close();
	}
	public static boolean EsPrimo(int a)
	{
		boolean b = true;
		for(int i = 2; i<a;i++)
		{
			if(a%i == 0)
			{
				b = false;
			}
		}
		return b;
	}
	public static int [] ListarNPrimos(int a)
	{
		int [] lp = new int[a];
		int count = 0;
		boolean b = true;
		for(int i = 2; count<lp.length;i++)
		{
			b = EsPrimo(i);
			if(b == true)
			{
				lp[count] = i;
				System.out.print(lp[count]);
				if(count < lp.length-1)
				{
					System.out.print("-");
				}
				count++;
			}
			else
			{
				b = true;
			}
		}
		return lp;
	}
}
