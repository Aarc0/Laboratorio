package Pokemon;

public class Main 
{
	public static void main(String[] args)
	{
		Pokemons po1 = new Pokemons("Pikachu","Eléctrico");
		Pokemons po2 = new Pokemons("Bulbasaur","Planta");
		Pokemons po3 = new Pokemons("Charmander","Fuego");
		Pokemons po4 = new Pokemons("Squirtle","Agua");
		Pokemons po5 = new Pokemons("Caterpie","Bicho");
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
		System.out.println("Pokemon: "+po1.Getnombre()+" Tipo: "+po1.Gettipo());
		System.out.println("Pokemon: "+po2.Getnombre()+" Tipo: "+po2.Gettipo());
		System.out.println("Pokemon: "+po3.Getnombre()+" Tipo: "+po3.Gettipo()+"\n\n");
		
		System.out.println("== Capturando Pokémon ==");
		// X es contador de pokeballs
		// Y es contador de intentos
		// Z Pokemon por el que vamos
		
		while(x<pkb.length)
		{
			////////////////////////////////////////
			if(z == 0)	aux = po1.Getnombre();
			else if(z == 1)	aux = po2.Getnombre();
			else aux = po3.Getnombre();
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
				if(z == 0)	{entrenador.setPok1(aux); entrenador.setPok1t(po1.Gettipo());}
				else if(z == 1)	{entrenador.setPok2(aux); entrenador.setPok2t(po2.Gettipo());}
				else {entrenador.setPok3(aux); entrenador.setPok3t(po3.Gettipo());}
				y = 0;
				z++;
			}
			
			//Equipo lleno
			if(z == 3)
			{
				aux = po4.Getnombre();
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
				System.out.println("\nNo hay Pokéballs disponibles para capturar a "+po5.Getnombre()+"\n");
			}
		}
		System.out.println("== Estado final de los Pokémon de Ash ==");
		for(int i = 0;i<3;i++)
		{
			if(i == 0) System.out.println("Pokemon: "+entrenador.getPok1()+" Tipo: "+entrenador.getPok1t());
			else if(i == 1) System.out.println("Pokemon: "+entrenador.getPok2()+" Tipo: "+entrenador.getPok2t());
			else System.out.println("Pokemon: "+entrenador.getPok3()+" Tipo: "+entrenador.getPok3t());
		}
	}
}
