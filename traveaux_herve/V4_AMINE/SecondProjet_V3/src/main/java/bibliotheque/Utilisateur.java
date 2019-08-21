package bibliotheque;

import java.util.ArrayList;
import java.util.List;

public class Utilisateur implements UtilisateurDefinition {

    private final String login;
    private final String password;
    
    public Utilisateur(String login, String password) {
        this.login=login;
        this.password=password;
    }
    
    public String getLogin() {
        return login;
    }

    public boolean checkPassword(String password) {
        if(this.password.equals(password)){
            return true;
        }else{
            return false;
        }
    }

    public void emprunter(Empruntable empruntable) {
        if (!empruntable.isIsEmpruntable()) {//empruntable.isIsEmpruntable()==false
            empruntable.setIsEmpruntable(true);
        } else {
            System.out.println("Le livre n'est pas dispo");
        }
    }

    public void rendre(Empruntable empruntable) {
        empruntable.setIsEmpruntable(false);
    }

    public List<Empruntable> getDocumentsEmpruntes(List<Empruntable> allDocs) {
        List<Empruntable> listLivreEmp = new ArrayList<Empruntable>();
        for(Empruntable e : allDocs){
            if(e.isIsEmpruntable()){//equivalent à e.isIsEmpruntable()==true
                listLivreEmp.add(e);
            }
        }
        return listLivreEmp;
    }
    
}
