
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
	    //Creo Materias y maestros para Grupo 1
		Group g1Materia1 = new Group(1,"Matematicas" , "FlorAdriana");
		Group g1Materia2 = new Group(1,"Quimica" , "RicardoVillalobos");
		
		//agreo materias del grupo 1 a mapa 
		g1Materia1.agregarMaG();
		g1Materia2.agregarMaG();
	*/
		
	/*
		//Creo Materias y maestros para Grupo 2
		Group g2Materia1 = new Group(2,"pruebas1" , "pruebas1");
		Group g2Materia2 = new Group(2,"pruebas2" , "pruebas2");
		
		//Agrego materias del grupo 2 a mapa
		g2Materia1.agregarMaG();
		g2Materia2.agregarMaG();
		
	  */
		
		//creo estudiantes para grupo 1
		Students g1Student1 = new Students(1,"Miguel" );
		Students g1Student2 = new Students(1,"Jose" );
			
		//Agrego students del grupo 1 a mapa y calificacion
		g1Student1.agregarSaG(50);
		g1Student2.agregarSaG(50);
		
		
		//creo estudiantes para grupo 2
		Students g2Student1 = new Students(2,"Nallely" );
		Students g2Student2 = new Students(2,"Raquel" );
					
		//Agrego students del grupo 2 a mapa y calificacion
		g2Student1.agregarSaG(50);
		g2Student2.agregarSaG(100);
		Students.promedio();
	 //Students.listaS(); //lista
		
		
		
		
		
		
	}
	
	
	
}
