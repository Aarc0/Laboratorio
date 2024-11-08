import java.util.*;


public class CuentaPrimos 
{
	public static void main(String[] args) 
	{
		Scanner n = new Scanner(System.in);
		System.out.println("Ingrese el numero hasta el cual se quieran contar los numeros primos que hay");
		int num = n.nextInt();
		boolean a = true;
		if(num==1)
		{
			System.out.println(num + " no es primo");
			n.close();
			return;
		}
		for(int j = 1;j<num;j++)
		{
			if(num%j==0 && num/j ==1)
			{
				a = false;
				System.out.println(j+" no es primo");
			}
			else if(num%j != 0)
			{
				a = true;
				System.out.println(j+" es primo");
			}
		}
	}

}
