import java.util.Arrays;

public class Student {
    public String name;
    public int age;
    public double[] point;
    public Student(String nameInput,int ageInput,double[] pointInput){
        this.name = nameInput;
        this.age = ageInput;
        this.point = pointInput;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setPoint(int age){
        this.point = point;
    }
    public double[] getPoint(){
        return point;
    }
    public void setPoint(double[] point){
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", point=" + Arrays.toString(point) +
                '}';
    }
    public double getAvg(){
        double sum = 0;
        for (int i = 0; i < this.point.length; i++) {
            sum += this.point[i];
        }
        return  sum / point.length;
    }
    public void comparAvg(Student s1 , Student s2) {
        if (s1.getAvg() > s2.getAvg()){
            System.out.println(s1.toString());
        } else if (s1.getAvg() == s2.getAvg()) {
            System.out.println("Điểm trung bình bằng nhau");
        } else {
            System.out.println(s2.toString());
        }
    }
}
