package bibliotheque;

import java.util.List;

public class MainClass {

    public static void main(final String[] args) {         
       /* Auteur auteur1 = new Auteur("Julien","Cartigny");
        Auteur auteur2 = new Auteur("Myriam","Carpentier");
        Genre genre = new Genre(GenreEnum.DOCUMENTAIRE, auteur1);        
        BD bd1 = new BD("Tintin", 36, auteur1, genre, 43);                
        Poche poche1 = new Poche(345, auteur2, genre, "Hello !", 12);
        
        Bibliotheque bibliotheque = new Bibliotheque();
        bibliotheque.add(bd1);
        bibliotheque.add(poche1);
        List<Livre> l1 = bibliotheque.searchByAuthorName("Cartigny");
        for(Livre l: l1) {
            // 1er tour: l = bd1
            System.out.println(l);
        }
        */
        
        Utilisateur user1 = new Utilisateur("HERVE", "HERVE2018");
        
        Auteur auteur1 = new Auteur("Cartigny","Julien");
        Auteur auteur2 = new Auteur("Carpentier","Myriam");
        Genre genre = new Genre(GenreEnum.DOCUMENTAIRE, auteur1);        
        BD bd1 = new BD("Tintin", 36, auteur1, genre, 43);
        bd1.setIsEmpruntable(false);
        Poche poche1 = new Poche(345, auteur2, genre, "Hello !", 12);
   
        //L'objectif : emprunter bd1
        user1.emprunter(bd1);
        
        System.out.println("BD1 TEST emprunter: " + bd1.isIsEmpruntable());
        
        user1.rendre(bd1);
        
         System.out.println("BD1 TEST rendre : " + bd1.isIsEmpruntable());
        //cas non passant
        System.out.println("TEST CHECK PASS : " + user1.checkPassword("HERVE2019"));
        //Cas passant
        System.out.println("TEST CHECK PASS : " + user1.checkPassword("HERVE2018"));
    }        
}
