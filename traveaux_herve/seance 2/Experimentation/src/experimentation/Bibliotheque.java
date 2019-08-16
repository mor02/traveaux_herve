package experimentation;

import java.util.LinkedList;
import java.util.List;

public class Bibliotheque {

    public List<Livre> livres = new LinkedList<Livre>();

    // On créé la méthode add qui permettre d'ajouter à la liste "livres" un "livre"
    // cette méthode sera utilisée (invoquée) dans le Main
    public void add(Livre livre) {
        livres.add(livre);
    }

    public List<Livre> ListLivreEmpruntable() {
        // On créé une liste type LynkedList nommée "listOut"
        List<Livre> listOut = new LinkedList<Livre>();
        // On créé une boucle examinant la liste "livres"
        for (Livre l : livres) {
            //System.out.println(l);
            if (l.getEtat() == 1) {
                //System.out.println(l.getEtat());
                //System.out.println(etat);
// Si ça match on ajoute l (le livre éxaminé) à listOut
                listOut.add(l);
            }
        }
        return listOut;
    }

    /* On défini une liste "searchByAuthorName" avec
   comme paramètre (variable de type String) "name"
    défini dans la classe Auteur */
    public String RequestLivreEmpruntable(String name) {
        String resultat = null;
// On créé une liste type LynkedList nommée "listOut"
        // List<Livre> listOut = new LinkedList<Livre>();
        // On créé une boucle examinant la liste "livres"
        // System.out.println("experimentation.Bibliotheque.RequestLivreEmpruntable()");
        for (Livre l : livres) {
            // On fait appel getAuteur (classe Livre) qui retourne l'auteur, puis 
            // a getPrenom (classe Auteur) pour obtenir le prénom. On regarde ensuite
            // si il est égal à la variable "name" définie plus haut
            // si (if) cela match alors ajout du livre dans la liste listOut
            // l est la variable de la la ligne de "livres" examinée
            if (l.getAuteur().getNom().equals(name)) {
                // Si ça match on regarde si livre dispo
                if (l.getEtat() == 0) {
                    resultat = "Le livre " + l.getResume() + " de " + name + " est disponible";
                } else {
                    resultat = "Malheureusement le livre" + l.getResume() + " de " + name + " n'est pas disponible";
                }
            }
        }
        return resultat;
    }

    @Override
    public String toString() {
        return "Liste";
    }
}
