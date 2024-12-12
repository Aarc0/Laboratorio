import java.util.*;

public class Fibonacci 
{
	public static void main(String[] args) 
	{
		Scanner n = new Scanner(System.in);	
		System.out.print("Ingrese el numero hasta el cual quiere contar la sucesión de Fibonacci: ");
		int num = n.nextInt();
		while(num<0)
		{
			System.err.println("Ingrese un número mayor que 0");
			num = n.nextInt();
		}
		int i = 0;
		int z = 0, y = 0;
		while(i<num-1)
		{
			z = fibonacci(i);
			i++;
		}
		i=0;
		while(i<num-2)
		{
			y = fibonacci(i);
			i++;
		}
		System.out.println("este es z: "+ z);
		System.out.println("este es y: "+ y);
		int x = z + y;
		System.out.printf("%d", x);
		n.close();
	}
	public static int fibonacci(int n)
	{
		if(n<=1)
		{
			return n;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}
}