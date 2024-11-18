import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class SocieteArrayList implements IGestion<Employé> {

    private ArrayList<Employé> employes = new ArrayList<>();
    @Override
    public void ajouterEmploye(Employé employé) {
    employes.add(employé);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        return employes.contains(nom);
    }

    @Override
    public boolean rechercherEmploye(Employé employé) {
        return employes.contains(employé);
    }

    @Override
    public void supprimerEmploye(Employé employé) {
    employes.remove(employé);
    }

    @Override
    public void displayEmploye() {
        System.out.println("Liste : " + employes);

    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {

    }
}
