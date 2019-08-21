package bibliotheque;

import java.util.List;

public class MainClass {

    public static void main(final String[] args) {         
// Ici les entrées pour les classes Auteur, Genre, BD et Poche avec les formats définis dans les classses
        Auteur auteur1 = new Auteur("Julien","Cartigny");
        Auteur auteur2 = new Auteur("Myriam","Carpentier");
        Genre genre = new Genre(GenreEnum.DOCUMENTAIRE, auteur1);        
        BD bd1 = new BD("Tintin", 36, auteur1, genre, 43);                
        Poche poche1 = new Poche(345, auteur2, genre, "Hello !", 12);
        // Création deux deux utilisateurs avec comme login pwd prenom nom
        Utilisateur utilisateur1 = new Utilisateur ("Herve", "Coste");
        Utilisateur utilisateur2 = new Utilisateur ("Pierre", "Dupont");
        
        // Création de "bibliothèque" attaché à Bibliotheque 
        Bibliotheque bibliotheque = new Bibliotheque();
        // ajout de bd1 via la methode add défini
        bibliotheque.add(bd1);
        bibliotheque.add(poche1);
        System.out.println (bibliotheque);
              
        // On créé une liste l1 qui va invoquer la méthode "searchByAuthorName"
        // dans bibliotheque avec l'attribut "Cartigny"
        List<Livre> l1 = bibliotheque.searchByAuthorName("Cartigny");
        for(Livre l: l1) {
            // 1er tour: l = bd1
            System.out.println(l1);
        }
        
    }        
}
