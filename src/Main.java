//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();
        Employé employe1 = new Employé(1, "zouari", "aziz", "IT", 10);
        Employé employe2 = new Employé(2, "Ben flen", "flen", "RH", 6);
        Employé employe3 = new Employé(3, "Ben flen2", "flen2", "Gestion", 62);
//
//        System.out.println(employe1.toString());
//        System.out.println(employe2.toString());
//        System.out.println(employe3.toString());
//
//        societe.ajouterEmploye(employe2);
//        societe.ajouterEmploye(employe1);
//        societe.ajouterEmploye(employe3);
//
//        societe.displayEmploye();
//
//        boolean res= societe.rechercherEmploye("nsiri");
//        System.out.println(res);
//
//        boolean res2 = societe.rechercherEmploye(employe1);
//        System.out.println(res2);
//
//        System.out.println("la liste aprés suppression");
//        societe.supprimerEmploye(employe3);
//        societe.displayEmploye();
//
//        System.out.println("la liste triée");
//        societe.trierEmployeParId();
//        societe.displayEmploye();
//
        DepartementHashSet departementHashSet = new DepartementHashSet();
        département dep1 = new département(1,"info",12);
        département dep2 = new département(2,"RH",20);
        département dep3 = new département(1,"info",12);
        département dep4 = new département(3,"Meca",2);

//        departementHashSet.ajouterDepartement(dep1);
//        departementHashSet.ajouterDepartement(dep2);
//        departementHashSet.ajouterDepartement(dep3);
//        departementHashSet.ajouterDepartement(dep4);
//        departementHashSet.displayDepartement();
//
//        System.out.println(departementHashSet.rechercherDepartement("info"));
//        System.out.println(departementHashSet.rechercherDepartement(dep1));
//
//        System.out.println("Treeset : " + departementHashSet.trierDepartementById());
//
//        departementHashSet.supprimerDepartement(dep4);
//        departementHashSet.displayDepartement();

        AffectationHashMap affectationHashMap = new AffectationHashMap();
        affectationHashMap.ajouterEmployeDepartement(employe1,dep1);
        affectationHashMap.ajouterEmployeDepartement(employe2,dep2);
        //affectationHashMap.ajouterEmployeDepartement(employe2,dep1);
        affectationHashMap.ajouterEmployeDepartement(employe3,dep4);

        affectationHashMap.afficherEmployesEtDepartements();

        System.out.println(affectationHashMap.rechercherEmploye(employe1));
        System.out.println(affectationHashMap.rechercherDepartement(dep1));

        affectationHashMap.afficherEmployes();
        affectationHashMap.afficherDepartements();

        System.out.println(affectationHashMap.trierMap());

        affectationHashMap.supprimerEmploye(employe1);
        affectationHashMap.supprimerEmployeEtDepartement(employe2,dep2);
        affectationHashMap.afficherEmployesEtDepartements();
    }
}