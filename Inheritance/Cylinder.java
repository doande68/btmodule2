package Inheritance;

public class Cylinder extends Circle {
    private double height ;
  public Cylinder(double radius, String color,double height){
      super(radius,color);
      this.height = height;
  }

    public double getHeight() {
        return height;   }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
      return this.getRadius() * this.getRadius() * 3.14  * getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                "} " + super.toString();
    }
}
