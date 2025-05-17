package EJ4_AndresAlejandro_RojasCardona;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		String new_cild = "Nuevo_Cilindro.txt";
		File fichero = new File(new_cild);
		
		double radio = 0;
		double altura = 0;
		Scanner n = new Scanner(System.in);
		System.out.println("Dime las dimensiones del cilindro, radio y altura plis: ");
		
		try
		{
			PrintWriter salida = new PrintWriter(new FileWriter(fichero));
			System.out.println("Dime el radio: ");
			radio = n.nextDouble();
			System.out.println("Dime la altura: ");
			altura = n.nextDouble();
			Cilindro cilindro = new Cilindro(radio,altura);
			salida.println("El radio del cilindro es: "+cilindro.getRadio()+"\nLa altura del cilindro es: "+cilindro.getAltura());
			salida.println("El volumen del cilindro es: "+cilindro.calculoVolumen());
			salida.println("La superficie total del cilindro es: "+cilindro.calculoArea());
			salida.close();
		}
		catch(InputMismatchException e)
		{
			e.getMessage();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
		
	}
}
