package EJ_CLASE_3;

import java.util.Objects;

public class Rueda 
{
	private int dimension;
	private String ID;
	
	////////////////////////////////////////////
	public int getDimension() 
	{
		return dimension;
	}
	public void setDimension(int dimension) 
	{
		this.dimension = dimension;
	}
	////////////////////////////////////////////
	
	////////////////////////////////////////////
	public String getID() 
	{
		return ID;
	}
	public void setID(String ID) 
	{
		this.ID = ID;
	}
	////////////////////////////////////////////
	
	////////////////////////////////////////////
	public Rueda(int dimension, String ID) 
	{
	
		this.dimension = dimension;
		this.ID = ID;
	}
	////////////////////////////////////////////

	@Override
	public boolean equals(Object obj) 
	{
		//Compara primero si es el mismo objeto
		if (this == obj)	return true;
		
		//Compara el ID de mi objeto principal con el ID del otro objeto
		//Compara la dimensión de mi objeto principal con la dimensión del otro objeto
		else if(this.ID == ((Rueda)obj).getID() && this.dimension == ((Rueda)obj).getDimension()) return true;
		
		return false;
	}
	
	
	
}
