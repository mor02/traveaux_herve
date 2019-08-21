package bibliotheque;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Bibliotheque {

    private  List<Livre> livres = null;

    public Bibliotheque() {
        livres = new ArrayList<Livre>();
    }

    
    public void add(Livre livre) {
        livres.add(livre);
    }
    
    public List<Livre> searchByAuthorName(String name) {
        List<Livre> listOut = new LinkedList<Livre>();
        for(Livre l : livres) {
            if(l.getAuteur().getNom().equals(name)) {
                listOut.add(l);
            }
        }
        return listOut;
    }
    
    public Livre getByISBN(int isbn) {
        for(Livre l : livres) {
            if(l.getIsbn() == isbn) {
                return l;
            }
        }
        return null;
    }
    
    public List<Livre> getByGenre(GenreEnum genre) {
        List<Livre> listOut = new LinkedList<Livre>();
        for(Livre l : livres) {
            if(l.getGenre().getGenreEnum().equals(genre)) {
                listOut.add(l);
            }
        }
        return listOut;        
    }
    
    public void defineCout(int isbn, int cout) {
        Livre l = getByISBN(isbn);
        if(l.isIsEmpruntable()) {
            Empruntable e = (Empruntable)l;
            e.setCout(cout);
        }
    }
    
    public List<Empruntable> listAllDocumentsEmpruntes() {
        return null;
    }
}
