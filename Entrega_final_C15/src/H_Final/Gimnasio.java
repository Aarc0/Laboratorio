package H_Final;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Gimnasio 
{
	private String nombreG;
	private Equipo equipo;
	private Contador contador;
	private ArrayList<Pokemon> defensores = new ArrayList();
	
	////////////////////////////////////////////
	public void setEquipo(Equipo equipo)
	{
		this.equipo = equipo;
		System.out.println("El gimnasio de "+nombreG+" pertence al equipo "+this.equipo+"\n");
	}
	public Equipo getEquipo()
	{
		return equipo;
	}
	////////////////////////////////////////////
	
	////////////////////////////////////////////
	public String getNombreG() 
	{
		return nombreG;
	}
	public void setNombreG(String nombreG) 
	{
		this.nombreG = nombreG;
	}
	////////////////////////////////////////////
	
	////////////////////////////////////////////
	public Pokemon getDefensores(int i) 
	{
		return defensores.get(i);
	}
	public void setDefensores(ArrayList<Pokemon> defensores) 
	{
		this.defensores = defensores;
	}
	////////////////////////////////////////////
	
	public Gimnasio(Equipo equipo, String nombreG)
	{
		this.equipo = equipo;
		this.nombreG = nombreG;
	}
	
	public void añadirPokemon(Entrenador E)throws GimnasioPlenoException
	{
		//Variable que uso para ir cambiando el numero de pokemon que ha dejado
		int x = 0;
		try
		{
			while(x<3)
			{	
				//Con esto verifico si el gimnasio está lleno, y si lo está lanzo una excepción
				if(defensores.size() == 3) 
				{
					throw new GimnasioPlenoException();
				}
				else
				{ 
					System.out.println(E.getNombre()+" dejó su "+Contador.values()[x]+" Pokemon en el gimnasio de "+nombreG);
					defensores.add(E.getPoke(0));
					E.removerPokemon(E.getPoke(0));
					x++;
				}
			}
		}
		catch(PokemonNoDisponibleException e)
		{
			e.mostrarE1();
		}
	}
	
	public void añadirPokemonEspecifico(Entrenador E, int x)throws GimnasioPlenoException
	{

		try
		{		
			//Con esto verifico si el gimnasio está lleno, y si lo está lanzo una excepción
			if(defensores.size() == 3) 
			{
				throw new GimnasioPlenoException();
			}
			else
			{ 
				System.out.println(E.getNombre()+" dejó su "+Contador.values()[x]+" Pokemon en el gimnasio de "+nombreG);
				defensores.add(E.getPoke(x));
				E.removerPokemon(E.getPoke(x));
			}
		}
		catch(PokemonNoDisponibleException e)
		{
			e.mostrarE1();
		}
	}
	
	public void combates(Pokemon atacante,PrintWriter salida, int combates) throws GimnasioSinDefensoresException
	{
		boolean b = true;
		
		int i = 0;
		//Primero necesito buscar al primer pokemon cuya vida sea mayor que 0 en el gimnasio
		//Para ello voy a usar un bucle for como con el entrenador que buscaba pokeballs con integridad > 0
		
		try
		{
			if(defensores.size()==0) 
			{
				throw new GimnasioSinDefensoresException(atacante.getEntrenador());
			}
			for (i = 0; i < defensores.size(); i++) 
			{
				if(defensores.get(i).getSalud()>0) break;
			}
			System.out.println("\nCOMBATE DE: "+atacante.getNombre()+" VS "+getDefensores(i).getNombre());
			salida.print("Combate "+combates+": "+atacante.getNombre()+" vs ");
			salida.print(getDefensores(i).getNombre()+" - Ganador: " );
			do
			{
				atacante.atacar(defensores.get(i));
				if(defensores.get(i).getSalud()<=0) 
				{
					salida.println(atacante.getNombre());
				}
				
				defensores.get(i).atacar(atacante);
				if(atacante.getSalud()<=0) 
				{
					salida.println(defensores.get(i).getNombre());
				}

			}while(b);
		}
		catch(PokemonDebilitadoException e)
		{
			e.mostrarError();
			if(defensores.get(i).getSalud()<=0) 
			{
				defensores.get(i).volverAlEntrenador();
				defensores.remove(i);
			}
		} 
	}
	
	@Override
	public String toString() 
	{
		return "Gimnasio de " + nombreG + ", equipo: " + equipo+", defensores: "+defensores;
	}
	
	public void estadoGimnasio()
	{
		System.out.println("\n===Estado actual del gimnasio ===");
		System.out.println("\nGimnasio:"+nombreG
						  +"\nEquipo: "+equipo
						  +"\nDefensores: ");
		for (int i = 0; i < 3; i++) 
		{
			if(defensores.isEmpty())
			{
				System.out.println("No hay Pokemons para defender este gimnasio\n");
				break;
			}
			else System.out.println((i+1)+". Pokemon: "+defensores.get(i).toString());
		}
	}
}
