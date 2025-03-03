package H2;

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
		pkb[3] = new MasterBall(4,1,0.8);
		
		Entrenador E1 = new Entrenador("Ash", 5, pkb);
		
		Pokemons [] pok = new Pokemons[9];
		pok[0] = new Pokemons("Pikachu"      ,"Eléctrico"  ,1,30,0,100);
		pok[1] = new Pokemons("Bulbasaur"    ,"Planta"     ,1,35,0,100);
		pok[2] = new Pokemons("Charmander"   ,"Fuego"      ,1,40,0,100);
		pok[3] = new Pokemons("Squirtle"     ,"Agua"       ,1,25,0,100);
		pok[4] = new Pokemons("Jigglypuff"   ,"Normal"     ,1,20,0,100);
		pok[5] = new Pokemons("Geodude"      ,"Roca"       ,1,50,0,100);
		pok[6] = new Pokemons("Machop"       ,"Lucha"      ,1,45,0,100);
		pok[7] = new Pokemons("Abra"         ,"Psíquico"   ,1,15,0,100);
		pok[8] = new Pokemons("Onix"         ,"Roca"       ,1,60,0,100);
		
		System.out.println("== Inicio Pokemon en main ==");
		pok[0].MostrarPokemon(pok);
		
		/*Datos
		 * Tengo 6 Pokeball
		 * Tengo 9 Pokemons
		 */
		
		System.out.println("\n\n== Capturas ==");
		E1.Captura(pok);
		E1.MostrarPoks();
	}

}
