package EJ3_AndresAlejandro_RojasCardona;

public class Cuenta extends Comanda 
{
	private ClienteRestaurante cliente;
	private double totalFinal;
	public Cuenta(int idComanda, ElementoMenu[] items, ClienteRestaurante cliente) 
	{
		super(idComanda,items);
		this.cliente = cliente;
	}
	
	public ClienteRestaurante getCliente() 
	{
		return cliente;
	}

	public void setCliente(ClienteRestaurante cliente) 
	{
		this.cliente = cliente;
	}

	public double getTotalFinal() 
	{
		return totalFinal;
	}

	public void setTotalFinal(double totalFinal) 
	{
		this.totalFinal = totalFinal;
	}

	public double calcularTotalConImpuesto(double porcentajeIVA)
	{
		//Calculo el impuesto
		double totalFinalIVA = totalFinal*(porcentajeIVA/100);
		
		//Lo sumo al totalFinal
		totalFinal = totalFinalIVA+totalFinal;
		
		return totalFinal;
	}
	public double aplicarDescuentoPromocional(double porcentajeDescuento)
	{
		double totalFinalDescuento = totalFinal*(porcentajeDescuento/100);
		totalFinal = totalFinal - totalFinalDescuento;
		return totalFinal;
	}

	
	@Override
	public String toString() 
	{
		return super.toString()+"\n Información del cliente-Restaurante: "+cliente.toString()+", total final: "+totalFinal;
	}
}
