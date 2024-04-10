//3rd QUE Parent class
public class CircleClass {
    //private variables
    private int radius;
    private double PIvalue;
    
    // Constructor without arguments
    public CircleClass() {
        this.radius = 0;
    }
    // Constructor with arguments
    public CircleClass(int radius, double pivalue) {
        this.radius = radius;
        this.PIvalue = pivalue;
    }
    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
         double result = 2 * PIvalue * radius;
         System.out.println("Circumference of a circle having radius "+getRadius()+" is "+result);
         return result;
    }
    // Get method for the radius
    public int getRadius() {
        return radius;
    }
    // Set method for the radius
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double getPIvalue() {
        return PIvalue;
    }
    public void setPIvalue(double pIvalue) {
        PIvalue = pIvalue;
    }

}
