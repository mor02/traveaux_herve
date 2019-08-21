package bibliotheque;

import java.util.LinkedList;
import java.util.List;

public class Bibliotheque {
// On créé une LinkedList appelée "livres" basée sur la forme définie dans la classe Livre
    // cad Livre(int isbn, Auteur auteur, Genre genre, String resume)

    private final List<Livre> livres = new LinkedList<Livre>();

    // On créé la méthode add qui permettre d'ajouter à la liste "livres" un "livre"
    // cette méthode sera utilisée (invoquée) dans le Main
    public void add(Livre livre) {
        livres.add(livre);
    }

    // On défini une liste "searchByAuthorName" avec
    // comme paramètre (variable de type String) "name" défini dans la classe Auteur
    public List<Livre> searchByAuthorName(String name) {
        // On créé une liste type LynkedList nommée "listOut"
        List<Livre> listOut = new LinkedList<Livre>();
        // On créé une boucle examinant la liste "livres"
        for (Livre l : livres) {
            // On fait appel getAuteur (classe Livre) qui retourne l'auteur, puis 
            // a getPrenom (classe Auteur) pour obtenir le prénom. On regarde ensuite
            // si il est égal à la variable "name" définie plus haut
            // si (if) cela match alors ajout du livre dans la liste listOut
            // l est la variable de la la ligne de "livres" examinée
            if (l.getAuteur().getPrenom().equals(name)) {
                // Si ça match on ajoute l (le livre éxaminé) à listOut
                listOut.add(l);
            }
        }
        // A la fin on retourne listOut
        return listOut;
    }

    // Ici on créé une méthode getByISBN avec comme élément de recherche un entier "isbn"
    public Livre getByISBN(int isbn) {
        // On créé une boucle de recherche (passage en revue de la liste "livres" définie
        // plus haut
        for (Livre l : livres) {
            // On invoque getISBN (obtention num ISBN) défini dans la classe Livre
            // et on le compare à l'entier "isbn" de la requête
            if (l.getIsbn() == isbn) {
                return l;
            }
        }
        return null;
    }

    public List<Livre> getByGenre(GenreEnum genre) {
        List<Livre> listOut = new LinkedList<Livre>();
        for (Livre l : livres) {
            if (l.getGenre().getGenreEnum().equals(genre)) {
                listOut.add(l);
            }
        }
        return listOut;
    }

    public void defineCout(int isbn, int cout) {
        Livre l = getByISBN(isbn);
        if (l.isEmpruntable()) {
            Empruntable e = (Empruntable) l;
            e.setCout(cout);
        }
    }

    public List<Empruntable> listAllDocumentsEmpruntes() {
        return null;
    }

//    @Override
//    public String toString() {
//        return l;
//    }
}
