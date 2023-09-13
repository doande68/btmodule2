package James;

public class Crile {
    private double radius = 1.0;
    public String color ="red";

    Crile(){
    }
    Crile(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(double radius) {
        return Math.pow(radius, 2) * 3.14;
    }
}
class Test{
    public static void main(String[] args) {
        Crile crile1 = new Crile(6.3);
        System.out.println(crile1.getRadius());
        System.out.println(crile1.getArea(6.3));
    }
}