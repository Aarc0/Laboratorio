package Ej2;

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
		 // Un cuadrado debe tener cuatro lados
		 assert (nLados == 4) : "Num lados incorrecto";
		 // La longitud del lado debe estar entre 1 y 3
		 assert (longLado >= 1 && longLado <= 3) : ("Tamaño incorrecto");
	 }
	 
	 public static void main(String[] args) 
	 {
		 Cuadrado cuad1 = new Cuadrado(4,4);
	 }
}
