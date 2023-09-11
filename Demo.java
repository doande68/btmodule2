
public class Demo {
    public String name;
    public int weight;
    public String color;

    public Demo() {
        this.name = "BMW";
        this.weight = 2000;
        this.color = "black";
    }
public Demo(String nameInput, int weightInput , String colorInput){
        this.name = nameInput;
        this.weight = weightInput;
        this.color = colorInput;
 }
 public void go(){
     System.out.println(this.name + "Đang đua");

 }

    @Override
    public String toString() {
        return "Xe này là " + this.name + " có trọng lượng laf" + this.weight + " có màu là " + this.color;
    }
}

