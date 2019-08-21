package bibliotheque;

public abstract class Livre {

    public enum LivreEnum {
        POCHE,
        BD,
        NUMERIQUE,
        NORMAL
    }

    private final int isbn;
    private final Auteur auteur;
    private final Genre genre;
    private final String resume;
    protected LivreEnum livreEnum;

    
    public Livre(int isbn, Auteur auteur, Genre genre, String resume) {
        this.isbn = isbn;
        this.auteur = auteur;
        this.genre = genre;
        this.resume = resume;
    }
    
    // Choix de mettre par défaut Non empruntable(false). Puis traité dans Empruntable
    public boolean isEmpruntable() {
        return false;        
    }

    public int getIsbn() {
        return isbn;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getResume() {
        return resume;
    }
}
