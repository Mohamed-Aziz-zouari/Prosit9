import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

public class Employé implements Comparable<Employé> , Comparator<Employé> {
    private int id;
    private String nom;
    private String prenom;
    private String nom_departement;
    private int grade;

    public Employé(){}

    public Employé(int id, String nom, String prenom, String nom_departement, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nom_departement = nom_departement;
        this.grade = grade;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom_departement() {
        return nom_departement;
    }

    public void setNom_departement(String nom_departement) {
        this.nom_departement = nom_departement;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public int compare(Employé o1, Employé o2) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employé employé)) return false;
        return id == employé.id && Objects.equals(nom, employé.nom);
    }

    @Override
    public String toString() {
        return "Employé{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nom_departement='" + nom_departement + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Employé o) {
        return this.id - o.id;
    }
}
