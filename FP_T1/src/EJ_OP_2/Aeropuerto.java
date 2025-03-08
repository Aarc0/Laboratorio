package EJ_OP_2;

public class Aeropuerto 
{
	public static void main(String[] args) 
	{
		Maleta [] maleta = new Maleta[2];
		maleta[0] = new Maleta(true,false);
		maleta[1] = new Maleta(true,true);
		
		Pasajero[] pasajero = new Pasajero[2];
		pasajero[0] = new Pasajero(maleta[0], "Canadiense", "000000A" );
		pasajero[1] = new Pasajero(maleta[1], "Cobayense", "111111B" );
		
		Arco arco = new Arco();

		boolean b;
		
		for (int i = 0; i < pasajero.length; i++) 
		{
			System.out.println("====Escaneo del pasajero número "+(i+1)+"====\n");
			b = arco.escanear(pasajero[i]);
			
			if(b) 
			{
				System.out.println("El pasajero número "+(i+1)+" puede pasar\n");
				arco.setnPasajeros(arco.getnPasajeros()+1);
			}
			
			else 
			{
				System.out.println("El pasajero número "+(i+1)+" no puede pasar\n");
				arco.setnPasajerosSospechosos(arco.getnPasajerosSospechosos()+1);
			}
		}
	}
}