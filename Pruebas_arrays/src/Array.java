import java.util.*;

public class Array 
{
	public static void main(String[] args) 
	{
		
		Scanner n = new Scanner(System.in);
		System.out.print("Inserte el numero de filas para la matriz 1: ");
		int F = n.nextInt();
		System.out.print("Inserte el numero de columnas para la matriz 1: ");
		int C = n.nextInt();
		int[][] matriz1	=new int [F][C];
		//Se le ingresa a la arrey un nº de filas y de columnas
		     
		for(int i = 0; i < F ; i++)
		//si i es menor que el numero de filas entra
		{
			
			for(int j = 0; j < C ; j++)
			//si j es menor que el numero de indices que hay en la fila del valor que tenga j, entra 
			{
				System.out.print("Inserta el valor para la fila " + (i+1) + ", columna " + (j+1)+ ": ");
				matriz1[i][j]=n.nextInt();
			}
		}
		for(int i = 0; i < F ; i++)
		//si i es menor que el numero de filas entra
		{
				
			for(int j = 0; j < C ; j++)
			//si j es menor que el numero de indices que hay en la fila del valor que tenga j, entra 
			{
				System.out.print("La fila " + (i+1) + ", columna " + (j+1)+ " de la matriz 1, tiene almacenado el valor: " + matriz1[i][j] + "\n\n");
			}
		}
		
		System.out.print("Inserte el numero de filas para la matriz 2: ");
		int F2 = n.nextInt();
		System.out.print("Inserte el numero de columnas para la matriz 2: ");
		int C2 = n.nextInt();
		int[][] matriz2	=new int [F2][C2];
		//Se le ingresa a la arrey un nº de filas y de columnas
		     
		for(int i = 0; i < F2 ; i++)
		//si i es menor que el numero de filas entra
		{
			
			for(int j = 0; j < C2 ; j++)
			//si j es menor que el numero de indices que hay en la fila del valor que tenga j, entra 
			{
				System.out.print("Incerta el valor para la fila " + (i+1) + ", columna " + (j+1)+ ": ");
				matriz2[i][j] = n.nextInt();
			}
		}
		for(int i = 0; i < F2 ; i++)
		//si i es menor que el numero de filas entra
		{
				
			for(int j = 0; j < C2 ; j++)
			//si j es menor que el numero de indices que hay en la fila del valor que tenga j, entra 
			{
				System.out.print("La fila " + (i+1) + ", columna " + (j+1)+ " de la matriz 2, tiene almacenado el valor: " + matriz2[i][j] + "\n\n");
			}
		}
	}
}
