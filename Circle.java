public class Circle {
    private double radius;//attribute
    public Circle(double radius) {
        this.radius = radius;
    }
    public void setRadius(double radius) {//setter
        this.radius = radius;
    }
    public double getRadius() {//getter
        return radius;
    }

    //area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }//circumstances
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);  
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());


    }
}

