package filesys;

import org.junit.Test;
import static org.junit.Assert.*;


public class TestRepertoire {
	
	@Test
	public void testCalculTaille() {
		Repertoire repertoire = new Repertoire ("rep1");
		assert repertoire.getTaille() >= 0;
	}

	
	@Test
	public void testContenant() throws Exceptions {
		
		Repertoire repertoire = new Repertoire ("rep1");
		Fichier f1 =  new Fichier("f1", 5);
		repertoire.ajouterObjet(f1);
		assertEquals(5, repertoire.getTaille());
	}
	
	@Test
	public void testdoubleContenant() throws Exceptions {
		
		Repertoire repertoire = new Repertoire ("rep1");
		Repertoire repertoire2 = new Repertoire ("rep2");
		Fichier f1 =  new Fichier("f1", 5);
		repertoire.ajouterObjet(f1);
		repertoire2.ajouterObjet(repertoire);
		assertEquals(5, repertoire2.getTaille());
	}
	
		@Test
	public void testdoubleFichier() throws Exceptions {
		
		Repertoire repertoire = new Repertoire ("rep1");
		
		Fichier f1 =  new Fichier("f1", 5);
		Fichier f2 =  new Fichier("f2", 20);
		repertoire.ajouterObjet(f1);
		repertoire.ajouterObjet(f2);
		assertEquals(25, repertoire.getTaille());
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void testnullFichier() throws Exceptions {
		
		Repertoire repertoire = new Repertoire ("rep1");
		
		Fichier f1 =  null;
		
		repertoire.ajouterObjet(f1);
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testdoublenameFichier() throws Exceptions {
		
		Repertoire repertoire = new Repertoire ("rep1");
		
		Fichier f1 =  new Fichier("f1", 5);
		Fichier f2 =  new Fichier("f1", 20);
		repertoire.ajouterObjet(f1);
		repertoire.ajouterObjet(f2);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testschizoRep() throws Exceptions {
		
		Repertoire repertoire = new Repertoire ("rep1");
		
	
		repertoire.ajouterObjet(repertoire);
	}
}

