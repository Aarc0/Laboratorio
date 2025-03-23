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
		
		Pokemons [] pok = new Pokemons[4];
		pok[0] = new Planta("Bulbasaur"     ,"Planta"     ,1 ,30 ,0 ,100 ,100);
		pok[1] = new Fuego("Charmander"    	,"Fuego"      ,1 ,40 ,0 ,100 ,100);
		pok[2] = new Agua("Squirtle"     	,"Agua"       ,1 ,25 ,0 ,100 ,100);
		pok[3] = new Roca("Geodude"			,"Roca"		  ,1 ,30 ,0 ,100 ,100);
		
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
		for (int i = 0; i < pok.length; i++) 
		{
			for (int j = 0; j < pok.length; j++) 
			{
				if(i == j) continue;
				pok[i].atacar(pok[j]);
			}
		}
		
		for (int i = 0; i < pok.length; i++) 
		{
			//De esta manera se llama a un método sin necesidad de un objeto, lo que si es que tienes que volver ese método estático
			Pokemons.Examinar(pok[i]);
		}
		
		System.out.println("\n==Resultado tras la batalla==");
		for (Pokemons n : pok) {System.out.println(n.toString());}
		
		System.out.println("\n==Fin de la simulación==");
		
	}

}
