package filesys;

public abstract class Objet {
	private String nom;

	
	public Objet (String nom){
		this.nom= nom;
		
	}
	
	public String getNom() //ajout
	{
	       return nom;
	}
	
	public abstract int calculTaille() throws Exceptions;

}

