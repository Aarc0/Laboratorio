public class Empleados 
{
	private String nombre;
	private String apellido;
	private double salario_a;
	private double gratif;
	private double salario_m;
	
	public void Setnombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String Getnombre()
	{
		return nombre;
	}
	
	public void Setapellido(String apellido)
	{
		this.apellido = apellido;
	}
	
	public String Getapellido()
	{
		return apellido;
	}
	
	public void Setgratif(double gratif)
	{
		this.gratif = 1000+gratif;
	}
	
	public double Getgratif()
	{
		return gratif;
	}
	
	public void Setsalario_a(double salario_a)
	{
		this.salario_a = salario_a;
	}
	
	public double Getsalario_a()
	{
		return salario_a;
	}
	
	public void Setsalario_m(double salario_a)
	{
		this.salario_m = salario_a/14;
	}
	
	public double Getsalario_m()
	{
		return salario_m;
	}	
}
