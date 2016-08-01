import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Students {
	
	private Integer idGrupo=0;
	private String  nameStudent="";
	
	public static int promedio=0;
	public static int contador=0;
	
	static List<String> listaS = new ArrayList<String>(); 
	static List<Integer> ResultS = new ArrayList<Integer>(); 
	
	//Constructor
	Students(Integer idGroup , String nameStudent)
	{
		this.idGrupo=idGroup;
		this.nameStudent=nameStudent;
		
	}
	
	//Mapa unificar alumnos a un key de grupo
			static Map<Integer, List<String>> mapaSGrupos = new HashMap<Integer, List<String>>();  //mapa para materias de grupo con parametros (idgrupo , lista de materias a ese grupo)
			
			//Lista donde almaceno estudiantes un grupo especifico y poder pasarlo a map para ligarlo con un key de grupo
			List<String> Students = new ArrayList<String>(); //Lista estudiantes
				
		      
			//metodo para agregar lista de materias a mapa con un key (los datos para cada materia se llenan cuando creo objeto en principal por el constructor )
				public  void agregarSaG(int result)
			{
			
					Students.add(this.idGrupo +" "+ nameStudent);   // lleno lista de Materias con variable de nombre de materia y quien imparte
					mapaSGrupos.put(idGrupo, Students);  // lleno mapa de grupomaterias con metodo put, le paso key o numero grupo y asigno lista de las materias que llevara ese grupo  	
					printGrupoStudents(idGrupo, mapaSGrupos,result);  //llamo metodo pasandole como parametro un id para empatarlo con key , y le paso el mapa entero

			}
			
		
				
			//metodo imprimir maaterias de grupo
			public static void printGrupoStudents(Integer idGrupo, Map<Integer, List<String>> studentMap, Integer result)
			{
				List<String> students = studentMap.get(idGrupo);     // creo lista string de materias para igualar lo extraido con metodo 
															      //get la lista de materias asignadas segun  key del mapa coincida con el  idGrupo 
				
				for(String i : students)   // uso foreach con indice string  en la lista que cree arriba llamada materias que tomara valor de todas las materias asignadas al key que le pase como parametro y que iguale con esta lista
				{
					System.out.println("Grupo:"+ i + "Calificacion: " + result);
					//listaS.add(i);
					ResultS.add(result);
					
					promedio=promedio+result;
					contador++;
				}
			}
			
			public static void listaS(){
				
				System.out.println(listaS);
			}
			
			public static int promedio(){  //TotalResult es el promedio , lo uso en junit
				
				int TotalResult=promedio/contador;
				
					
				System.out.println("Promedio: " + promedio/contador);
				
				return TotalResult;
			}
	
	

}
