public class QuadraticEquation {
    public int a;
    public int b;
    public int c;



    public QuadraticEquation(int aInput, int bInput, int cInput) {
        this.a = aInput;
        this.b = bInput;
        this.c = cInput;

    }

    public int getA() {
        return a;
    }

    public void setA() {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB() {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC() {
        this.c = c;
    }

    @Override
    public String toString() {  // ax^2 + bx + c = 0
        return "Phương trình dạng là :" + this.a + "x^2 + " + this.b + "x + " + this.c + " = 0";
    }

    double getDelta() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    double getRoot1() {
        double delta = getDelta();
        double root1;
        if (delta == 0) {
            root1 = -this.b / (this.a * 2);
        } else {
            root1 = (-this.b + Math.sqrt(delta)) / (this.a * 2);
        }
        return root1;
    }

    double getRoot2() {
        double delta = getDelta();
        double root2;
        if (delta == 0) {
            root2 = -this.b / (2 * this.a);
        } else {
            root2 = (-b - Math.sqrt(delta)) / (this.a * 2);
        }
        return root2;
    }

    boolean checkDelta() {
        double delta = getDelta();
        if (delta < 0) {
            return false;
        } else {
            return true;
        }
    }
}
