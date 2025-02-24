package Pokemon;

public class Pokemons 
{
	private String nombre;
	private String tipo;
	
	public void Setnombre(String nombre)
	{
		this.nombre = nombre;
	}
	public String Getnombre()
	{
		return nombre;
	}
	public void Settipo(String tipo)
	{
		this.tipo = tipo;
	}
	public String Gettipo()
	{
		return tipo;
	}
	
	public Pokemons(String nombre, String tipo) 
	{
		this.nombre = nombre;
		this.tipo = tipo;
	}
	
	@Override
    public String toString() {
        return nombre + " (" + tipo + ")";
    }
	
	
}

