package EJ_CLASE_3;

public class Ej 
{
 
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 10;
		
				
		System.out.println("1: "+(a==b));
		
		String c = "Hola";
		String d = "Hola";
		
		System.out.println("2: "+(c==d));
		
		String e = new String("Hola");
		String f = new String("Hola");
		
		
		System.out.println("3: "+(e==f));
		
		System.out.println("4: "+e.equals(f));
		
		
		
	}
}
