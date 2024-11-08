import java.util.Scanner;

public class Primos 
{

	public static void main(String[] args) 
	{
		Scanner n = new Scanner(System.in);
		boolean a = true;
		System.out.println("Ingrese un número");
		int num = n.nextInt();
		if(num==1)
		{
			System.out.println("El número 1 no es primo");
			n.close();
			return;
		}
		for(int i = 2; i<num; i++)
		{	
			if(num%i == 0)
			{
				a = false;
			}
		}
		if (a == true)
		{
			System.out.println(num+" es primo");
		}
		else if (a == false)
		{
			System.out.println(num+" no es primo");
		}
		n.close();
	}
}
