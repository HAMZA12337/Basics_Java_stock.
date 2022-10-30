package metier;

import java.util.*;

public class Client {

    private String nom;
    private String prenom;
    private String adresse;
    private String email;
    private String ville;
    private String telephone;
    private List<Commande> commande ;

    public Client(String nom, String prenom, String adresse, String email, String ville, String telephone, List<Commande> commande) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.email = email;
        this.ville = ville;
        this.telephone = telephone;
        this.commande = commande;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public List<Commande> getCommande() {
        return commande;
    }

    public void setCommande(List<Commande> commande) {
        this.commande = commande;
    }


// Ajouter Commande
    public void ajouterCommande(Commande com){
        if(!commande.contains(com)){
            commande.add(com);

        }else{
            System.out.println("commande deja existe");
        }
    }

// supprimer une commande

    public void supprimerCommande(Commande com){
        if(commande.contains(com)){
            commande.remove(com);
        }else{
            System.out.println("commande n' existe pas ");
        }
    }

//



}
