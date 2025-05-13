package EJ1_AndresAlejandro_RojasCardona;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner n = new Scanner(System.in);
		boolean b = true;
		System.out.println("Ingrese información inicial sobre el vuelo");
		
		do
		{
			System.out.println("Ingrese el código de vuelo");
			String codigo = n.next();
			comprobacionV(codigo.charAt(0),codigo.charAt(1));
			
			
			
			
		}while(b);
		
		
		
	}
	public static void comprobacionV(char c0, char c1)
	{
		Scanner n = new Scanner(System.in);
		if((65<=c0&&c0<=90)||(65<=c1&&c1<=90)){}
		
		//detecta minusculas
		else if((97<=c0&&c0<=122))
		{
			while((97<=c0&&c0<=122))
			{
				System.out.println("El primer caracter del código de vuelo es erroneo, NO puede ser una letra minúscula");
				c0 = n.next().charAt(0);
			}
		}

		else if((97<=c1&&c1<=122))
		{
			while((97<=c1&&c1<=122))
			{
				System.out.println("El segundo caracter del código de vuelo es erroneo, NO puede ser una letra minúscula");
				c1 = n.next().charAt(0);
			}
		}
		
		//detecta números
		if((48<=c0&&c0<=57))
		{
			while((48<=c0&&c0<=57))
			{
				System.out.println("El primer caracter del código de vuelo NO puede ser un número");
				c0 = n.next().charAt(0);
			}
		}
		if((48<=c1&&c1<=57))
		{
			while((48<=c1&&c1<=57))
			{
				System.out.println("El segundo caracter del código de vuelo NO puede ser un número");
				c0 = n.next().charAt(0);
			}
		}
	}
}
