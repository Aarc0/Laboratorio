package H3;

public class Main 
{
	public static void main(String[] args)
	{
		Pokeball[] pkb = new Pokeball[6];
		//Integridad / probabilidad
		pkb[0] = new Pokeball(4,0.1);
		pkb[4] = new Pokeball(4,0.1);
		
		//Integridad / probabilidad / fallos
		pkb[1] = new SuperBall(12,0.2,0);
		pkb[5] = new SuperBall(10,0.2,0);
		
		//Integridad / probabilidad / potencia
		pkb[2] = new UltraBall(12,0.5,0);
		
		//Integridad / probabilidad / estabilidad
		pkb[3] = new MasterBall(1,0.8);
		
		Entrenador E1 = new Entrenador("Ash", 5, pkb);
		
		Pokemons [] pok = new Pokemons[3];
		pok[0] = new Planta("Bulbasaur"      ,"Planta"     ,1 ,30 ,0 ,100 ,100);
		pok[1] = new Fuego("Charmander"    ,"Fuego"      ,1 ,40 ,0 ,100 ,100);
		pok[2] = new Agua("Squirtle"     ,"Agua"       ,1 ,25 ,0 ,100 ,100);
		
		////////////////////////////////////////////////////////
		System.out.println("== Inicio Pokemon en main ==");
		for (Pokemons n : pok) 	{n.MostrarPokemon();}
		////////////////////////////////////////////////////////		
		
		System.out.println("\n\n== Capturas ==");

		//Iterador pokemons atrapados
		
		for (int i = 0; i < pok.length; i++) 
		{
			E1.Captura(pok[i]);
		}
		E1.MostrarPoks();
		
		System.out.println("\n== Batallas ==");
		pok[0].atacar(pok[1]);
		pok[1].atacar(pok[2]);
		pok[2].atacar(pok[0]);
		pok[1].atacar(pok[0]);
		
		

		
		System.out.println("\n==Resultado tras la batalla==");
		for (Pokemons n : pok) {System.out.println(n.toString());}
		
		System.out.println("\n==Fin de la simulación==");
		
	}

}
