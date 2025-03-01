package EJ_OP_1;

public class Main 
{
	public static void main(String[] args) 
	{
		Alumnos [] aluPu = new Alumnos[3];
		aluPu[0] = new Alumnos(5,"No discapacitado");
		aluPu[1] = new Alumnos(8,"Discapacitado");
		aluPu[2] = new Alumnos(11,"Discapacitado");
		
		Alumnos[] aluPri = new Alumnos[2];
		aluPri[0] = new Alumnos(3,"No discapacitado");
		aluPri[1] = new Alumnos(12,"Discapacitado");
		
		//Creo el objeto colegio que guarda tanto el estado como la cantidad de alumnos que hay
		Colegio [] cole = new Colegio[2];
		cole[0] = new Colegio("Publico", aluPu);
		cole[1] = new Colegio("Privado", aluPri);
		
		//Aqui le paso ambos datos, que el colegio es publico y los alumnos de dicho colegio
		Museo museo = new Museo(0,0,0,0); 
		System.out.println(museo.toString());
		System.out.println();
		museo.cobro(cole);
		System.out.println(museo.toString());
	}

}
