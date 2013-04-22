package filesys;

import org.junit.Test;
import static org.junit.Assert.*;


public class TestRepertoire {
	
	@Test
	public void testCalculTaille() throws Exceptions {
		Repertoire repertoire;
		repertoire = new Repertoire ("rep1");
		assert repertoire.calculTaille() >= 0;
	}
	
	@Test
	public void testContenant() throws Exceptions {
		
		Repertoire repertoire = new Repertoire ("rep1");
		Fichier f1 =  new Fichier("f1", 5);
		repertoire.ajouterObjet(f1);
		assertEquals(5, repertoire.calculTaille(), 0);
	}


}





/* package filesys;

import junit.framework.TestCase;

public class TestRepertoire extends TestCase {

	public void testCalculTaille() {
		fail("Not yet implemented");
	}

	public void testRepertoire() {
		fail("Not yet implemented");
	}

	public void testAjouterObjet() {
		fail("Not yet implemented");
	}

	public void testExist() {
		fail("Not yet implemented");
	}

}
*/