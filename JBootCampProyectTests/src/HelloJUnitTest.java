import static org.junit.Assert.*;

import org.junit.Test;

public class HelloJUnitTest {

	@Test
	public void ListGroupsNotNull() 
	{
		
		//fail("Not yet implemented");
		//Group G = new Group(0, null, null);
		Group G = new Group(1, "uno", "uno");
		assertTrue(G.agregarMaG());

	}
	
	
	@Test
	public void AverageGreaterthanZero()
	{
		Students g2Student1 = new Students(2,"Nallely" );
		Students g2Student2 = new Students(2,"Raquel" );
					
		//Agrego students del grupo 2 a mapa y calificacion
		g2Student1.agregarSaG(70);
		g2Student2.agregarSaG(0);
		
		assertNotEquals("Promedio es mayor a 0", 0, Students.promedio());
	}
	
	
	

	
	

}
