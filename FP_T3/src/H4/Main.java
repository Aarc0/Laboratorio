package H4;

public class Main 
{
	public static void main(String[] args)
	{
		System.out.println("== Inicializando el mundo Pokémon ==\n");
		Equipo equipo;
		Pokeball[] pkb = new Pokeball[7];
		//Integridad / probabilidad / estabilidad
		pkb[0] = new MasterBall(1,0.9);
		pkb[1] = new MasterBall(1,0.9);
		pkb[2] = new MasterBall(1,0.9);
		pkb[3] = new MasterBall(1,0.9);
		pkb[4] = new MasterBall(1,0.9);
		pkb[5] = new MasterBall(1,0.9);
		pkb[6] = new MasterBall(1,0.9);
		
		  ///////////////////////////////////////////////////////////////////
		 //////                ENTRENADORA MISTY				////////////
		///////////////////////////////////////////////////////////////////
		Entrenador E1 = new Entrenador("Misty", 15, pkb,Equipo.Amarillo);
		System.out.println("=== Creando primer entrenador ("+E1.getEquipo()+") ===");
		System.out.println("Entrenador "+E1.getNombre()+" creado (Equipo "+Equipo.Amarillo+") con 7 MasterBalls");
		Pokemon [] pok = new Pokemon[9];
		//			 NOMBRE POKEMON       TIPO        NIVEL  VELOCIDAD      EXP     SALUD	 PRESION AGUA
		pok[0] = new Agua("Squirtle"	,"Agua"       ,10 		,30 		,0 		,100 		,90);
		pok[1] = new Agua("Starmie"		,"Agua"       ,12 		,40 		,0 		,110 		,100);
		pok[2] = new Agua("Gyarados"	,"Agua"       ,15 		,25 		,0 		,130 		,120);
		pok[3] = new Agua("Vaporeon"	,"Agua"		  ,14 		,30 		,0 		,120 		,110);
		pok[4] = new Agua("Poliwrath"	,"Agua"		  ,13 		,30 		,0 		,115 		,105);
		pok[5] = new Agua("Blastoise"	,"Agua"		  ,16 		,30 		,0 		,140 		,130);
		//Nah literalmente GolDuck es god
		pok[6] = new Agua("Golduck"		,"Agua"		  ,101 		,101		,101 	,101 		,101);	
		pok[7] = new Agua("Golduck"		,"Agua"		  ,101 		,101		,101 	,101 		,101);	
		pok[8] = new Agua("Golduck"		,"Agua"		  ,101 		,101		,101 	,101 		,101);	
		
		  ///////////////////////////////////////////////////
		 ///   INICIALIZACIÓN DE CAPTURA DE POKEMON 	  //
		///////////////////////////////////////////////////
		System.out.println("\n== Capturando 6 Pokemon de agua para Misty ==");

		for (int i = 0; i < pok.length-3; i++) 
		{
			E1.Captura(pok[i]);
		}
		
		System.out.print("\n=== Pokemon capturados por Misty ===");
		E1.MostrarPoks();


		System.out.println("\n=== DEMOSTRACIÓN de EquipoCompletoException ==="+"\nIntentando capturar un séptimo Pokemon para Misty...");
		E1.Captura(pok[6]);	

		  ///////////////////////////////////////////////////
		 ////   INICIALIZACIÓN DE PRIMER GIMNASIO       ////
		///////////////////////////////////////////////////
		System.out.println("\n=== Creando un gimnasio ===");
		Gimnasio gym1 = new Gimnasio(Equipo.Neutral,"Ciudad Fulgor");
		System.out.println(gym1.toString());

		System.out.println("\n=== Dejando 3 Pokemon de Misty en el gimnasio===");
		E1.DejarPokemon(gym1);
		
		//DEJO 3 POKEMON PARA PROBAR QUE NO DEVUELVA LOS POKEMON AL ENTRENADOR SI YA ESTE NO TIENE ESPACIO
		System.out.println("\n===AÑADO 3 POKEMON NUEVOS AL EQUIPO DE MISTY PARA PROBAR LUEGO EL DEVOLVER LOS POKEMON QUE DEJÓ EN EL GIMNASIO===\n");
		E1.setPoke(pok[6]);
		E1.setPoke(pok[7]);
		E1.setPoke(pok[8]);
		
		gym1.EstadoGimnasio();
		
		
		  ///////////////////////////////////////////////////////////////////
		 ///////                SEGUNDO ENTRENADOR				////////////
		///////////////////////////////////////////////////////////////////
		
		Pokeball[] pkb2 = new Pokeball[6];
		//Integridad / probabilidad / estabilidad
		pkb2[0] = new MasterBall(1,0.9);
		pkb2[1] = new MasterBall(1,0.9);
		pkb2[2] = new MasterBall(1,0.9);
		pkb2[3] = new MasterBall(1,0.9);
		pkb2[4] = new MasterBall(1,0.9);
		pkb2[5] = new MasterBall(1,0.9);

		
		  ///////////////////////////////////////////////////////////////////
		 ///////                ENTRENADOR LANCE				////////////
		///////////////////////////////////////////////////////////////////
		
		
		Entrenador E2 = new Entrenador("Lance", 18, pkb2,Equipo.Amarillo);
		System.out.println("\n=== Creando segundo entrenador ("+E2.getEquipo()+") ===");
		System.out.println("Entrenador "+E2.getNombre()+" creado (Equipo "+E2.getEquipo()+") con 6 MasterBalls");


		System.out.println("\n===PRUEBO LA EXCEPCIÓN DE POKEMON YA CAPTURADO===");
		E2.Captura(pok[3]);
		
		Pokemon [] pok2 = new Pokemon[3];
		//			   	 NOMBRE POKEMON       TIPO        NIVEL  VELOCIDAD      EXP     SALUD	 TEMPERATURA LLAMA
		pok2[0] = new Fuego("Charizard"		,"Fuego"       ,2 		,47 		,0 		,140 		,10);
		pok2[1] = new Fuego("Arcanine"		,"Fuego"       ,5 		,45			,0 		,130 		,14);
		pok2[2] = new Fuego("Rapidash"		,"Fuego"       ,8 		,48 		,0 		,125 		,3);	
		
		
		  ///////////////////////////////////////////////////
		 ///   INICIALIZACIÓN DE CAPTURA DE POKEMON 	  //
		///////////////////////////////////////////////////
		System.out.println("\n== Capturando Pokemon de fuego para Lance ==");

		for (int i = 0; i < pok2.length; i++) 
		{
			E2.Captura(pok2[i]);
		}

		System.out.print("\n=== Pokemon capturados por Lance ===");
		E2.MostrarPoks();
		
		System.out.println("\n===DEMOSTRACIÓN de GIMNASIOPLENOEXCEPTION===");
		System.out.print("Intentado que Lance deje un Pokémon en el gimnasio ya lleno...");
		E2.DejarPokemon(gym1);
		
		  ///////////////////////////////////////////////////////////////////
		 ///////                TERCER ENTRENADOR				////////////
		///////////////////////////////////////////////////////////////////
		
		Pokeball[] pkb3 = new Pokeball[6];
		//Integridad / probabilidad / estabilidad
		pkb3[0] = new MasterBall(1,0.9);
		pkb3[1] = new MasterBall(1,0.9);
		pkb3[2] = new MasterBall(1,0.9);
		pkb3[3] = new MasterBall(1,0.9);
		pkb3[4] = new MasterBall(1,0.9);
		pkb3[5] = new MasterBall(1,0.9);		
		  ///////////////////////////////////////////////////////////////////
		 ///////                ENTRENADORA ERIKA				////////////
		///////////////////////////////////////////////////////////////////
		
		
		Entrenador E3 = new Entrenador("Erika", 20, pkb3,Equipo.Azul);
		System.out.println("\n=== Creando tercer entrenador ("+E3.getEquipo()+") ===");
		System.out.println("Entrenador "+E3.getNombre()+" creada (Equipo "+E3.getEquipo()+") con 6 MasterBalls");
		
		Pokemon [] pok3 = new Pokemon[3];
		//			 	     NOMBRE POKEMON       TIPO        NIVEL  VELOCIDAD      EXP     SALUD	 DENSIDAD ESPORAS
		pok3[0] = new Planta("Venusaur"		,"Planta"       ,25 		,45 		,0 		,150 		,8);
		pok3[1] = new Planta("Victreebel"	,"Planta"       ,24 		,43			,0 		,145 		,5);
		pok3[2] = new Planta("Exeggutor"	,"Planta"       ,26 		,46 		,0 		,155 		,9);	
		
		  ///////////////////////////////////////////////////
		 ///   INICIALIZACIÓN DE CAPTURA DE POKEMON 	  //
		///////////////////////////////////////////////////
		System.out.println("\n== Capturando Pokemon de planta para Erika ==");

		for (int i = 0; i < pok3.length; i++) 
		{
			E3.Captura(pok3[i]);
		}

		System.out.print("\n=== Pokemon capturados por Erika ===");
		E3.MostrarPoks();
		
		System.out.println("\n===DEMOSTRACIÓN de EQUIPOINCORRECTOEXCEPTION===");
		System.out.print("Intentado que Erika deje un Pokémon en el gimnasio ya lleno...");
		E3.DejarPokemon(gym1);
		
		System.out.println("\n== DEMOSTRACIÓN DE PokemonDebilitadoException (implícita en los combates) ==");
		
		System.out.println("\n===Estado del gimnasio antes del ataque===");
		gym1.EstadoGimnasio();
		
		E3.AtacarGimnasio(gym1);
		
		gym1.EstadoGimnasio();
		
		E3.DejarPokemon(gym1);
		
		gym1.EstadoGimnasio();
		
		  ///////////////////////////////////////////////////////////////////
		 ///////                CUARTO ENTRENADOR				////////////
		///////////////////////////////////////////////////////////////////
		Pokeball[] pkb4 = new Pokeball[6];
		//Integridad / probabilidad / estabilidad
		pkb4[0] = new MasterBall(1,0.9);
		pkb4[1] = new MasterBall(1,0.9);
		pkb4[2] = new MasterBall(1,0.9);
		pkb4[3] = new MasterBall(1,0.9);
		pkb4[4] = new MasterBall(1,0.9);
		pkb4[5] = new MasterBall(1,0.9);	
		  ///////////////////////////////////////////////////////////////////
		 ///////                ENTRENADOR BLAINE				////////////
		///////////////////////////////////////////////////////////////////
		
		Entrenador E4 = new Entrenador("Blaine", 22, pkb4,Equipo.Rojo);
		System.out.println("\n=== Creando Cuarto entrenador ("+E4.getEquipo()+") ===");
		System.out.println("Entrenador "+E4.getNombre()+" creado (Equipo "+E4.getEquipo()+") con 6 MasterBalls");
		
		Pokemon [] pok4 = new Pokemon[2];
		//			 	     NOMBRE POKEMON       TIPO        NIVEL  VELOCIDAD      EXP     SALUD	 TEMPERATURA LLAMA
		pok4[0] = new Fuego("Magmar"			,"Fuego"       ,20 		,45 		,0 		,135 		,145);
		pok4[1] = new Fuego("Flareon"			,"Fuego"       ,21 		,47			,0 		,140 		,150);	
		
		  ///////////////////////////////////////////////////
		 ///   INICIALIZACIÓN DE CAPTURA DE POKEMON 	  //
		///////////////////////////////////////////////////
		System.out.println("\n== Capturando Pokemon de Fuego para Blaine ==");

		for (int i = 0; i < pok4.length; i++) 
		{
			E4.Captura(pok4[i]);
		}

		System.out.print("\n=== Pokemon capturados por Blaine ===");
		E4.MostrarPoks();
		
		E4.AtacarGimnasio(gym1);		
		
		System.out.println("=== FINALIZACIÓN DEL MUNDO POKEMON ===");

	}
}
