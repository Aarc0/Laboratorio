/*
 * Grupo: Lab_A06
 * Miembro1: Andrés Alejandro Rojas Cardona
 * Miembro2: Jason Armijos Avendaño
 * Miembro3: Alberto José Ramos Fernandez
 * Miembro4: Carlos Ramos Cabañas
 * 
 * Fecha: 18/11/2024
 * Descripción: El programa consiste en recrear el juego de la primitiva, el usuario escoge el dinero que quiere ingresar y
 * 				luego escoge el numero de apuestas que desea realizar.  
 * Versión: 1.0
 */
import java.util.Scanner;
public class Primitiva 
{
	static Scanner n = new Scanner(System.in);
	public static void main(String[] args) 
	{		
		System.out.print("-Ingrese la cantidad de dinero que desea apostar: ");
		int di = n.nextInt();		
		//El dinero luego se relaciona con la cantidad de apuestas		
		System.out.print("\n-Ingrese el número de apuestas que desea realizar: ");
		int ca = n.nextInt();
		//Aquí ingresa el número de apuestas que va a realizar

		if(ca == 0)
		{
			while(ca<=0)
			{
			System.out.print("El numero mínimo de apuestas es 1, ingrese un numero mayor: ");
			ca = n.nextInt();
			}
		}
		while(ca > di)
		{
			System.out.println("\n-Usted puede realizar un máximo de " + di + " apuestas, ingrese un nuevo número: ");
			ca = n.nextInt();
		}
		int resto = di-ca;
		System.out.println("\n-El dinero sobrante es: " + resto +"€");
		//Le dice a la persona cuanto dinero le queda.	
		//Esta array guarda el número de casillas que haya indicado el usuario
		int [][] boleto = new int[ca][6];
		for(int i = 0; i<ca;i++)
		{
			for(int z = 0; z<6;z++)
			{
				boleto[i][z] =(int)(1+Math.random()*49);
			}
		}
		boleto = nonrep(boleto);
		for(int i = 0;i<ca;i++)
		{
			System.out.print("\n-La casilla "+(i+1)+" tiene los números: " );
			for(int z = 0;z<boleto[i].length;z++)
			{
				System.out.print(boleto[i][z]);
				if(z<boleto[i].length-1)
				{
					System.out.print("-");
				}
			}
		}
		//Con esta parte del codigo tengo hechos los boletos que quiera el usuario			
		//Aquí creo el reintegro del boleto
		int r =(int)(Math.random()*9);
		int [] boletog = ganador();
		int reinte = reintegro(r, boletog, ca);
		
		if(reinte == 0)
		{
			System.out.println("\n-No acertó el reintegro");
		}
		else if(reinte == ca)
		{		
			System.out.println("\n-Usted acertó el reintegro, se le devolverán " + reinte+"€");
		}
		int premio = 0;
		int tot = 0;
		for(int i = 0; i<boleto.length;i++)
		{
			for(int x = 0; x<boleto[i].length;x++)
			{
				premio = comparador(boleto[i][x], boletog);
				tot += premio;
			}
			if(tot >= 1)
			{
				aciertos(tot, i, reinte);
				tot = 0;
			}
			else if(tot < 1)
			{
				System.out.println("\n-No tuvo aciertos en la casilla "+(i+1));
			}
		}
		n.close();
	}
	//Este módulo se encarga de que no se repita ningún número dentro del boleto
	public static int [][] nonrep(int [][] boleto)
	{
		int [] rep = new int[50];
		for(int i = 0; i<boleto.length;i++)
		{
			for(int x = 0; x<boleto[i].length;x++)
			{
				rep[boleto[i][x]] += 1;
				if(rep[boleto[i][x]] == 2)
				{
					boleto[i][x] = (int)(1+Math.random()*49);	
					for(int ii = 0;ii<boleto.length;ii++)
					{
						for(int xx = 0; xx<boleto[ii].length;xx++)
						{
							rep[boleto[ii][xx]] = 0;
						}
					}																
					x = -1;
				}
			}
		}
		return boleto;
	}
	//Este modulo se encarga de crear el boleto ganador
	public static int [] ganador()
	{
		int [] bolpre = new int [7];
		for(int i = 0; i<7;i++)
		{
			bolpre[i] =(int) (1+Math.random()*49);
		}
		bolpre[6] = (int)(Math.random()*9);
		
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
	public static int comparador(int apuesta, int[]ganador)
	{
		int acertados = 0;
		for(int i = 0; i<ganador.length-1;i++)
		{
			if(apuesta == ganador[i])
			{
				acertados += 1;
			}
		}
		return acertados;
	}
	//Aquí comparo el reintegro
	public static int reintegro(int r, int[]reintegro2, int a)
	{
		int x = 0;
		if(r == reintegro2[5])
		{
			x = a;	
		}
		return x;
	}
	//En este metodo creo las opciones de cuanto dinero gana el usuario dependiendo de cuantos numeros haya acertado
	public static int aciertos(int a, int po, int r)
	{
		if(a<3 )
		{
			System.out.println("\n-Tuvo menos de 3 aciertos en la casilla "+(po+1));
		}
		else if (a == 3)
		{
			System.out.println("\n-Acertó 3 numeros en la casilla "+(po+1)+ " el premio es de 50€");
		}
		else if(a > 3 && a <6)
		{
			System.out.println("\n-Acertó " +a+ " numeros en la casilla " +(po+1)+ " el premio es de 100€");
		}
		else if(a == 6 && r > 0)
		{
			System.out.println("\n-Ganó el premio máximo en la casilla "+(po+1));
		}
		else if(a == 6 && r == 0)
		{
			System.out.println("\n-Ganó el segundo premio en la casilla "+(po+1));
		}
		return a;
	}
}