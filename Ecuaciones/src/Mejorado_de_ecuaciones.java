import java.util.Scanner;

public class Mejorado_de_ecuaciones 
{
	public static void main(String[] args) 
	{
		float a, b, c;
		Scanner n = new Scanner(System.in);
		System.out.println("Usted va a ingresar valores para una ecuación de segundo grado, \"a\" es el indice que tendrá X²,\n \"b\" es el indice de X y \"c\" el indice del último numero de la ecuación.");
		System.out.println("");
		
		System.out.print("Ingrese el valor del indice de \"a\": ");
		a = n.nextFloat();
		System.out.print("Ingrese el valor del indice de \"b\": ");
		b = n.nextFloat();
		System.out.print("Ingrese el valor del indice de \"c\": ");
		c = n.nextFloat();
		float discriminante = ((b*b)-4*a*c);
		if(discriminante > 0)
		{
			float resultado1 = (-b+discriminante)/a*2;
			float resultado2 = (-b-discriminante)/a*2;
			System.out.println("El primer resultado es: "+resultado1);
			System.out.println("El segundo resultado es: "+resultado2);
		}
		else if(discriminante == 0)
		{
			float resultado3 = -b/2*a;
			System.out.println("El resultado es: "+ resultado3);
		}
		else if(discriminante < 0)
		{
			System.out.println("");
		}
		
		
	}

}
