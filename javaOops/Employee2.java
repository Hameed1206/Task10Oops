//2nd QUE Child class
public class Employee2 {
    
    public static void main(String[] args) {
       // Create an instance of Employee class
       Employee sEmployee = new Employee(54545, "Guvi", "Geek");

       // Set the salary of the employee
       sEmployee.setSalary(60000);

       // Print the annual salary of the employee
       System.out.println("Annual CTC of Employee is " + sEmployee.getAnnualSalary()+"/-");
       System.out.println("");

       // Print the updated salary after increment
       System.out.println("Updated salary per month after increment is " + sEmployee.raiseSalary(25)+"/-");
       System.out.println("");

       // Calling a method to display employee details before and after salary increment
       sEmployee.toString();
   }
}