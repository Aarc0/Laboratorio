import java.util.*;

public class Comun_divisor 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese de cuales numeros desea calcular el mínimo común divisor");
		int N = scan.nextInt();
		int M = scan.nextInt();
		while(M<=N)
		{
			System.out.print("Ingrese un segundo número mayor que el primero: ");
			M = scan.nextInt();
		}
		mcd(N,M);
		
		scan.close();
	}
	public static int mcd(int n, int m)
	{
		int r = m%n;
		if(r == 0)
		{
			System.out.println("El mcd es: " + n);
			return n;
		}
		else
		{
			m = n;
			n = r;
			mcd(n,m);
		}
		return n;
	}
}
