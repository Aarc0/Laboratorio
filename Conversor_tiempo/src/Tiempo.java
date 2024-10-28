/*
 *
 * Grupo: Lab_A06
 * Miembro1: Andrés Alejandro Rojas Cardona
 * Miembro2: Jason Armijos Avendaño
 * Miembro3: Alberto José Ramos Fernandez
 * Miembro4: Carlos Ramos Cabañas
 * 
 * Fecha: 17/10/2024
 * Descripción: El programa lee una serie de números que el usuario ingresa en formato de segundos y luego los
 * convierte en días, horas, minutos y segundos respectivamente.
 * Versión: 1.0
 * 
 */



import java.util.Scanner;

public class Tiempo 
{
	public static void main(String[] args) 
	{
		int resto1, resto2;
		Scanner sec = null;
		try 
		{
			System.out.printf("Por favor ingrese un número de segundos:");
			sec = new Scanner(System.in);
			int segundos = sec.nextInt();
			//En este caso hacemos que a "sec" se le pueda ingresar algo y que se ingrese un numero entero en este
			//caso, la variable segundos almacena lo que se ingrese en sec
			int D = segundos / 86400;
			resto1 = segundos % 86400;
			int H = resto1 / 3600;
			//Aquí se convierte de segundos a horas		
			resto2 = resto1 % 3600;
			//Aquí deja los segundos restantes de la hora		
			int M = resto2/60;
			//Aquí se convierte de los segundos restantes a minutos
			//Al final quedan unos segundos restantes	
			int S = resto2%60;
			//Aquí dejamos los segundos que quedan restando de la conversión de minutos a segundos
			//Esto queda almacenado en la variable S(segundos), es decir estos son los segundos que quedan.	
			
			if(segundos < 60)
			{
				System.out.printf("Estos segundos son %d segundos", S);
			}
			else if(segundos == 60)
			{
				System.out.printf("Estos segundos son %d minuto", M);
			}
			else if(segundos == 3600)
			{
				System.out.printf("Estos segundos son %d hora", H);
			}
			else if(segundos < 3600)
			{
				System.out.printf("Estos segundos son %d minutos y %d segundos", M, S);
			}
			else if(segundos < 86400)
			{
				System.out.printf("Estos segundos son %d horas, %d minutos y %d segundos", H, M, S);
			}
			else if(segundos == 86400)
			{
				System.out.printf("Estos segundos son %d día", D);
			}
			else if(segundos > 86400)
			{
				System.out.printf("Estos segundos son %d día, %d horas, %d minutos y %d segundos", D, H, M, S);
			}
		}
		finally 
		{
			if(sec != null)
			{
				sec.close();
			}
		}		
	}
}
