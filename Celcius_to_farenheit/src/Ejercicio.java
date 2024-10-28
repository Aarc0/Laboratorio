import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio 
{
	public static void main(String[] args) 
	{
		Scanner celcius = null;
		try 
		{
			celcius = new Scanner(System.in);
			celcius.useLocale(Locale.GERMAN);
			//Hasta esta parte el codigo solo recibe entrada de numeros separados con comas
			
			System.out.print("Ingrese una cantidad de grados separada con comas(\",\") en el caso de que tenga decimales:\n");
			float grados = celcius.nextFloat();
			//Hasta esta parte se le pide al usuario ingresar una cantidad de grados especificamente separada con comas
			//Luego con el nextfloat() hacemos que el usuario pueda ingresar su input
			//Eso se guarda en una variable float llamada grados la cual tendrá el valor de la variable llamada celcius (la cual ingresará el usuario)
			
			DecimalFormatSymbols grados1 = new DecimalFormatSymbols();
			grados1.setDecimalSeparator(',');
			DecimalFormat gc = new DecimalFormat("0.000000", grados1);
					
			String resultado = gc.format(grados);
			
			float farenheit;
			//crea una variable tipo float llamada farenheit
			DecimalFormatSymbols farenheit1 = new DecimalFormatSymbols();
			farenheit1.setDecimalSeparator(',');
			//Crea una variable llamada farenheit1 que formatea para que sus decimales sean comas
			DecimalFormat df = new DecimalFormat("#.00", farenheit1);
			//crea otra variable llamada df que formatea el numero de decimales que aparecerán de la variable hecha anteriormente "farenheit1"
			
			
			farenheit = (grados*9/5)+32;
			//Se usa la variable float para hacer el cálculo necesario
			String resultadoformateado = df.format(farenheit);
			//Se crea un string formateado en el que se le añaden las propiedades de la variable df a la de tipo float.
			
			if(grados == 1)
			{
				System.out.println(resultado + " grado celcius es igual a " + resultadoformateado + " grados farenheit.");
			}
			else
			{
				System.out.println(resultado + " grados celcius son igual a " + resultadoformateado + " grados farenheit.");
			}
		}
			finally
			{
				if (celcius != null)
				{
					celcius.close();
				}
			}
	}
}
