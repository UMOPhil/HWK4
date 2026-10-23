public class Patient
{
    private int IdNumber;
    private double caffeineLevel;
    

    public Patient(int IdNumber, double caffeineLevel){
    
    this.IdNumber = IdNumber;
    this.caffeineLevel = caffeineLevel;
    
    }
  	
    public int getIdNumber(){
        return IdNumber;
    }
  
  
     public double getCaffeineLevel(){
        return caffeineLevel;
    }

     public void setCaffeineLevel(double newCaffeine){
        this.caffeineLevel = newCaffeine;
    }
  
  @Override
  public String toString(){
      return IdNumber + " " + (int) caffeineLevel;
  }
	
}