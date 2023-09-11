public class Rectangle {
    public int length;
    public int width;
    public int s;
    public int c;
    public Rectangle (){
        this.length = 6;
        this.width = 8;

    }
    public Rectangle(int lengthInput, int widthInput){
        this.length = lengthInput;
        this.width = widthInput;
    }
public void go(){
    System.out.println();
}

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", s=" + s +
                ", c=" + c +
                '}';
    }
    public int gets(){
        return (this.length* this.width );

    }
    public int getC(){
        return (this.length + this.width)*2 ;
    }
}
