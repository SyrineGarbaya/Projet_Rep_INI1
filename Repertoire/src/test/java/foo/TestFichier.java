package filesys;

import org.junit.Test;
import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * TestFichier Class.
 * Give the name and the size of the file.
 * 
 * @author Naha Myriam & Garbaya Syrine
 * @version Mercredi 24 Avril
 */
public class TestFichier {
	/**
	*Test the creation of the file.
	*/
	@Test 
	public void testOK(){
		Fichier fichier = new Fichier (new String("test"), 10);
	}
	
	/**
	*Test the creation of the file with a negative size.
	*/
	@Test(expected=IllegalArgumentException.class)
	public void testCalculTaille() {
		Fichier fichier = new Fichier (new String("fic1"), -10);
	}
	
	/**
	*Test add a file and test its size.
	*/
	@Test 
	public void testTaille(){
		int taille;
		Fichier fichier = new Fichier (new String("test"), 10);
		taille =fichier.getTaille();
		Assert.assertEquals(taille, 10);
		
		
	}

 
}