package EJ_OPCIONAL;

public class Main 
{
	public static void main(String[] args) 
	{
		Biblioteca [] pub = new Biblioteca[4];
		pub[0] = new Revista(123  ,2001  ,false  ,5);
		pub[1] = new Revista(1234 ,2002  ,true  ,6);
		pub[2] = new Libro(12345  ,2003  ,true  ,"Pepe");
		pub[3] = new Libro(123456 ,2004  ,false  ,"Juan");
		
		System.out.println("En este momento hay un total de "+publi_prestada(pub)+ " libros prestados\n");
		
		System.out.println("Los libros disponibles son: \n");
		
		for (Biblioteca bib : pub) 
		{
			bib.prestado();
		}
		
		pub[0].prestar();
	}	
	
	public static int publi_prestada(Biblioteca [] pub)
	{
		int i = 0;
		for (Biblioteca n: pub) 
		{
			if(n.isPrestado()) i++;
		}
		return i;
	}	
}
