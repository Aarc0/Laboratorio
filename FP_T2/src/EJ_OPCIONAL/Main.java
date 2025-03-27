package EJ_OPCIONAL;

public class Main 
{
	public static void main(String[] args) 
	{
		Publicacion [] pub = new Publicacion[4];
		pub[0] = new Revista(123  ,2001  ,5);
		pub[1] = new Revista(1234 ,2002  ,6);
		pub[2] = new Libro(12345  ,2003  ,"Pepe");
		pub[3] = new Libro(123456 ,2004  ,"Juan");
		
		System.out.println("En este momento hay un total de "+publi_prestada(pub)+ " libros prestados\n");
		
		System.out.println("Los libros disponibles son: \n");
		
		for (Publicacion bib : pub) 
		{
			bib.prestado();
		}	
		pub[0].prestar();
	}	
	public static int publi_prestada(Publicacion [] pub)
	{
		int i = 0;
		for (Publicacion n: pub) 
		{
			if(n.isPrestado()) i++;
		}
		return i;
	}	
}
