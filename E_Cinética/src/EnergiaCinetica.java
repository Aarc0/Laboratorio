/*
 * Grupo: Lab_A06
 * Miembro1: Andrés Alejandro Rojas Cardona
 * Miembro2: Jason Armijos Avendaño
 * Miembro3: Alberto José Ramos Fernandez
 * Miembro4: Carlos Ramos Cabañas
 * 
 * Fecha: 18/10/2024
 * Descripción: El programa consiste en que el usuario introduzca una cantidad de masa y de velocidad las cuales se usarán 
 * para calcular la energía cinética de un objeto que tenga dicha masa y vaya a dicha velocidad mediante un cálculo.  
 * Versión: 1.0
 * 
 */


import java.util.Scanner;

public class EnergiaCinetica 
{
	public static void main(String[] args) 
	{
		final float h = 1/2f;
		Scanner V = null;
		try 
		{
			V = new Scanner(System.in);
			System.out.printf("Esto es una calculadora de energía cinética\n");
			System.out.printf("Por favor ingrese una cantidad de masa:");
			float m = V.nextFloat();
			System.out.printf("Por favor ingrese una velocidad:");
			float v = V.nextFloat();
			float E = h*m*v*v;
			System.out.printf("La energía cinética del objeto de %.2f kg de masa con una velocidad de %.2f m/s es de %.2f J", m, v, E);			
		}
		finally
		{
			if(V != null)
			{
				V.close();
			}
		}
	}

}