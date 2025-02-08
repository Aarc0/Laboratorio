import java.util.Scanner;

public class Empresa 
{
	static Scanner n = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		boolean b = true;
		String eleccion = " ";
		double i = 1;
		Empleados emp1 = new Empleados();
		Empleados emp2 = new Empleados();
		
		do
		{
			//Nombre y apellido
			//////////////////////////////////////////////////////////////
			System.out.println("Escoja el nombre del empleado "+ i);
			String nom = n.next();
			if(i == 1) emp1.Setnombre(nom);
			else emp2.Setnombre(nom);
			System.out.println("Escoja el apellido del empleado "+ i);
			String ap = n.next();
			if(i==1) emp1.Setapellido(ap);
			else emp2.Setapellido(ap);
			//////////////////////////////////////////////////////////////
			
			//Salario anual
			//////////////////////////////////////////////////////////////
			System.out.println("Escoja el salario anual del empleado "+i);
			double sa = n.nextDouble();
			if(i==1) emp1.Setsalario_a(sa);
			else emp2.Setsalario_a(sa);
			//////////////////////////////////////////////////////////////
			
			//Salario mensual
			//////////////////////////////////////////////////////////////
			if(i == 1) emp1.Setsalario_m(emp1.Getsalario_a());       
			 
			else emp2.Setsalario_m(emp2.Getsalario_a()); 
			//////////////////////////////////////////////////////////////
			
			//Gratificación
			//////////////////////////////////////////////////////////////
			double mensaje = (i == 1)? emp1.Getsalario_a() : emp2.Getsalario_a();
			System.out.println("Teniendo en cuenta que el salario anual del empleado "+i+" es de "+mensaje+"€, escoja una gratificación en porcentaje \"%\"");
			double grat = (n.nextDouble()/100);
			grat = (i==1)? emp1.Getsalario_a()*grat :  emp2.Getsalario_a()*grat;
			if(i ==1) emp1.Setgratif(grat);
			else emp2.Setgratif(grat);
			//////////////////////////////////////////////////////////////
			
			System.out.println("El empleado "+((i==1)?emp1.Getnombre()+" "+emp1.Getapellido():emp2.Getnombre()+" "+emp2.Getapellido())
								+" tiene un salario mensual de "+((i==1)?emp1.Getsalario_m():emp2.Getsalario_m())
								+"€, y una paga extra de "+((i==1)?emp1.Getgratif():emp2.Getgratif()));
			i++;
			if(i == 3)
			{
				b = false;
			}
		}while(b);
		
		System.out.println("Quiere actualizar los datos?");
		eleccion = n.next();
		if(eleccion.charAt(0) == 's'||eleccion.charAt(0) == 'S')
		{
			b = true;
		}
		else return;
		do
		{
			lista();
			int num = n.nextInt();
			switch(num)
			{
				case 1:
					System.out.println("A qué empleado quiere cambiarle el nombre?\n"
										+"1.-"+emp1.Getnombre()+" "+emp1.Getapellido()+"\n"
										+"2.-"+emp2.Getnombre()+" "+emp2.Getapellido());
					i = n.nextInt();
					System.out.println("Escoja el nuevo nombre");
					String nom = n.next();
					if(i == 1) emp1.Setnombre(nom);
					else emp2.Setnombre(nom);
					break;
				
				case 2:
					System.out.println("A qué empleado quiere cambiarle el apellido?\n"
							+"1.-"+emp1.Getnombre()+" "+emp1.Getapellido()+"\n"
							+"2.-"+emp2.Getnombre()+" "+emp2.Getapellido());
					i = n.nextInt();
					System.out.println("Escoja el nuevo apellido");
					String ap = n.next();
					if(i == 1) emp1.Setapellido(ap);
					else emp2.Setapellido(ap);				
					break;
				
				case 3:
					System.out.println("A qué empleado quiere cambiarle el salario anual?\n"
							+"1.-"+emp1.Getnombre()+" "+emp1.Getapellido()+"\n"
							+"2.-"+emp2.Getnombre()+" "+emp2.Getapellido());
					i = n.nextInt();
					System.out.println("Escoja el nuevo salario anual");
					double sa = n.nextDouble();
					if(i == 1) 
					{
						emp1.Setsalario_a(sa);
						emp1.Setsalario_m(emp1.Getsalario_a());
						System.out.println("El nuevo salario anual del empleado "+i+" es de: "+emp1.Getsalario_a()+"€\n"
											+"Por favor escoja una nueva gratificación (en porcentaje \"%\")" );
						i = (n.nextDouble()/100);
						emp1.Setgratif(emp1.Getsalario_a()*i);
					}
					else
					{
						emp2.Setsalario_a(sa);
						emp2.Setsalario_m(emp2.Getsalario_a());
						System.out.println("El nuevo salario anual del empleado "+i+" es de: "+emp2.Getsalario_a()+"€\n"
											+"Por favor escoja una nueva gratificación (en porcentaje \"%\")" );
						i = (n.nextDouble()/100);
						emp2.Setgratif(emp2.Getsalario_a()*i);
					}					
					break;
			}
			
			System.out.println("Quiere seguir actualizando los datos? (Si/No)");
			eleccion = n.next();
			if(eleccion.charAt(0) == 'n'||eleccion.charAt(0) == 'N')
			{
				b = false;
				i = 1;
			}
		}while(b);
		
		if(i == 1)
		{
			b = true;
			do
			{	
				System.out.println("El empleado "+((i==1)?emp1.Getnombre()+" "+emp1.Getapellido():emp2.Getnombre()+" "+emp2.Getapellido())
									+" tiene un salario mensual de "+((i==1)?emp1.Getsalario_m():emp2.Getsalario_m())
									+" y una paga extra de "+((i==1)?emp1.Getgratif():emp2.Getgratif()));
				i++;
				if(i ==3)
				{
					b = false;
				}
			}while(b);
		}
		
	}
	public static void lista()
	{
		System.out.println("¿Qué dato quiere actualizar?\n "
				+ "1.-Nombre\n "
				+ "2.-Apellido\n "
				+ "3.-Salario anual");
	}
	
}
