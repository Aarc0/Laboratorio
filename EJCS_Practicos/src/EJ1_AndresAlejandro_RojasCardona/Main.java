package EJ1_AndresAlejandro_RojasCardona;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner n = new Scanner(System.in);
		boolean b = true;
		Vuelo[] vuelos = new Vuelo[3];
		vuelos[0] = new Vuelo("IB234");
		vuelos[1] = new Vuelo("AA567");
		vuelos[2] = new Vuelo("AF901");
		
		Aeropuerto [] aeropuertos = new Aeropuerto[7];
		aeropuertos[0] = new Aeropuerto("MAD","Madrid");
		aeropuertos[1] = new Aeropuerto("CDG","Paris");
		aeropuertos[2] = new Aeropuerto("JFK","Nueva York");
		aeropuertos[3] = new Aeropuerto("LAX","Los Angeles");
		aeropuertos[4] = new Aeropuerto("ORD","Chicago");
		aeropuertos[5] = new Aeropuerto("MIA","Miami");
		aeropuertos[6] = new Aeropuerto("DXB","Dubai");

		Aeropuerto [] ruta = new Aeropuerto[3];
		int y = 3;
		
		
		//Con esto recorro todos los vuelos 
		for (int i = 0; i < vuelos.length; i++) 
		{
			int x = 0;
			if(i == 2)
			{
				y = 2;
				ruta[2]=null;
			}
			
			System.out.println("Para el vuelo "+vuelos[i].getCodigo()+" por favor indique el código IATA de los aeropuertos por los que pasa SEPARADO POR GUIONES \"-\": ");
			
			String[]  C_separado = n.next().split("-");	
			
			//Ahora tengo que reconocer la ruta del vuelo, para ello tengo que recorrer los aeropuertos que tiene
			for (int j = 0; j < aeropuertos.length&&x<y; j++) 
			{
				//Si coincide el código IATA que se especifico con el código del aeropuerto actual tenemos que establecerlo como un punto de la ruta
				if(C_separado[x].equals(aeropuertos[j].getIATA()))
				{
					//Ya no solo eso sino que también tenemos que agregar ese vuelo al registro de vuelos que pasan por ese aeropuerto
					//Uso x pq x cambia siempre que entra y se establece un vuelo, esto para que queden en orden
					aeropuertos[j].setVuelos(vuelos[i], x);
					
					ruta[x] = aeropuertos[j];
					
					x++;
					j = -1;
				}
			}
			vuelos[i].setRuta(ruta);
		}
		
		do
		{
			System.out.println("Presione 1 si quiere información sobre vuelos y 2 si quiere información sobre los aeropuertos");
			int caso = n.nextInt();
			String codigo;

			switch(caso)
			{
				case 1:
					System.out.println("Por favor introduce el código del vuelo que quieres saber: ");
					codigo = n.next();
					for (int i = 0; i < vuelos.length; i++) 
					{
						if(codigo.equals(vuelos[i].getCodigo()))
						{
							System.out.println(vuelos[i].toString());
						}
					}
					break;
					
			case 2:
				System.out.println("Por favor introduce el código IATA del aeropuerto del que quieres saber información: ");
				codigo = n.next();
				for (int i = 0; i < aeropuertos.length; i++) 
				{
					if(codigo.equals(aeropuertos[i].getIATA()))
					{
						System.out.println(aeropuertos[i].toString());
					}
				}
				break;
			}
			
			System.out.println("Quieres más información sobre vuelos o aeropuertos? Sí(S)/No(N)");
			String opcion = n.next();
			if(opcion.charAt(0) == 'N' || opcion.charAt(0) == 'n')
			{
				b = false;
			}
			
		}while(b);
		
		n.close();
		
		
	}
}
