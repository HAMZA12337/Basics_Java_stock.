package metier;

import java.util.Date;

public class Commande {

    private String reference;

    private Date date;
    private boolean etatCommande ;

    public Commande(String reference, Date date, boolean etatCommande) {
        this.reference = reference;

        this.date = date;
        this.etatCommande = etatCommande;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }



    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isEtatCommande() {
        return etatCommande;
    }

    public void setEtatCommande(boolean etatCommande) {
        this.etatCommande = etatCommande;
    }
}
