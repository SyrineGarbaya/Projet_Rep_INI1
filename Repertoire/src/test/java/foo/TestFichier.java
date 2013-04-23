package filesys;

import org.junit.Test;
import junit.framework.Assert;
import junit.framework.TestCase;

public class TestFichier {

	@Test
	public void testOK(){
		Fichier fichier = new Fichier (new String("test"), 10);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testCalculTaille() {
		Fichier fichier = new Fichier (new String("fic1"), -10);
	}
	
	@Test
	public void testTaille(){
		int taille;
		Fichier fichier = new Fichier (new String("test"), 10);
		taille =fichier.getTaille();
		Assert.assertEquals(taille, 10);
		
		
	}

 
}