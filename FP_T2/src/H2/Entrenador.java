package H2;

public class Entrenador 
{
	private Pokemons [] poke;
	private Pokeball [] pkb;
	private int nivel;
	private String nombre;
	
	
	public Entrenador(String nombre, int nivel, Pokeball[] pkb ) 
	{
		this.poke = new Pokemons[9];
		this.pkb = pkb;
		this.nombre = nombre;
		this.nivel = nivel;
	}

	//////////////////////////////////////////
	public Pokemons[] getPoke() 
	{
		return poke;
	}

	public void setPoke(Pokemons poke, int i) 
	{
		this.poke[i] = poke;
	}
	//////////////////////////////////////////
	
	//////////////////////////////////////////
	public Pokeball[] getPkb() 
	{
		return pkb;
	}

	public void setPkb(Pokeball[] pkb) 
	{
		this.pkb = pkb;
	}
	//////////////////////////////////////////
	
	//////////////////////////////////////////
	public String getNombre() 
	{
		return nombre;
	}
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	//////////////////////////////////////////
		
	public void Captura(Pokemons[] pok)
	{
		double random;
		
		//Identificador pokemons
		int po = 0;
		
		//Identificador pokeballs
		int i = 0;
		
		//Modificador de la integridad
		int mod;
		
		//Modificador de potencia
		double pot=0;
		
		//Modificador de fallos
		int fallos=0;
		
		//Modificador de pokemons capturados
		int cap = 0;
		
		String aux;
		
		while(i<pkb.length && po<pok.length) 
		{			
			random = Math.round(Math.random() * 10.0) / 10.0;
			//De esta manera hago que el texto cambie dependiendo de el tipo de Pokeball que sea
			aux = pkb[i].getClass().getSimpleName();
			
			
			//Tengo que seguir con las probabilidades
		/*	if(aux.charAt(0)=='P') random = Math.round(Math.random() * 10.0) / 10.0;				//Probabilidad de 1/10
			else if(aux.charAt(0)=='S') random = Math.round((0.1+Math.random()) * 5.0) / 10.0;		//Probabilidad de 1/5
			else if(aux.charAt(0)=='U') random = Math.round(Math.random()); 						//Probabilidad del 50%
			else if(aux.charAt(0)=='M') random = Math.round(Math.random() * 10.0) / 10.0; */
			
			//Se cambie lo que contiene aux
			if(aux.charAt(0)=='P') aux = "integridad: "+pkb[i].getIntegridad();
			else if(aux.charAt(0)=='S') aux = "integridad: "+pkb[i].getIntegridad()+" | Rachas: "+(((SuperBall)pkb[i]).getFallo());
			else if(aux.charAt(0)=='U') aux = "integridad: "+pkb[i].getIntegridad()+" | Potencia: "+(((UltraBall)pkb[i]).getPotencia());
			else if(aux.charAt(0)=='M') aux = "Estabilidad: "+((MasterBall)pkb[i]).getEstabilidad();
				
			System.out.println("Usando la "+pkb[i].getClass().getSimpleName()+" probabilida de captura: "+ (pkb[i].getPercent()*100)+"% | "+aux);
			
			//Se vuelve a cambiar lo que contiene aux
			aux = pkb[i].getClass().getSimpleName();
			
			if(pkb[i].getPercent() == 1)
			{	
				switch (aux.charAt(0))
				{
					case 'U':
						System.out.println("¡Captura exitosa! "+pok[po].getNombre()+" ahora es tuyo");
						setPoke(pok[po], cap);
						po++;
						i++;
						cap++;
						break;	

					case 'M':
						System.out.println("¡Captura exitosa! "+pok[po].getNombre()+" ahora es tuyo");
						double x = pok[po].getSalud() * (1-((MasterBall)pkb[i]).getEstabilidad());
						Math.round(x);
						x = pok[po].getSalud() - x;
						pok[po].setSalud((int)x);
						setPoke(pok[po], cap);
						cap++;
						po++;
						i++;
						break;
				}				
			}
			else if(pkb[i].getPercent()==0.5)
			{
				random = Math.round(Math.random());
				double aux1 = Math.round(Math.random());
				if(random == aux1)
				{
					System.out.println("¡Captura exitosa! "+pok[po].getNombre()+" ahora es tuyo");
					setPoke(pok[po], cap);
					po++;
					i++;
					cap++;
				}
				else
				{
					System.out.println("La captura de "+pok[po].getNombre()+" falló");
					mod = pkb[i].integridad-4;
					pkb[i].setIntegridad(mod);
					pot += 0.2;
					((UltraBall)pkb[i]).setPotencia(pot);
					if(pkb[i].getIntegridad()<=0) i++;
					if(((UltraBall)pkb[i]).getPotencia()==0.4) ((UltraBall)pkb[i]).setPercent(1);
					po++;
				}
			}
			
			else if(random != pkb[i].getPercent())
			{	
				System.out.println("La captura de "+pok[po].getNombre()+" falló");
				po++;
				
				switch (aux.charAt(0))
				{
					case 'P':
						mod = pkb[i].integridad-4;
						pkb[i].setIntegridad(mod);
						if(pkb[i].getIntegridad()<=0) i++; 
						break;
						
					case 'S':
						mod = pkb[i].integridad-4;
						pkb[i].setIntegridad(mod);
						pkb[i].setPercent(pkb[i].getPercent()+0.1);
						fallos+=1;
						((SuperBall)pkb[i]).setFallo(fallos);
						if(pkb[i].getIntegridad()<=0) i++; 
						break;	

					/*case 'U':
						mod = pkb[i].integridad-4;
						pkb[i].setIntegridad(mod);
						pot += 0.2;
						((UltraBall)pkb[i]).setPotencia(pot);
						if(pkb[i].getIntegridad()<=0) i++;
						if(((UltraBall)pkb[i]).getPotencia()==0.4) ((UltraBall)pkb[i]).setPercent(1);
						break;*/
				}
			}
			else if(random == pkb[i].getPercent()) 
			{
				System.out.println("¡Captura exitosa! "+pok[po].getNombre()+" ahora es tuyo");
				setPoke(pok[po], cap);
				po++;
				i++;
				cap++;
			}
		}
	}
	public void MostrarPoks()
	{
		System.out.println("\n\n===Estado final de los Pokemons de "+getNombre()+"===");
		int i = 0;
		while(i<poke.length)
		{
			if(poke[i] == null) break;
			System.out.println("Nombre: "+poke[i].getNombre()+" Tipo: "+poke[i].getTipo()+" Nivel: "+poke[i].getNivel()+" Velocidad: "+poke[i].getVelocidad()+" Experiencia: "+poke[i].getExperiencia()+" Salud: "+poke[i].getSalud());
			i++;
		}
	}
}
