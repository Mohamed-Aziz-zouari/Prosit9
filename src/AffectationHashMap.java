import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AffectationHashMap {
Map <Employé,département> affectation = new HashMap<>();

   public void ajouterEmployeDepartement(Employé e, département d){
      affectation.put(e,d);
   }
   public void afficherEmployesEtDepartements(){
      Set<Map.Entry<Employé,département>> entrySet = affectation.entrySet();
      System.out.println("liste :"+entrySet);
   }
   public void supprimerEmploye (Employé e){
      affectation.remove(e);
   }
   public void supprimerEmployeEtDepartement (Employé e, département d){
      affectation.remove(e);
   }
   public void afficherEmployes(){
      Set<Employé> KeySet = affectation.keySet();
      System.out.println("liste des employés:"+KeySet);
   }
   public void afficherDepartements(){
      System.out.println("liste des départements:"+affectation.values());
   }
   public boolean rechercherEmploye (Employé e){
      return affectation.containsKey(e);
   }
   public boolean rechercherDepartement (département d){
      return affectation.containsValue(d);
   }
   public TreeMap<Employé, département> trierMap(){
      TreeMap<Employé, département> treeMap = new TreeMap<>();
      for(Map.Entry<Employé, département> entry : affectation.entrySet()){
      treeMap.put(entry.getKey(), entry.getValue());
      }
      return treeMap;
   }

}
