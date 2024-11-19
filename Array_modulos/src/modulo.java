import java.util.Scanner;

public class modulo 
{
	static Scanner n = new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("Ingrese cuantas matrices quiere crear");
		int nm = n.nextInt();
		//se crea una variable llamada "nm" que guarda el valor del número de matrices a realizar
		nmatriz(nm);
		//La variable nm se incerta dentro del argumento de "nmatriz" indicandolo el número de veces que tiene que repetir una tarea
		
		
		
		System.out.println("Ingrese el número de fílas para la matriz");
		
			
		
		
		
	}
	public static int nmatriz(int N)
	{
		
		System.out.println("Por favor incerte el número de filas que contendrá la matriz: ");
		int filas = n.nextInt();
		System.out.println("Por favor incerte el número de columnas que contendrá la matriz: ");
		int columnas = n.nextInt();
		//Aquí pido ingresar el número de filas y columnas que contendrá la matriz
		
		
		for(int i = 0; i<N; i++)
		//Este bucle se ejecutara el número de veces que "i" sea menor que "N", siendo "N" el número de matrices a crear
		{
			array(filas, columnas);
		}
		return N;
	}
	public static int array(int f, int c)
	{
		Scanner m = new Scanner(System.in);
		int array[][] = new int[f][c];
		for(int i = 0; i < f; i++)
		{
			for(int j = 0; i<c; j++)
			{
				array[i][j] = m.nextInt();
			}
		}	
		return array(f, c);
	}
}
