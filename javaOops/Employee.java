//2nd QUE Parent class
public class Employee {
    
    // Private Variables
    private int ID;
    private String Firstname;
    private String LastName;
    private int salary;

    // Constructor to initialize employee details
    public Employee(int ID, String fname, String lname){
        this.ID = ID;
        this.Firstname = fname;
        this.LastName = lname;
    }
    // Getter method for retrieving ID
    public int getID() {
        return ID;
    }
    // Getter method for retrieving Firstname
    public String getFirstname() {
        return Firstname;
    }
    // Getter method for retrieving Lastname
    public String getLastName() {
        return LastName;
    }
    // Getter method for retrieving Full Name
    public String getName() {
        String name = Firstname + " " + LastName;
        return name;
    }
    // Getter method for retrieving Salary
    public int getSalary() {
        return salary;
    }
    // Setter method for setting Salary
    public int setSalary(int salary) {
        return this.salary = salary;
    }
    // Method to calculate and retrieve Annual Salary
    public int getAnnualSalary() {
        return salary * 12;
    }
    // Method to raise Salary by a percentage
    public int raiseSalary(int percentage) {
        int raisedSalary = salary * percentage / 100;
        int newSalary = salary + raisedSalary;
        return newSalary;
    }
    // Method to display employee details before and after salary increment
    public String toString(){
        System.out.println("Employee {ID: " + getID() + " || Name: " + getName() + " || Salary before increment: " + getSalary() + " }");
        System.out.println("");
        System.out.println("Employee {ID: " + getID() + " || Name: " + getName() + " || Salary After increment: " + raiseSalary(25) + " }");
        return Firstname;
    }
}
