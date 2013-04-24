package filesys;
/**
 * Fichier Class.
 * Give the size of the file.
 * 
 * @author Naha Myriam & Garbaya Syrine
 * @version Mercredi 24 Avril
 */

public class Fichier extends Objet{

    private int taille = 0;
    

    public Fichier(String nom, int taille){
    
       super(nom);  
		if(taille<0){
			throw new IllegalArgumentException("### Pas de taille négative ####");
		}
	  this.taille=taille;
    }
	
	/**
	*get size of Fichier
	*@return int size
	**/
   @Override
    public int getTaille(){
    	return taille;
    }
}




