import java.util.Scanner;

public class Primitiva 
{
	static Scanner n = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("-Ingrese la cantidad de dinero que desea apostar: ");
		int di = n.nextInt();
		if(di < 1) System.out.println("\n-Lo sentimos, el mínimo para apostar es 1€");
		else if(di == 1) System.out.println("\n-Usted puede realizar una apuesta");
		else if((di >= 2) && (di<=6)) System.out.println("\n-Usted puede realizar " + di + " apuestas.");
		else
		{
		System.out.println("\n-La cantidad máxima de apuestas son 6");
		return;
		}
		//Hasta esta parte del codigo lo unico que hace es decir la cantidad de dinero que va a apostar el usuario
		System.out.print("\n-Ingrese el número de apuestas que desea realizar: ");
		int ca = n.nextInt();
		//Aquí ingresa el número de apuestas que va a realizar
		while(ca > di)
		{
			System.out.println("\n-Usted puede realizar solo " + di + " apuestas, ingrese un nuevo número: ");
			ca = n.nextInt();
		}
		int resto = di-ca;
		

		
		
		
		int [] boleto = new int[ca];
		System.out.println("\n-El dinero sobrante es: " + resto +"€");
		//Le dice a la persona cuanto dinero le queda.
		for(int i = 0; i<ca;i++)
		{
			System.out.print("-Escoja el número en la casilla "+ (i+1)+ " : ");
			int num = n.nextInt();
			boleto[i] = num;
		}
		//Con esta parte del codigo tengo generado un número escogido por el usuario para cada casilla, es decir el boleto hecho.
		System.out.println("\n-Los números escogidos son: ");
		for(int i = 0; i<ca; i++)
		{
			System.out.print(boleto[i]);
			if(i<ca-1)
			{
				System.out.print("-");
			}
		}
		//En esta parte se imprime el boleto para que el usuario lo vea.
		
	
	}
	/*public static int [][] nonrep(int na)
	{
		
	}*/
	
	
	
}
