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
		
		
		//Aquí creo al entrenador
		System.out.println("==Estado inicial de los Pokemons==");
		for(int i = 0;i<3;i++)
		{
			System.out.println("Pokemons: "+pok[i].Getnombre()+"Tipo: "+pok[i].Gettipo());
		}

		Pokeball [] pkb = new Pokeball[6];
		
		//Pongo la integridad de todas a 10
		for(int i = 0; i<pkb.length;i++)
		{
			pkb[i] = new Pokeball(10,3);
			System.out.println(pkb[1].getIntegridad()+pkb[1].);
		}
		
		Entrenador entrenador = new Entrenador("Ash",pok,pkb);

		System.out.println("\n==Capturando Pokemons==");
		

		
	}
}
