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
			comprobacionV(codigo);
			
			if(65<=(codigo.charAt(0))||(codigo.charAt(1))<=90){}
			
			
			
		}while(b);
		
		
		
	}
	public static void comprobacionV(String codigo)
	{
		
	}
}
