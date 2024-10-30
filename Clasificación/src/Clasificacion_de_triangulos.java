import java.util.Scanner;

public class Clasificacion_de_triangulos {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Esto es un clasificador de triangulos, \"a\" se refiere al lado izquierdo, \"b\" al derecho y \"c\" a la base");
		System.out.print("Ingrese el valor del lado \"a\": ");
		float a = n.nextInt();
		System.out.print("Ingrese el valor del lado \"b\": ");
		float b = n.nextInt();
		System.out.print("Ingrese el valor del lado \"c\": ");
		float c = n.nextInt();
		String t = new String();
		if((a+b>c) && (a+c>b) && (b+c>a))
		{
			if(a==b && a==c)
			{	
				t = "equilatero";
				System.out.println("El triangulo que has introducido es "+t);
			}
			else if(a==b || a==c || b==c)
			{
				t = "isóceles";
				System.out.println("El triangulo que has introducido es "+t);
			}
			else if(a!=b && a!=c)
			{
				t = "escaleno";
				System.out.println("El triangulo que has introducido es " +t);
			}
		}
		else 
		{
			System.err.println("Los lados que has ingresado no forman un triángulo válido");
		}
	}
}
