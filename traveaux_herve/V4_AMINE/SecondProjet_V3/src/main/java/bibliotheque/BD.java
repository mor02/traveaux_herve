package bibliotheque;

public class BD extends Empruntable {    
    
    private final String personnagePrincipal;

    public BD(String personnagePrincipal, int isbn, Auteur auteur, Genre genre, int cout) {
        super(isbn, auteur, genre, "y'a pas de résumé", cout);
        this.personnagePrincipal = personnagePrincipal;
        this.livreEnum = LivreEnum.BD;
    }

    @Override
    public String getResume() {
        return null;
    }        

    @Override
    public String toString() {
        return "BD{" + "personnagePrincipal=" + personnagePrincipal + '}';
    }

    
    
    public String getPersonnagePrincipal() {
        return personnagePrincipal;
    }

}
