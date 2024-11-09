import java.util.*;


public class CuentaPrimos 
{
	public static void main(String[] args) 
	{
		Scanner n = new Scanner(System.in);
		System.out.println("Ingrese el numero hasta el cual se quieran contar los numeros primos que hay: ");
		int num = n.nextInt();
		boolean a = true;
		int p = 0;
		int np = 0;
		for(int j = 1;j<=num;j++)
		{
			if(j == 1) a = false;
			for(int i = 2; i<j;i++)
			{
				if(j%i==0)
				{
					a = false;
				}
			}
			if (a == true)
			{
				System.out.println(j+" es primo");
				p++;
			}
			else if (a == false)
			{
				System.out.println(j+" no es primo");
				np++;
				a = true;
			}
			
		}
		System.out.println("Hay "+p + " numeros primos" );
		System.out.println("Hay "+np + " numeros que no son primos" );
	}
}