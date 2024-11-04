import java.util.Scanner;


public class Factorial {
	public static void main(String[]args)
	{
		Scanner n = new Scanner(System.in);
		char a = ' ';
		do {
		System.out.println("Ingrese un número, a partir de ese número se calculará su factorial: ");
		int numero = n.nextInt();
		double factorial = 1;
		for(int i = numero; i>0; i--)
		{
			factorial *= i;
		}
		System.out.println(factorial);
		
		System.out.println("¿Quiere ingresar otro número?");
		a = n.next().charAt(0);	
		}while(a == ('s')||a==('S'));
	}
}
