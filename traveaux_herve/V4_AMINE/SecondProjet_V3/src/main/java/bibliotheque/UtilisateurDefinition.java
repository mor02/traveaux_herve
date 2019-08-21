package bibliotheque;

import java.util.List;

public interface UtilisateurDefinition {
    
    public String getLogin();
    
    public boolean checkPassword(String password);
    
    /**
     * L'utilisateur emprunte un document. Un document ne peut pas être emprunté
     * par deux utilisateurs à la fois (en même temps).
     * @param empruntable 
     */
    public void emprunter(Empruntable empruntable);
    
    public void rendre(Empruntable empruntable);
    
    public List<Empruntable> getDocumentsEmpruntes(List<Empruntable> allDocs);
}
