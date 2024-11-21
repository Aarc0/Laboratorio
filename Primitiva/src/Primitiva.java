import java.util.Scanner;
public class Primitiva 
{
	static Scanner n = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int reint = (int)(Math.random()*9);
		
		System.out.print("-Ingrese la cantidad de dinero que desea apostar: ");
		int di = n.nextInt();
		//La cantidad de dinero tiene que estar dentro de los límites del numero maximo de apuestas
		
		if(di < 1) 
		{	
			System.out.println("\n-Lo sentimos, el mínimo para apostar es 1€, ingrese un nuevo numero");
			di = n.nextInt();
		}
		else if(di == 1) System.out.println("\n-Usted puede realizar una apuesta");
		else if((di >= 2) && (di<=8)) System.out.println("\n-Usted puede realizar " + di + " apuestas.");
		else
		{
			while(di>8)
			{	
			System.out.println("\n-La cantidad máxima de apuestas son 8, escoge un número menor porfa");
			di = n.nextInt();
			}
		}
		
		//Hasta esta parte del codigo lo unico que hace es decir la cantidad de dinero que va a apostar el usuario
		//El dinero se relaciona con la cantidad de apuestas
		
		System.out.print("\n-Ingrese el número de apuestas que desea realizar: ");
		int ca = n.nextInt();
		
		if(ca == 0)
		{
			while(ca<=0)
			{
			System.out.print("Ingrese un número mayor: ");
			ca = n.nextInt();
			}
		}
		//Aquí ingresa el número de apuestas que va a realizar
		while(ca > di)
		{
			System.out.println("\n-Usted puede realizar solo " + di + " apuestas, ingrese un nuevo número: ");
			ca = n.nextInt();
		}
		
		int resto = di-ca;
		System.out.println("\n-El dinero sobrante es: " + resto +"€");
		//Le dice a la persona cuanto dinero le queda.

		
		//Esta array guarda el número de casillas que haya indicado el usuario
		int [][] boleto = new int[ca][];

		for(int i = 0; i<ca;i++)
		{
			System.out.println("Cuantos números quiere ingresar en la casilla "+(i+1));
			int num = n.nextInt();
			if(num >6)
			{
				while(num>6)
				{	
					System.out.println("El número máximo de números por casilla es 6");
					num = n.nextInt();
				}
			}
			if(num<1)
			{
				while(num<1)
				{	
					System.out.println("El número mínimo de números por casilla es 1");
					num = n.nextInt();
				}
			}
			boleto[i] = new int[num];
			for(int z = 0; z<num;z++)
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
				if(boleto[i][z] == 0)
				{
					break;
				}
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
		
		int premio = comparador(boleto, boletog);
		
		int reinte = reintegro(r, boletog, ca);
		if(premio == 0)
		{
			System.out.print("\n-Usted no acertó ningún número del boleto principal");
		}
		else
		{
			premio *= 10;
			System.out.print("\n-Usted ha ganado: "+premio+"€, con aciertos en las casillas cada vez más lejos de la pobreza :D");
		}
		int total = premio+reinte;
		if(total == 0)
		{
			System.out.print("\n-Perdio dinero :(");
		}
		else
		{
			System.out.print("\n-Ganó en total " + total+"€ :D");
		}
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
					i = 0;
				}
			}
		}
		return boleto;
	}
	//Este modulo se encarga de crear el boleto ganador
	public static int [] ganador()
	{
		int [] bolpre = new int [7];
		for(int i = 0; i<6;i++)
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
	public static int comparador(int[][]apuesta, int[]ganador)
	{
		int acertados = 0;
		for(int i = 0; i<apuesta.length;i++)
		{
			for(int x = 0; x<apuesta[i].length;x++)
			{
				for(int z = 0;z<ganador.length-1;z++)
				{
					if(apuesta[i][x] == ganador[z])
					{
						acertados += 1;
					}
				}
			}
		}
		return acertados;
	}
	//Aquí comparo el reintegro
	public static int reintegro(int r, int[]reintegro2, int a)
	{
		int x = 0;
		
		if(r == reintegro2[6])
		{
			x = a;
			System.out.print("\n-Usted acertó el reintegro, " +r+ ", se devolverá el dinero que hizo en su apuesta: ");
		}
		else
		{
			System.out.print("\n-No acertó el reintegro");
		}
		return x;
	}
}