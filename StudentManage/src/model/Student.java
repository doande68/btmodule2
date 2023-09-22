package model;

import com.sun.javafx.scene.control.behavior.SpinnerBehavior;

import java.util.Arrays;

public class Student {
    private int id;
    private String name;
    private String gender;
    private double[] point;
    public static int idIncrement = 1;

    public Student(String name, String gender, double point1, double point2,double point3){
       this.id = idIncrement;
       this.name = name;
       this.gender = gender;
       this.point = new double[]{point1,point2,point3};
       idIncrement ++;
    }
    public Student(int id,String name,String gender,double point1, double point2,double point3){
        this.id = id;
        this.name = name;
        this.gender= gender;
        this.point = new double[]{point1,point2,point3};
    }
    public double getAvg(){
        double sum = 0;
        for (double element : this.point) {
            sum += element;
        }
        return sum;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double[] getPoint() {
        return point;
    }

    public void setPoint(double[] point) {
        this.point = point;
    }

    public static int getIdIncrement() {
        return idIncrement;
    }

    public static void setIdIncrement(int idIncrement) {
        Student.idIncrement = idIncrement;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", point=" + Arrays.toString(point) +
                '}';
    }
}
