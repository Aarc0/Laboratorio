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
		Entrenador e1 = new Entrenador("Ash");
		
		
		
		int [] pkb = new int[6];
		//Inicializo la energía de todas las pokeballs a 10
		for(int i = 0; i<pkb.length;i++)
		{
			pkb[i] = 10; 
		}
		
		System.out.println("Pokemon: "+po1.Getnombre()+" Tipo: "+po1.Gettipo());
		System.out.println("Pokemon: "+po2.Getnombre()+" Tipo: "+po2.Gettipo());
		System.out.println("Pokemon: "+po3.Getnombre()+" Tipo: "+po3.Gettipo());
			
	
	}
	
}
