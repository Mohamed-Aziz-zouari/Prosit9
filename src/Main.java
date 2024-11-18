//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();
        Employé employe1 = new Employé(1, "zouari", "aziz", "IT", 10);
        Employé employe2 = new Employé(2, "Ben flen", "flen", "RH", 6);
        Employé employe3 = new Employé(3, "Ben flen2", "flen2", "Gestion", 62);

        System.out.println(employe1.toString());
        System.out.println(employe2.toString());
        System.out.println(employe3.toString());

        societe.ajouterEmploye(employe2);
        societe.ajouterEmploye(employe1);
        societe.ajouterEmploye(employe3);

        societe.displayEmploye();

        boolean res= societe.rechercherEmploye("nsiri");
        System.out.println(res);

        boolean res2 = societe.rechercherEmploye(employe1);
        System.out.println(res2);

        System.out.println("la liste aprés suppression");
        societe.supprimerEmploye(employe3);
        societe.displayEmploye();

        System.out.println("la liste triée");
        societe.trierEmployeParId();
        societe.displayEmploye();
    }
}