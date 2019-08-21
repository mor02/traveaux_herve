package bibliotheque;

class Genre {
     
    private final GenreEnum genreEnum;
    private final Auteur auteurPrincipal;

    public Genre(GenreEnum genre, Auteur auteurPrincipal) {       
        this.genreEnum = genre;
        this.auteurPrincipal = auteurPrincipal;
    }

    public GenreEnum getGenreEnum() {
        return genreEnum;
    }
    
    public Auteur getAuteurPrincipal() {
        return auteurPrincipal;
    }

    @Override
    public String toString() {
        return "Genre{" + "genre=" + genreEnum + ", auteurPrincipal=" + auteurPrincipal + '}';
    }    
}
