import java.util.Scanner;

public class VECTORPRIMOS 
{

	public static void main(String[] args) 
	{
		Scanner n = new Scanner(System.in);
		System.out.print("Ingrese el número de primos que quiere almacenar: ");
		//int T = n.nextInt();
		int T = 10;
		boolean b = true;
		int [] a = new int[T];
		int j = 1;
		int i = 0;
		do
		{
			if(j == 1)
			{
				b = false;
			}
			//Excepción 
			for(int x = 2; x<j;x++)
			{
				if(j%x == 0)
				{
					b = false;
				}
			}
			//Esta parte del codigo lo que hace es verificar que el número que almacene "j" seá primo, si no lo es, devuelve falso
			if(b == true)
			{
				a[i] = j;
				i++;
				System.out.print("\nLa matríz en el indice " + (i)+ " tiene el número primo: " +j);
			}
			//Aquí, si el numero es primo, se va a almacenar en la casilla correspondiente al valor de i, y se va a avanzar una casilla para el prox valor
			if(b == false)
			{
				b = true;
			}
			j++;
			//Esto es simplemente un contador 
		}while(a[T-1] == 0);
	}

}
