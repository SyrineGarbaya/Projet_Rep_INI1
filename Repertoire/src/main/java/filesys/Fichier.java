//SYMY
package filesys;

public class Fichier extends Objet {
	
	
    private int taille;
    
    public Fichier(String nom, int taille)
    {
       super(nom); // fait appel au constructeur de l'objet 
       this.taille=taille;
    }
   
    public int calculTaille(){
    	return taille;
    }
}




