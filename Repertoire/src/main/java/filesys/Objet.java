package filesys;


    /**
     * Object abstract Class to generate Repertoire/Fichier
     * @author me
     * 
     *   
     */

public abstract class Objet {
	private String nom;

	/**
	* Constructor for Objects
	* 
	*/
	public Objet (String nom)
	{
		this.nom = new String(nom);
			
	}
	/**
	* get name of Objects
	* @return String name
	*/	
	public String getNom() //ajout
	{
	       return nom;
	}
	/**
	* set name of Objects
	* @param String name
	*/
	public void setNom(String nom) //ajout
	{
	       this.nom= nom;
	}
	/**
	* get size of Objects
	* @return int Size
	*/	
	public abstract int getTaille () ;

}

