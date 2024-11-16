import java.util.Scanner;
import java.text.DecimalFormat;
public class InformaVector 
{
	public static void main(String[] args) 
	{
		DecimalFormat f = new DecimalFormat("#.##");
		Scanner n = new Scanner(System.in);
		System.out.println("Ingrese el tamaño del vector");
		int T = n.nextInt();
		int prov1 = 0,prov2 = 0,j=0;
		int [] a = new int[T];

		float suma = 0;
		for(int i = 0; i<T; i++)
		{
			int r = (int)(Math.random()*99);
			a[i] = r;
			System.out.println("-Elemento " +(i+1)+ " es: " +a[i]);
			suma += r;
			prov1 = a[i];
			if(prov2 == 0)
			{
				prov2 = prov1;
				j = i+1;
			}
			else if(prov2 < prov1)
			{
				j = i+1;
				prov2 = prov1;
			}
		}
		System.out.println("\n-La medía de la suma de todos los elementos del vector es: " + f.format(suma/T)+"\n");
		
		System.out.println("-El mayor valor de la array es "+prov2+ " y está en la posición "+j);
		int [] aa = new int [prov2+1];
		for(int i = 0; i<aa.length; i++)
		{
			if(i == T)
			{
				break;
			}
			aa[a[i]] += 1;
		}
		int mayor = 0;
		int valor = 0;
		for(int i = 0; i<prov2+1;i++)
		{
			if(aa[i]>valor)
			{
				mayor = i;
				valor = aa[i];
			}
		}
		System.out.println("\n-El número que más se repite es: "+mayor);
		n.close();
	}
}
