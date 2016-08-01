import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group 
{
	private Integer idGrupo=0;  //asigno nombre maestro
	private String nombreMateria=null;  //recogo nombre materia
	private String nombreMaestro=null;  //asigno nombre maestro
	
		//Constructor inicializar valores 
		Group(int idGrupo,String nombreMateria,String nombreMaestro)
		{
			this.idGrupo=idGrupo;
			this.nombreMateria=nombreMateria;
			this.nombreMaestro=nombreMaestro;
		}

   
		//Mapa unificar Materias y Maestros a un key
		Map<Integer, List<String>> mapaGMaterias = new HashMap<Integer, List<String>>();  //mapa para materias de grupo con parametros (idgrupo , lista de materias a ese grupo)
		
		//Lista donde almaceno las materias para un grupo especifico y poder pasarlo a map para ligarlo con un key
		List<String> Materias = new ArrayList<String>(); //Lista Materias y quien imparte
			
	      
		//metodo para agregar lista de materias a mapa con un key (los datos para cada materia se llenan cuando creo objeto en principal por el constructor )
			public boolean  agregarMaG()
		{
				boolean NoNulo=false;  //esta condicion devuelve true cuando los valores no estan nulos
				if(this.idGrupo!=0 && !(this.nombreMaestro==null && this.nombreMateria==null))
				{
					NoNulo=true;
				}
				 Materias.add(this.nombreMateria +" "+ nombreMaestro);   // lleno lista de Materias con variable de nombre de materia y quien imparte
				 mapaGMaterias.put(idGrupo, Materias);  // lleno mapa de grupomaterias con metodo put, le paso key o numero grupo y asigno lista de las materias que llevara ese grupo  	
			    printGrupoMaterias(idGrupo, mapaGMaterias);  //llamo metodo pasandole como parametro un id para empatarlo con key , y le paso el mapa entero
			    return NoNulo;
		}
		
	
			
		//metodo imprimir maaterias de grupo
		public static void printGrupoMaterias(Integer idGrupo, Map<Integer, List<String>> grupoMap)
		{
			List<String> materias = grupoMap.get(idGrupo);     // creo lista string de materias para igualar lo extraido con metodo 
														      //get la lista de materias asignadas segun  key del mapa coincida con el  idGrupo 
			
			for(String i : materias)   // uso foreach con indice string  en la lista que cree arriba llamada materias que tomara valor de todas las materias asignadas al key que le pase como parametro y que iguale con esta lista
			{
				//System.out.println(i + " Grupo:"+ idGrupo.toString());
				
				
				//System.out.println(materias);
			}
		}
	
   }

		
		
	

