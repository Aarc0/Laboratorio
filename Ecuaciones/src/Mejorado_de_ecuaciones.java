/*
 * Grupo: Lab_A06
 * Miembro1: Andrés Alejandro Rojas Cardona
 * Miembro2: Jason Armijos Avendaño
 * Miembro3: Alberto José Ramos Fernandez
 * Miembro4: Carlos Ramos Cabañas
 * 
 * Fecha: 30/10/2024
 * Descripción: El ejercicio consiste en que el usuario ingrese los distintos valores de una ecuación de segundo grado, y luego
 * 				el programa distinga entre si el discriminante es positivo, negativo o 0, estas distinciones haran que la ecuación
 * 				tenga una respuesta, varias o respuestas imaginarias.  
 * Versión: 1.0  
*/


import java.util.Scanner;
import java.text.DecimalFormat;

public class Mejorado_de_ecuaciones 
{
	public static void main(String[] args) 
	{
		float a, b, c;
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner n = new Scanner(System.in);
		System.out.println("Usted va a ingresar valores para una ecuación de segundo grado, \"a\" es el indice que tendrá X²,\n \"b\" es el indice de X y \"c\" el indice del último numero de la ecuación.");
		System.out.println("");
		
		System.out.print("Ingrese el valor del indice de \"a\": ");
		a = n.nextFloat();
		System.out.print("Ingrese el valor del indice de \"b\": ");
		b = n.nextFloat();
		System.out.print("Ingrese el valor del indice de \"c\": ");
		c = n.nextFloat();
		float discriminante = (((float)b*b)-(float)4*a*c);
		
		if(discriminante > 0)
		{
			float resultado1 = (float) (-b + Math.sqrt(discriminante))/(a*2);
			float resultado2 = (float)(-b-Math.sqrt(discriminante))/(a*2);
			System.out.println("El primer resultado es: "+df.format(resultado1));
			System.out.println("El segundo resultado es: "+df.format(resultado2));
		}
		else if (discriminante == 0)
		{
			float resultado3 = -b/2*a;
			System.out.println("El resultado es: "+ df.format(resultado3));
		}
		else if(discriminante < 0)
		{
			float csigno = -discriminante;
			float raiz = (float)Math.sqrt(csigno);
			String im = "i";
			float B = (-b/2*a);
			float R = (raiz/2*a);
			char p = '+';
			char ne = '-';
			
			System.out.print("El primer resultado de la ecuación es: " + df.format(B));
			System.out.println("" + p + df.format(R) + im);
			System.out.print("El segundo resultado de la ecuación es: " + df.format(B));
			System.out.print("" + ne + df.format(R) + im);
			
		}
		
		
	}

}
