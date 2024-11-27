import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class DepartementHashSet implements IDepartement<département>{

    HashSet<département> départements = new HashSet<>();
    @Override
    public void ajouterDepartement(département département) {
        départements.add(département);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        return départements.contains(nom);
    }

    @Override
    public boolean rechercherDepartement(département département) {
        return départements.contains(département);
    }

    @Override
    public void supprimerDepartement(département département) {
        départements.remove(département);
    }

    @Override
    public void displayDepartement() {
        System.out.println("Hashset : " + départements);
    }

    @Override
    public TreeSet<département> trierDepartementById() {
        TreeSet<département> DepartementById = new TreeSet<>();
        for (département dep : départements){
            DepartementById.add(dep);
        }
        return DepartementById;
    }

}
