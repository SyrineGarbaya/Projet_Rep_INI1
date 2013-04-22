package filesys;

public class Fichier extends Objet {
	
	
    private int taille;
    
    public Fichier(String nom, int taille) throws Exceptions
    {
       super(nom); // fait appel au constructeur de l'objet 
       if(taille<0)
    	   throw new Exceptions("Pas de taille négative");
       else
       this.taille=taille;
    }
   
    public int calculTaille(){
    	return taille;
    }
}




