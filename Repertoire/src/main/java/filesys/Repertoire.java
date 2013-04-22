package filesys;

public class Repertoire extends Objet{
	public final int nbObjet = 100;
	private int nbObjetReel = 0; 
	private Objet[] listeObjet= new Objet[nbObjet];
	
	
    /**
     * Constructor for objects of class Repertoire
     */
    public Repertoire(String nom)
    {
        super(nom);
    }

    /**
     * Methods for Repertoire
     * 
     * @param 
     * @return  
     */

    public boolean ajouterObjet(Objet objet)
    {
    	if (objet!= null && this!=objet && nbObjetReel< nbObjet && Exist(objet)){
    		listeObjet[nbObjetReel] = objet;
    		nbObjetReel++;
    		return true;
    	}
    	else 
    		return false;	
    }
    
    public boolean Exist(Objet objet)
    {
    	for(int i=0; i <= nbObjetReel; i++ ){
    		if (objet == listeObjet[i]){
    			return false;
    		}
    	}
    	return true;  	
    }
    
    
    public int getTaille() throws Exceptions{
    	int taille = 0;
    	if(taille<0)
     	   throw new Exceptions("Pas de taille négative");
        else{
        	for(int i=0;i<=nbObjetReel;i++){
        		taille = taille+listeObjet[i].getTaille();
        	
        	}
        	return taille;
        	
        }
    	
    }
   

}
