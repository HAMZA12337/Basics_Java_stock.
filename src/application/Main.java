package application;

import metier.Categorie;
import metier.Commande;
import metier.Ordinateur;
import metier.Client;

import java.util.Date;
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

// creer la liste de commande

Commande co1 = new Commande("re12",new Date("12-13-2015"),true);
Commande co2 = new Commande("re13",new Date("12-13-2015"),false);
Commande co3 = new Commande("re14",new Date("12-13-2015"),true);
 List<Commande> coList = null ;
 coList.add(co1);
 coList.add(co2);
 coList.add(co3);


//client
        Client cl1= new Client("hamza","braimi","bernoussi casablanca","hamza.braimi33@gmail.com","casablanca","0696792627",coList);










    }
}