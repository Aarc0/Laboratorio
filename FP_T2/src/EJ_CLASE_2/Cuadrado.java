package EJ_CLASE_2;

class Cuadrado 
{
	 int nLados;
	 int longLado;
	 public Cuadrado(int nLados, int longLado) 
	 {
		 this.nLados = nLados;
		 this.longLado = longLado;
		 invariantes();
	 }
	 
	 private void invariantes() 
	 {
		 //Basicamente el assert lo que hace es decir "Si es distinto de (proposición) pasa(":") Condición que pasará si lo que sucede es distinto
		 // Syntax assert(Condición): Lo que sucede
		 //Es más bien para declarar errores
		 
		 // Un cuadrado debe tener cuatro lados
		 assert (nLados == 4) : "Num lados incorrecto";
		 // La longitud del lado debe estar entre 1 y 3
		 assert (longLado >= 1 && longLado <= 3) : ("Tamaño incorrecto");
	 }
	 
	 public static void main(String[] args) 
	 {
		 Cuadrado cuad1 = new Cuadrado(4,2);
	 }
}
