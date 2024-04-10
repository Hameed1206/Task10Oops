//6th QUE

class BlackChai extends TeaClass{

     // Method to prepare Black tea
     @Override
     public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Preparing Black tea with hot water and tea leaves.");
            isPrepared = true;
        } else {
            System.out.println("Black tea has already been prepared.");
        }  }
        //Method to check if tea is prepared
        @Override
    public void isTeaPrepared(){
        if (isPrepared && isSugarAdded) {
            System.out.println("*   * Black Tea is prepared *   *");
        } else{
            System.out.println("Please prepare the Black tea");
        }  }
}

class GreenChai extends TeaClass{
    // Method to prepare Green tea
   @Override
    public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Preparing Green tea with hot water and Green tea leaves.");
            isPrepared = true;
        } else {
            System.out.println("Green Tea has already been prepared.");
        }  }
    //Method to check if tea is prepared
    @Override
    public void isTeaPrepared(){
        if (isPrepared && isSugarAdded) {
            System.out.println("*   * Green Tea is prepared *   *");
        } else{
            System.out.println("Please prepare the Green tea");
        }  }
}
 
class HerbalChai extends TeaClass{
    // Method to prepare Herbal tea
    @Override
    public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Preparing Herbal tea with hot water and Herbal leaves and ingredients.");
            isPrepared = true;
        } else {
            System.out.println("Herbal Tea has already been prepared.");
        }  }
        //Method to check if tea is prepared
        @Override
    public void isTeaPrepared(){
        if (isPrepared && isSugarAdded) {
            System.out.println("*   * Herbal Tea is prepared *   *");
        } else{
            System.out.println("Please prepare the Herbal tea");
        }  }
}

public class SixthQueTypesOfTea {
    public static void main(String[] args) {
        
        // Create an instance of the BlackTea
        BlackChai bTea = new BlackChai();
        bTea.prepareTea();
        bTea.addSugar();
        bTea.addMilk();
        System.out.println("");
        bTea.isTeaPrepared();
        System.out.println("");
        // Create an instance of the GreenTea
        GreenChai gTea = new GreenChai();
        gTea.prepareTea();
        gTea.addSugar();
        gTea.addMilk();
        System.out.println("");
        gTea.isTeaPrepared();
        System.out.println("");
        // Create an instance of the HerbalTea
        HerbalChai hTea = new HerbalChai();
        hTea.prepareTea();
        hTea.addSugar();
        hTea.addMilk();
        System.out.println("");
        hTea.isTeaPrepared();
        System.out.println("");
    }
}
