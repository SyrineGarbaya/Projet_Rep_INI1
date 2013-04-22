package filesys;


/*
*
*
*
*/

public abstract class Objet {
	private String nom;


	
	public Objet (String nom)
	{
		this.nom = new String(nom);
			
	}
	
	public String getNom() //ajout
	{
	       return nom;
	}
	
	public void setNom() //ajout
	{
	       this.nom= nom;
	}
	
	public abstract int getTaille () throws Exceptions;

}

