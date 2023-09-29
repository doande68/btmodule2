package StudentManager2;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Student student1 = new Student(1, "Dân", new double[]{6,7,8}, "Nam");
        Student student2 = new Student(2, "Hiếu", new double[]{3,9,6}, "Nam");
        Student student3 = new Student(3, "Linh", new double[]{8,7,3}, "Nữ");
        manager.addStudent(student1);
        manager.addStudent(student2);
        manager.addStudent(student3);

        for (Student student : manager.students.values()) {
            System.out.println(student);
        }

        double classAverage = manager.calculateClassAverage();
        System.out.println("Điểm trung bình của lớp: " + classAverage);

        Student foundStudent = manager.findStudentById(2);
        System.out.println("Tìm theo ID: " + foundStudent);

        List<Student> searchResults = manager.searchStudentsByName("char");
        System.out.println("Tìm tên:");
        for (Student result : searchResults) {
            System.out.println(result);
        }

        Student highestAverageStudent = manager.findStudentWithHighestAverage();
        System.out.println("Student with Highest Average Score: " + highestAverageStudent);
    }
}
   