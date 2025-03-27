package EJ_Expecion;

public class Main {

	public static void main(String[] args) 
	{
		int a = 10;
		int b = 0;
		
		try 
		{
			a = a/b;
			
		}
		catch(ArithmeticException e)
		{
			System.err.println("Error: División por 0");
			//e.printStackTrace();
		}
		finally
		{
			System.out.println("Finaliza el programa");
		}
	}
	
}
