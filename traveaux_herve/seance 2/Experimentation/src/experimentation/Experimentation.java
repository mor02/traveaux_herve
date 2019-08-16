package experimentation;

import java.util.List;

public class Experimentation {

    public static void main(String[] args) {
        // TODO code application logic here
        Auteur auteur1 = new Auteur("Julien", "Cartigny");
        Auteur auteur2 = new Auteur("Myriam", "Carpentier");
        Auteur auteur3 = new Auteur("Henri", "Dupont");
        Livre livre1 = new Livre(auteur1, "La belle nuit", 0);
        Livre livre2 = new Livre(auteur2, "Mon 2eme livre", 1);
        Livre livre3 = new Livre(auteur3, "La vie est un roman", 0);

        // Création de "bibliothèque" attaché à Bibliotheque 
        Bibliotheque bibliotheque = new Bibliotheque();
        // ajout de bd1 via la methode add défini dans la calsse Bibliothèque
        bibliotheque.add(livre1);
        bibliotheque.add(livre2);
        bibliotheque.add(livre3);

  /*      // On créé une liste l1 qui va invoquer la méthode "ListLivreEmpruntable"
        // dans bibliotheque avec l'attribut "0" (non empruntable)
        List<Livre> l1 = bibliotheque.ListLivreEmpruntable();
        for (Livre l : l1) {
            // 1er tour: l = livre1
            // System.out.println(l);
            System.out.println(l1.toString());
        }
*/
        // Livre de Cartigny est il disponible ?
        String resultat = bibliotheque.RequestLivreEmpruntable("Cartigny");
         System.out.println(resultat);

        /* System.out.println(livre1.getEtat());
        livre1.setEtat(0);
        System.out.println(livre1.getEtat()); */
    }

}
