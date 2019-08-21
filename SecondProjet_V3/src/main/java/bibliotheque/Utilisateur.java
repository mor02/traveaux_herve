package bibliotheque;

import java.util.List;

public class Utilisateur {

    private final String login;
    private final String password;

    public Utilisateur(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }

    public boolean checkPassword(String password) {
        if (password.equals("")) {
            return false;
        }
        return true;
    
    }

    public void emprunter(Empruntable empruntable) {
   
    }

    public void rendre(Empruntable empruntable) {
    }

    public List<Empruntable> getDocumentsEmpruntes() {
        return null;
    }
}
