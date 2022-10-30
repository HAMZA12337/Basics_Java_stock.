package metier;

public class Ordinateur {

    private String nom ;
    private String marque;
    private float prix;
    private String description ;
    private  int nbStock ;


    // Constructeur


    public Ordinateur(String nom, String marque, float prix, String description, int nbStock) {
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.description = description;
        this.nbStock = nbStock;

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNbStock() {
        return nbStock;
    }

    public void setNbStock(int nbStock) {
        this.nbStock = nbStock;
    }

// methode de

public float getPrixQte(int qte){

return prix*qte; }




}