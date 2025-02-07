import java.util.Scanner;

public class Empleados 
{
	static Scanner n = new Scanner(System.in);
	public String nom_ap(String nombre, String apellido)
	{
		String completo = nombre+" "+apellido;
		return completo;
	}
	public double salario_m(double salario)
	{
		return (salario/14);
	}
	public double gratificacion(double num)
	{
		return 1000+num;
	}
	
	
	
	
}
