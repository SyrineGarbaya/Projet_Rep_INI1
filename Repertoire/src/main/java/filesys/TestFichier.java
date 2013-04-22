package filesys;

import org.junit.Test;

import junit.framework.TestCase;

public class TestFichier {
	@Test
	public void testCalculTaille() {
		Fichier fichier;
		try {
			fichier = new Fichier ("fic1", -10);
			assert fichier.calculTaille() >= 0;
		} catch (Exceptions e) {
			// TODO Auto-generated catch block
			System.out.println("Taille négative");
		}
	}

}
