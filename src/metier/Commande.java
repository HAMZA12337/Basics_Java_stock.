package metier;

import java.util.Date;

public class Commande {

    private String reference;
    private Client client ;
    private Date date;
    private boolean etatCommande ;

    public Commande(String reference, Client client, Date date, boolean etatCommande) {
        this.reference = reference;
        this.client = client;
        this.date = date;
        this.etatCommande = etatCommande;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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
