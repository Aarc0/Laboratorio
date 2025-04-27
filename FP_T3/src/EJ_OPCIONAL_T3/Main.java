package EJ_OPCIONAL_T3;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main 
{
	public static void main(String[] args) 
	{
		Scanner n = new Scanner(System.in);
		int agotado = 0;
		boolean b = true;
		System.out.println("Por favor introduce la energía que va a tener inicialmente el corredor: ");
		Corredor C1 = null;
		
		while(agotado<3) 
		{
			try
			{	
				if(b) 
				{
					C1 = new Corredor(n.nextInt());
					b = false;
				}
				C1.correr();	
			}
			catch(AgotadoException e)
			{
				agotado++;
				e.mostrarMensaje();
				if(agotado == 3) 
				{
					System.out.println("Entrenamiento finalizado");
					break;
				}
				System.out.println("¿Cuanta energía quiere recargar?");
				C1.recargar_energia(n.nextInt());
			}
			catch(InputMismatchException e)
			{
				System.out.println("Se ha introducido una letra en lugar de un número, por favor ingrese un número");
				n.nextLine();
			}
		}
		
	}
}
