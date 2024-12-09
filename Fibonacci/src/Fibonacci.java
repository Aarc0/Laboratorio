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
		
		//System.out.println(fibonacci(num-1)+fibonacci(num-2));
	}
	/*public static int fibonacci(int m)
							//4, yo quiero saber 3 y 2
	{	
		if(m<=1)
		{
			return m;
		}
		
		 
		
		
	}*/
}