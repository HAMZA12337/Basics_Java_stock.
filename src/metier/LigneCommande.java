package metier;

public class LigneCommande {

private int quantite;
private  Commande commande ;
private LigneCommande ligneCommande;

    public LigneCommande(int quantite, Commande commande, LigneCommande ligneCommande) {
        this.quantite = quantite;
        this.commande = commande;
        this.ligneCommande = ligneCommande;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public LigneCommande getLigneCommande() {
        return ligneCommande;
    }

    public void setLigneCommande(LigneCommande ligneCommande) {
        this.ligneCommande = ligneCommande;
    }
}
