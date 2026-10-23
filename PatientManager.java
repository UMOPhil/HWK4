

import java.util.ArrayList;

public class PatientManager {

    private ArrayList<Patient> patients = new ArrayList<Patient>(10);

    public int addPatient(Patient p) {
        patients.add(p);
        return patients.size() - 1;
    }

    public Patient removePatient(int index) {
        return patients.remove(index);
    }

    public void caffeineAbsorption() {
        
 
        int pp = 0;

        while(pp < patients.size()){

            Patient p = patients.get(pp);
            p.setCaffeineLevel(p.getCaffeineLevel()-140);
      
        if(p.getCaffeineLevel()<= 0.0){
            patients.remove(pp);
            }
          else{
            pp++;
        }
            
    	}
    }

    public int findHighestIndex(){
      int maxIndex = 0;
      
      for(int i = 1; i < patients.size(); i++){
         if (patients.get(i).getCaffeineLevel() > patients.get(maxIndex).getCaffeineLevel()) {
           maxIndex = i;
         }
      }
      return maxIndex;
    }
     
     @Override
     public String toString(){
       if (patients.size() == 0){
         return "Empty";
       }
       String result = "";
       for(int i = 0; i < patients.size(); i++){
         result += patients.get(i) + "\n";           
      }
      return result;
     }
             
       

       public PatientManager() {
  
    }
}
