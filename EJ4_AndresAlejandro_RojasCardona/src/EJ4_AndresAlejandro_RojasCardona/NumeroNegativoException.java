package EJ4_AndresAlejandro_RojasCardona;

import java.util.Scanner;

public class NumeroNegativoException extends Exception
{
	private Circulo circulo;
	private Cilindro cilindro;
	
	public NumeroNegativoException(Cilindro cilindro) 
	{
		this.cilindro = cilindro;
	}
	public NumeroNegativoException(Circulo circulo) 
	{
		this.circulo = circulo;
	}

	public void mostrarError()
	{
		System.err.println(toString());
		if(cilindro != null)
		{
			corregirCilindro();
		}
		if(circulo != null)
		{
			corregirCirculo();
		}
		
	}
	
	public void corregirCirculo()
	{
		if(circulo.getRadio()<0)
		{
			circulo.setRadio(corregirRadio());
		}
	}
	
	public void corregirCilindro()
	{
		if(cilindro.getAltura()<0)
		{
			cilindro.setAltura(corregirAltura());
		}
		if(cilindro.getRadio()<0)
		{
			cilindro.setRadio(corregirRadio());
		}
	}
	
	public double corregirRadio()
	{
		Scanner n = new Scanner(System.in);
		System.out.println("El radio es negativo, por favor ingrese un radio positivo");
		double valorCorregido = n.nextDouble();
		while(valorCorregido<0)
		{
			System.out.println("Por favor ingrese un nuevo valor positivo");
			valorCorregido = n.nextDouble();
		}
		return valorCorregido;
	}
	
	public double corregirAltura()
	{
		Scanner n = new Scanner(System.in);
		System.out.println("La altura es negativa, por favor ingrese una altura positiva");
		double valorCorregido = n.nextDouble();
		while(valorCorregido<0)
		{
			System.out.println("Por favor ingrese un nuevo valor positivo");
			valorCorregido = n.nextDouble();
		}
		return valorCorregido;
	}
	
	@Override
	public String toString() 
	{
		return "Las dimensiones deben ser números positivos";
	}
	
	
}
