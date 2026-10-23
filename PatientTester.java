
 public class PatientTester{
    
    public static void main(String[] args) {
       //Instantiate PatientManager object      
      
       PatientManager pm = new PatientManager();
      
       
       System.out.println(pm);
       
       pm.addPatient(new Patient(1, 100));
       pm.addPatient(new Patient(2, 200));
       pm.addPatient(new Patient(3, 300));
       pm.addPatient(new Patient(4, 400));
       System.out.println(pm);
       pm.caffeineAbsorption();
       System.out.println(pm);
       pm.removePatient(pm.findHighestIndex());
       System.out.println(pm);
    }
}









