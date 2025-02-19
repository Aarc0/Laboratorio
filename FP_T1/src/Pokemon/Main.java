package Pokemon;
import java.util.Scanner;

public class Main 
{
	static Scanner n = new Scanner(System.in);
	public static void main(String[] args)
	{
		
		Pokemons [] pok = new Pokemons[5];
		String nom;
		String tip;
		for(int i = 0; i<pok.length;i++)
		{
			System.out.println("Introduzca el nombre del pokemon "+(i+1));
			nom = n.next();
			System.out.println("Introduzca el tipo del pokemon "+(i+1));
			tip = n.next();
			
			pok[i] = new Pokemons(nom, tip);
		}
		
		Entrenador entrenador = new Entrenador("Ash");
		
		int x = 0;
		int y = 0;
		int z = 0;
		String aux;
		int [] pkb = new int[6];
		//Inicializo la energía de todas las pokeballs a 10
		for(int i = 0; i<pkb.length;i++)
		{
			pkb[i] = 10; 
		}
		
		System.out.println("== Estado inicial de los Pokémon ==");
		System.out.println("Pokemon: "+pok[0].Getnombre()+" Tipo: "+pok[0].Gettipo());
		System.out.println("Pokemon: "+pok[1].Getnombre()+" Tipo: "+pok[1].Gettipo());
		System.out.println("Pokemon: "+pok[2].Getnombre()+" Tipo: "+pok[2].Gettipo()+"\n\n");
		
		System.out.println("== Capturando Pokémon ==");
		// X es contador de pokeballs
		// Y es contador de intentos
		// Z Pokemon por el que vamos
		
		while(x<pkb.length)
		{
			////////////////////////////////////////
			if(z == 0)	aux = pok[0].Getnombre();
			else if(z == 1)	aux = pok[1].Getnombre();
			else aux = pok[2].Getnombre();
			///////////////////////////////////////
			
			while(y<=1)
			{
				System.out.println("La captura de "+ aux +" falló.");
				pkb[x] -= 4;
				y++;
			}
			if(pkb[x] < 3)
			{
				x++;
			}
			if(y == 2)
			{
				System.out.println("¡Captura exitosa! "+aux+" ahora es tuyo.\n");
				if(z == 0)	entrenador.setpok1(pok[0].Getnombre(),pok[0].Gettipo());
				else if(z == 1)	entrenador.setpok2(pok[1].Getnombre(),pok[1].Gettipo()); 
				else entrenador.setpok3(pok[2].Getnombre(),pok[2].Gettipo()); 
				y = 0;
				z++;
			}
			
			//Equipo lleno
			if(z == 3)
			{
				aux = pok[3].Getnombre();
				System.out.println("== Captura con equipo lleno ==");
				while(y<=1)
				{
					System.out.println("La captura de "+ aux +" falló.");
					pkb[x] -= 4;
					y++;
				}
				if(pkb[x] < 3)
				{
					x++;
				}
				if(y == 2) System.out.println("¡Captura fallida! el entrenador no tiene suficiente espacio.");
				break;
			}
		}
		x = 0;
		for(int i = 0; i<pkb.length;i++)
		{
			pkb[i] = 0;
			x++;
			if(x == 5)
			{
				System.out.println("\nNo hay Pokéballs disponibles para capturar a "+pok[4].Getnombre()+"\n");
			}
		}
		
		
		System.out.println("== Estado final de los Pokémon de Ash ==");
		for(int i = 0;i<3;i++)
		{
			if(i == 0) System.out.println("Pokemon: "+entrenador.getPok1n()+" Tipo: "+entrenador.getPok1t());
			else if(i == 1) System.out.println("Pokemon: "+entrenador.getPok2n()+" Tipo: "+entrenador.getPok2t());
			else System.out.println("Pokemon: "+entrenador.getPok3n()+" Tipo: "+entrenador.getPok3t());
		}
	}
}
