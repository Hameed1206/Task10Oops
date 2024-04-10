//7th QUE
class Tea {
    // Variable to store the name of the tea
    public String TeaName;

    // Constructor to initialize the name of the tea
    public Tea(String name) {
        TeaName = name;
    }
    // Method to prepare the tea
    public void prepareTea() {
        System.out.println(TeaName + " is prepared");
    }
}

// Blacktea class representing black tea
class Blacktea extends Tea {

    // Constructor to initialize the name of the tea
    public Blacktea(String name) {
        super(name);
        TeaName = name;
    }
    // Method to prepare black tea
    @Override
    public void prepareTea() {
        System.out.println(TeaName + " is prepared");
    }
}

// Greentea class representing green tea
class Greentea extends Tea {

    // Constructor to initialize the name of the tea
    public Greentea(String name) {
        super(name);
        TeaName = name;
    }
    // Method to prepare green tea
    @Override
    public void prepareTea() {
        System.out.println(TeaName + " is prepared");
    }
}

// Herbaltea class representing herbal tea
class Herbaltea extends Tea {

    // Constructor to initialize the name of the tea
    public Herbaltea(String name) {
        super(name);
        TeaName = name;
    }
    // Method to prepare herbal tea
    @Override
    public void prepareTea() {
        System.out.println(TeaName + " is prepared");
    }
}

// Main class to test the functionality
public class ArrayOfTeaObjects {
    public static void main(String[] args) {

        // Create an array of Tea objects
        Tea[] teas = new Tea[4];

        // Initialize the array with different types of tea objects
        teas[0] = new Tea("Normal tea");
        teas[1] = new Blacktea("Black tea");
        teas[2] = new Greentea("Green tea");
        teas[3] = new Herbaltea("Herbal tea");

        // Print the names of each tea
        System.out.println(teas[0].TeaName);
        System.out.println(teas[1].TeaName);
        System.out.println(teas[2].TeaName);
        System.out.println(teas[3].TeaName);

        // Prepare each tea
        teas[0].prepareTea();
        teas[1].prepareTea();
        teas[2].prepareTea();
        teas[3].prepareTea();
    }
}
