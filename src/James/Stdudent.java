package James;

public class Stdudent {
    private String name ="John";
    private String clazz ="C02";
    Stdudent(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }
}
 class Tests {
     public static void main(String[] args) {
         Stdudent st1 = new Stdudent();
         System.out.println(st1.getName());
         System.out.println(st1.getClazz());
         st1.setName("De");
         st1.setClazz("C06");
         System.out.println(st1.getName());
         System.out.println(st1.getClazz());
     }
 }