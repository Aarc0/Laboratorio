
public class herencia 
{
	public static void main(String [] args) 
	{
	
		Periodico doc = new Periodico("Sistemas Grid", "Rosalía Gómez","UCLM", 16, 3, 2009);
		System.out.println("Title: " +doc.getTitulo( ));
		System.out.println("Authors: " + doc.getAutores( ));
		System.out.println("Host Organization: " +doc.getHostOrganization ( ));
		int [ ] date = doc.getFecha();
		System.out.println("Date: "+date[0]+"/"+date[1] + "/"+ date[2]);
		
	}
}
