package filesys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
/**
 * Repertoire Class
 * @author Naha Myriam & Garbaya Syrine
 * @version Mercredi 24 Avril
 * 
*/

public class Repertoire extends Objet{

	private ArrayList<Objet> arrList= new ArrayList<Objet>(); 
	
	
    /**
     * Constructor for objects of class Repertoire
     */
    public Repertoire(String nom)
    {
        super(nom);
    }

    /**
     * Add object to Repertoire
     * 
     * @param the object to add
     * @return  void
     */

    public void ajouterObjet(Objet objet)
    {

		if(objet == null) throw new IllegalArgumentException("### Object Null ####");
		else if (this==objet) throw new IllegalArgumentException("### Please dont add me, I'm not schizophrenic ####");
		else if (existsWithSameName(objet)) throw new IllegalArgumentException("### Please change my name ####");
		else {
		arrList.add(objet);
		}
		
    }
    
	/**
	*Check if object exisits with the same name
	*@param the object to check 
	*@return  true if exists
	**/
	public boolean existsWithSameName(Objet objet){
	 Iterator<Objet> itr = arrList.iterator();
		while (itr.hasNext()) {
		Objet element = itr.next();
			if(element.getNom().equals(objet.getNom()))return true;
		}
		return false;
	}

    /**
	* Get size of a folder
	*@param void 
	*@return  int size
	**/
       @Override
    public int getTaille(){
    	int taille = 0;
    	
        Iterator<Objet> itr = arrList.iterator();
		while (itr.hasNext()) {
			Objet element = itr.next();
			taille += element.getTaille();
		}
		
		return taille;
    	
    }
   

}
