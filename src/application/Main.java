package application;

import metier.Categorie;
import metier.Ordinateur;
import java.util.List;
public class Main {
    public static void main(String[] args) {



        // creation de 3 ORDINATEURS

        Ordinateur ord1 = new Ordinateur("HP ELITE BOOK", "hp",3000.3, "LLLLLLLLL",12);
        Ordinateur ord2 = new Ordinateur("MAC OP12", "MAC",3000.3, "LLLLLLLLL",144);
        Ordinateur ord3 = new Ordinateur("MAC OP12", "MAC",3000.3, "LLLLLLLLL",144);
        
        List<Ordinateur> ord = null;
        ord.add(ord1);
        ord.add(ord2);
        ord.add(ord3);
        //

Categorie c1= new Categorie(" h1", "kkkkkkkkkkkk", ord);







        // categorie







        Client c1= new Client("hamza","braimi");










    }
}