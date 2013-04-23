package filesys;

public class Fichier extends Objet {
	
	
    private int taille = 0;
    
    public Fichier(String nom, int taille)
    {
       super(nom); // fait appel au constructeur de l'objet 
		if(taille<0){
			throw new IllegalArgumentException("### Pas de taille négative ####");
		}
	  
       this.taille=taille;
    }
   @Override
    public int getTaille(){
    	return taille;
    }
}




