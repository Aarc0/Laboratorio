import java.util.Scanner;

public class Primitiva 
{
	static Scanner n = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int reint = (int)(Math.random()*9);
		
		System.out.print("-Ingrese la cantidad de dinero que desea apostar: ");
		int di = n.nextInt();
		
		if(di < 1) System.out.println("\n-Lo sentimos, el mínimo para apostar es 1€");
		else if(di == 1) System.out.println("\n-Usted puede realizar una apuesta");
		else if((di >= 2) && (di<=6)) System.out.println("\n-Usted puede realizar " + di + " apuestas.");
		else
		{
		System.out.println("\n-La cantidad máxima de apuestas son 6");
		return;
		}
		
		//Hasta esta parte del codigo lo unico que hace es decir la cantidad de dinero que va a apostar el usuario
		System.out.print("\n-Ingrese el número de apuestas que desea realizar: ");
		int ca = n.nextInt();
		
		//Aquí ingresa el número de apuestas que va a realizar
		while(ca > di)
		{
			System.out.println("\n-Usted puede realizar solo " + di + " apuestas, ingrese un nuevo número: ");
			ca = n.nextInt();
		}
		
		int resto = di-ca;
		System.out.println("\n-El dinero sobrante es: " + resto +"€");
		//Le dice a la persona cuanto dinero le queda.

		int [] boleto = new int[ca+1];
		//se le añade uno para contar el reintegro
		
		for(int i = 0; i<ca;i++)
		{
			System.out.print("-Escoja el número en la casilla "+ (i+1)+ " : ");
			int num = n.nextInt();
			if(num < 1 || num > 49)
			{
				System.out.println("Tu número tiene que estár entre 1 y 49, escoge un nuevo numero");
				num = n.nextInt();
			}
			boleto[i] = num;
		}
		//Con esta parte del codigo tengo generado un número escogido por el usuario para cada casilla, es decir el boleto hecho.
		
		
		//Aquí creo el reintegro del boleto
		boleto[ca] = reint;
		//Le digo al codigo que en la última posición del vector ponga el valor del reintegro, para acortar
		
		
		boleto = nonrep(boleto);
		
		System.out.println("\n-Los números escogidos son: ");
		for(int i = 0; i<ca+1; i++)
		{
			System.out.print(boleto[i]);
			if(i==ca-1)
			{
				System.out.print("\n-El reintegro es: ");
				System.out.println(boleto[ca]);
				break;
			}
			if(i<ca)
			{
				System.out.print("-");
			}
		}
		//En esta parte se imprime el boleto para que el usuario lo vea.
		
		int [] boletog = ganador();
		
		//FALTA HACER UN MÓDULO QUE COMPARE LOS DOS BOLETOS Y DEVUELVA CUANTAS SE HAN ACERTADO
		
	}
	
	
	//Este módulo se encarga de que no se repita ningún número dentro del boleto
	public static int [] nonrep(int [] boleto)
	{
		int [] repe = new int[50]; 
		//Esta matriz la uso para contar si hay valores repetidos
		
		for(int i = 0; i<boleto.length-1;i++)
			//Se le resta uno a la longitud pq no quiero que cuente el reintegro
		{
			repe[boleto[i]] += 1;
			
			
			if(repe[boleto[i]] == 2)
			{
				System.out.print("\n-El número " +boleto[i]+ " está repetido en la casilla " 	+ (i+1) + " por favor cambielo por uno que no haya escogido anteriormente: ");
				boleto[i] = n.nextInt();
				if(boleto[i] < 1 || boleto[i]> 49)
				{
					System.out.println("Tu número tiene que estár entre 1 y 49, escoge un nuevo numero");
					boleto[i] = n.nextInt();
				}
				for(int x = 0; x<boleto.length-1; x++)
				{
					repe[boleto[x]] = 0;
					//Esto es para resetear el valor de todos y volver a examinar de que no haya repetidos
				}
			 i = -1;
			}
		}
		return boleto;
	}
	//Este modulo se encarga de crear el boleto ganador
	public static int [] ganador()
	{
		int [] bolpre = new int [6];
		for(int i = 0; i<5;i++)
		{
			bolpre[i] =(int) (1+Math.random()*49);
		}
		bolpre[5] = (int)(Math.random()*9);
		
		bolpre = nonrepg(bolpre);
		
		return bolpre;
	}
	//este módulo es solo para verificar que no haya números ganadores repetidos, lo hice aparte ya que no quiero hacer módulos muy grandes
	public static int [] nonrepg(int [] bole)
	{
		{
			int [] repe = new int[50]; 
			//Esta matriz la uso para contar si hay valores repetidos
			
			for(int i = 0; i<bole.length-1;i++)
				//Se le resta uno a la longitud pq no quiero que cuente el reintegro
			{
				repe[bole[i]] += 1;
				if(repe[bole[i]] == 2)
				{
					bole[i] =(int)(1+Math.random()*49);
					
					for(int x = 0; x<bole.length-1; x++)
					{
						repe[bole[x]] = 0;
						//Esto es para resetear el valor de todos y volver a examinar de que no haya repetidos
					}
				 i = -1;
				}
			}
			return bole;
		}
	}
	//Este módulo se encarga de comparar los dos boletos y decir cuanto se ha ganado
	public static int [] comparador(int[]apuesta, int[]ganador, int a)
	{
		
	}
}


