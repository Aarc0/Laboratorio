import java.util.Scanner;

public class Empresa 
{
	static Scanner n = new Scanner(System.in);
	static Empleados trab = new Empleados();
	
	public static void main(String[] args) 
	{
		String eleccion = " ";
		System.out.println("Cuantos trabajadores quiere ingresar?");
		int num = n.nextInt();
		double [][] salarios = new double[num][3];
		String[] nombres = new String[num];
		
		//////////////////////////////////////////////////////////////
		nombres = nombres(nombres);
		//////////////////////////////////////////////////////////////
		salarios = sueldos(salarios, nombres);
		salarios = gratificacion(salarios,nombres);
		//////////////////////////////////////////////////////////////
		for(int i = 0;i<nombres.length;i++)
		{
			System.out.println("El empleado "+nombres[i]+" tiene un salario mensual de "+salarios[i][1]+" y una paga extra de "+salarios[i][2]);
		}
		
		System.out.println("Quiere actualizar algún dato? Si(s)/No(n)");
		eleccion = n.next();
		
		if(eleccion.charAt(0) == 's' ||eleccion.charAt(0) == 'S')
		{	
			cambios(salarios, nombres);
		}
		for(int i = 0;i<nombres.length;i++)
		{
			System.out.println("El empleado "+nombres[i]+" tiene un salario mensual de "+salarios[i][1]+" y una paga extra de "+salarios[i][2]);
		}
	}
	public static void lista()
	{
		System.out.println("Qué dato quiere actualizar?\r\n"
							+ "1.-Nombre y apellido\r\n"
							+ "2.-Sueldo mensual\r\n"
							+ "3.-Gratificacion");
	}
	public static String [] nombres(String[] name)
	{
		Empleados trab = new Empleados();
		for(int i = 0;i<name.length;i++)
		{
			System.out.println("Escoja el nombre del trabajador número "+(i+1));
			String nom = n.next();
			System.out.println("Escoja el apellido del trabajador número "+(i+1));
			String ap = n.next();
			name[i] = trab.nom_ap(nom,ap);
		}
		
		return name;
	}

	public static double[][] sueldos(double [][] sal, String[] name)
	{
		for(int i = 0;i<name.length;i++)
		{
			System.out.println("Ingrese el sueldo anual del trabajador "+(i+1));
			sal[i][0] = n.nextInt();
			sal[i][1] = trab.salario_m(sal[i][0]);
		}
		return sal;
	}

	public static double[][] gratificacion(double [][] sal, String[] name)
	{
		for(int i = 0;i<name.length;i++)
		{
			System.out.println("Ingrese la gratificación (en porcentaje \"%\") del trabajador "+(i+1)+ " que tiene un sueldo anual de: "+sal[i][0]+"€");
			double porcent = n.nextInt();
			porcent /= 100;
			double grat = (sal[i][0]*(porcent));
			sal[i][2] = trab.gratificacion(grat);
		}
		return sal;
	}

	public static void cambios(double[][]sal,String[]name)
	{
		boolean b = true;
		do
		{
			lista();
			int dat = n.nextInt();
			
			switch(dat)
			{
				case 1:
					System.out.println("¿A qué empleado desea cambiarle el nombre?: ");
					for(int i = 0;i<name.length;i++)
					{
						System.out.println((i+1)+".-"+name[i]);  
					}
					int emp = n.nextInt();
					
					System.out.println("Usted ha escogido al empleado número: "+emp);
					System.out.println("Escoja el nombre del trabajador número "+emp);
					String nom = n.next();
					System.out.println("Escoja el apellido del trabajador número "+emp);
					String ap = n.next();
					name[(emp-1)] = trab.nom_ap(nom, ap);
					break;
				
				case 2:
					System.out.println("¿A qué empleado desea cambiarle el sueldo anual?: ");
					for(int i = 0;i<name.length;i++)
					{
						System.out.println((i+1)+".-"+name[i]);  
					}
					emp = n.nextInt();
					System.out.println("Usted ha escogido al empleado número: "+emp);
					System.out.println("Escoja el sueldo anual del trabajador número "+emp);
					sal[emp-1][0] = n.nextInt();
					sal[emp-1][1] = trab.salario_m(sal[emp-1][0]);
					System.out.println("El nuevo sueldo anual del trabajador "+emp+" es: "+sal[emp-1][0]+"\nY el nuevo sueldo mensual es: "+sal[emp-1][1]);
					break;
					
				case 3:
					System.out.println("¿A qué empleado desea cambiarle la gratificación?: ");
					for(int i = 0;i<name.length;i++)
					{
						System.out.println((i+1)+".-"+name[i]);  
					}
					emp = n.nextInt();
					System.out.println("Usted ha escogido al empleado número: "+emp);
					System.out.println("Escoja la nueva gratificación (en porcentaje) del trabajador número "+emp);
					double porcent = n.nextInt();
					porcent /= 100;
					double grat = (sal[emp-1][0]*(porcent));
					sal[emp-1][2] = trab.gratificacion(grat);
					System.out.println("La nueva gratificación del trabajador "+emp+" es: "+sal[emp-1][2]);
					break;
			}
			
			System.out.println("Quiere actualizar algún dato nuevamente? Si(s)/No(n)");
			String eleccion = n.next();
			
			if(eleccion.charAt(0) == 'n' ||eleccion.charAt(0) == 'N')
			{	
				b = false;
			}
		}while(b);
	}
}
