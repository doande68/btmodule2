package Student_Manager;

import java.util.Arrays;

public class Student {
    private int id;
    private String name;
    private double [] point ;
    private String sex;

    public Student(int id,String name , double[] point, String sex){
        this.id = id;
        this.name = name;
        this.point = point;
        this.sex = sex;
    }
    Student(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getPoint() {
        return point;
    }

    public void setPoint(double[] point) {
        this.point = point;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", point=" + Arrays.toString(point) +
                ", sex='" + sex + '\'' +
                '}';
    }

    public double getAvg(){
        double sum = 0;
        for (int i = 0; i < point.length; i++) {
            sum += this.point[i];
        }
        return sum / point.length ;
    }
}
