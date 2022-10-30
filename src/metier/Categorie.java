package metier;
import java.sql.SQLOutput;
import java.util.List;
public class Categorie {

private String nom ;
private String description ;
private List<Ordinateur> ordinateur ;


    public Categorie(String nom, String description, List<Ordinateur> ordinateur) {
        this.nom = nom;
        this.description = description;
        this.ordinateur = ordinateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Ordinateur> getOrdinateur() {
        return ordinateur;
    }

    public void setOrdinateur(List<Ordinateur> ordinateur) {
        this.ordinateur = ordinateur;
    }


    // Ajouter  une ordinateur

    public void ajouterOrdinateur(Ordinateur ord){


        if(!ordinateur.contains(ord)){

            ordinateur.add(ord);

        }else{
            System.out.println("deja existe");
        }
 }


    // Supprimer   une ordinateur

    public void supprimerOrdinateur(Ordinateur ord){
        if(ordinateur.contains(ord)){

           ordinateur.remove(ord);

        }else{
            System.out.println("L'ordinateur n'existe pas ");
        }
    }

    // Recherecher Ordinateur

    public List<Ordinateur> rechercherParPrix(float prix){

        if(!ordinateur.isEmpty()){
            List<Ordinateur> temp = null;
            for(Ordinateur ord :ordinateur){
                if(ord.getPrix()==prix){
                    temp.add(ord);
                }
            }
            return temp;
        }

    return  null;}


















}
