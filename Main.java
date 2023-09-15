import Inheritance.Circle;
import Inheritance.Cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4.2, "red");
        System.out.println(circle.toString());
        Circle cylinder = new Cylinder(5.2, "blue", 5.0);
        System.out.println(cylinder.toString());
        Cylinder  cylinder1 = new Cylinder(9.0 , "yellow",1.0);
        System.out.println(cylinder1.toString());
    }
}