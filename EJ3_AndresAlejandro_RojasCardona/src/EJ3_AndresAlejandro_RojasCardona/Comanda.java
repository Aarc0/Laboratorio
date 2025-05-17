package EJ3_AndresAlejandro_RojasCardona;


public class Comanda 
{
	private int idComanda;
	private ElementoMenu[] items;
	public Comanda(int idComanda, ElementoMenu[] items)
	{
		this.idComanda = idComanda;
		this.items = items;
	}
	
	public int getIdComanda() 
	{
		return idComanda;
	}

	public void setIdComanda(int idComanda) 
	{
		this.idComanda = idComanda;
	}

	public ElementoMenu[] getItems() 
	{
		return items;
	}

	public void setItems(ElementoMenu[] items) 
	{
		this.items = items;
	}

	public double calcularSubtotal() 
	{
		double precioElementos = 0;
		for (int i = 0; i < items.length; i++) 
		{
			precioElementos += items[i].getPrecio();
		}
		return precioElementos;
	}

	@Override
	public String toString() 
	{
		String items = "";
		for (int i = 0; i < this.items.length; i++) 
		{
			items = "\n"+items +this.items[i].toString();
		}
		
		return "Comanda [idComanda=" + idComanda + ", items=" + items + "]";
	}
	
	
}
