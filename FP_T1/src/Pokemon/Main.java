package Pokemon;

public class Main 
{
	public static void main(String[] args)
	{
		//Aquí creo los pokemons que hay en total
		Pokemons [] pok = new Pokemons[5];		
		pok[0] = new Pokemons("Pikachu", "Eléctrico");
		pok[1] = new Pokemons("Bulbasaur", "Planta");
		pok[2] = new Pokemons("Charmander", "Fuego");
		pok[3] = new Pokemons("Squirtle", "Agua");
		pok[4] = new Pokemons("Caterpie", "Bicho");
		
		
		System.out.println("==Estado inicial de los Pokemons==");
		for(int i = 0;i<3;i++)
		{
			System.out.println("Pokemons: "+pok[i].Getnombre()+"Tipo: "+pok[i].Gettipo());
		}

		//PONGO LA INTEGRIDAD DE TODAS A 10
		Pokeball [] pkb = new Pokeball[6];
		for(int i = 0; i<pkb.length;i++)
		{
			pkb[i] = new Pokeball(10);
		}
		
		Entrenador entrenador = new Entrenador("Ash",pkb);
			
		System.out.println("\n==Capturando Pokemons==");
		int a = 0;
		while(a<pok.length-1)
		{	
			entrenador.atrapar(pok[a],a);
			a++;
		}
		
		//DESDE AQUÍ SE EMPIEZA LA CAPTURA SIN ENERGÍA EN LAS POKEBALLS
		for(int i = 0; i<pkb.length;i++)
		{
			pkb[i].setIntegridad(0);
		}
		while(a<pok.length)
		{	
			entrenador.atrapar(pok[a],a);
			a++;
		}	
		System.out.println("\n"+entrenador.toString());
	}
}
