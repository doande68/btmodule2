package StudentManager2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentManager {
    public Map<Integer, Student> students;

    public StudentManager() {
        students = new HashMap<>();
    }

    public void addStudent(Student student) {
        students.put(student.getID(), student);
    }

    public void updateStudent(int id, Student updatedStudent) {
        if (students.containsKey(id)) {
            students.put(id, updatedStudent);
        }
    }

    public void deleteStudent(int id) {
        students.remove(id);
    }

    public double calculateClassAverage() {
        double sum = 0;
        int count = 0;

        for (Student student : students.values()) {
            sum += student.calculateAverageScore();
            count++;
        }

        return sum / count;
    }

    public Student findStudentById(int id) {
        return students.get(id);
    }

    public List<Student> searchStudentsByName(String name) {
        List<Student> result = new ArrayList<>();

        for (Student student : students.values()) {
            if (student.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(student);
            }
        }

        return result;
    }

    public Student findStudentWithHighestAverage() {
        Student highestAverageStudent = null;
        double highestAverage = Double.MIN_VALUE;

        for (Student student : students.values()) {
            double average = student.calculateAverageScore();
            if (average > highestAverage) {
                highestAverage = average;
                highestAverageStudent = student;
            }
        }

        return highestAverageStudent;
    }
}
