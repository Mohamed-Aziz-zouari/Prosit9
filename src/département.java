import java.util.Objects;

public class département implements Comparable<département>{
    private int id;
    private String nom;
    private int nbr_employes;

    public département() {
    }

    public département(int id, String nom, int nbr_employes) {
        this.id = id;
        this.nom = nom;
        this.nbr_employes = nbr_employes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbr_employes() {
        return nbr_employes;
    }

    public void setNbr_employes(int nbr_employes) {
        this.nbr_employes = nbr_employes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        département that = (département) o;
        return id == that.id && Objects.equals(nom, that.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom ,nbr_employes);
    }

    @Override
    public String toString() {
        return "département{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbr_employes=" + nbr_employes +
                '}';
    }

    @Override
    public int compareTo(département o) {
        return this.id - o.id;
    }
}
