//5th QUE
public class TeaClass {
    
    // Attribute to check if the tea has been prepared
    public boolean isPrepared;
    public boolean isMilkAdded;
    public boolean isSugarAdded;

    // Method to prepare tea
    public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Preparing basic tea with hot water and tea leaves.");
            isPrepared = true;
        } else {
            System.out.println("Tea has already been prepared.");
        }
    }

    // Method to add milk
    public void addMilk() {
        if ( this instanceof BlackChai || this instanceof GreenChai || this instanceof HerbalChai) {
            System.out.println("Milk cannot be added to this type of tea.");
        } else if (isPrepared && !isMilkAdded) {
            System.out.println("Adding milk to the tea");  
            isMilkAdded = true;
        } else if (isPrepared && isMilkAdded) {
            System.out.println("Milk already added.");
        } else {
            System.out.println("Please prepare the tea first.");
        }
    }

    // Method to add sugar
    public void addSugar() {
        if (isPrepared && !isSugarAdded) {
            System.out.println("Adding sugar to the tea.");
            isSugarAdded = true;
        } else if (isPrepared && isSugarAdded) {
            System.out.println("Sugar already added");  
        } else {
            System.out.println("Please prepare the tea first.");
        }
    }

    //Method to check if tea is prepared
    public void isTeaPrepared(){
        if (isPrepared && isMilkAdded && isSugarAdded) {
            System.out.println("Tea is prepared");
        } else{
            System.out.println("Please prepare the tea");
        }
    }
    public static void main(String[] args) {
        // Create an instance of the TeaClass
        TeaClass tea = new TeaClass();
        tea.prepareTea(); // Prepare basic tea
        tea.addMilk(); // Add milk to the tea
        tea.addSugar(); // Add sugar to the tea
        System.out.println("");
        tea.isTeaPrepared();
        System.out.println("");
        System.out.println("* * Trying to add again * *");
        tea.addMilk(); // Try adding milk again
        tea.addSugar(); // Try adding sugar again
        tea.prepareTea(); // Try preparing tea again
    }

}
