//3rd QUE Child class
public class CircleClass2 {
    
    public static void main(String[] args) {
        // Create an instance of the CircleClass
        CircleClass tClass = new CircleClass();

        // Set the radius and PI Value of the circle
        tClass.setRadius(25);
        tClass.setPIvalue(3.14);
        System.out.println("Value of radius is "+tClass.getRadius());
        System.out.println("");

        // Print the formula to calculate circumference
        System.out.println("To calculate circumference of a circle, formula is 2*π*R");
        System.out.println("");

        // Calculate and print the circumference of the circle
        tClass.calculateCircumference();
    }
}
