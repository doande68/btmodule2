package Student_Manager;

public class Main {
    public static void main(String[] args) {
        StudentManage clazz = new StudentManage();
        double[] point1 = {8.5, 7, 5, 9, 5};
        Student student = new Student(01, "Đề", point1, "Nam");

        double[] point2 = {7.5, 8.5, 7.5};
        Student student2 = new Student(02, "Đức", point2, "Nam");

        double[] point3 = {9.6, 7.8, 8.0};
        Student student3 = new Student(03, "Hiếu", point3, "Nam");

        clazz.add(student);
        clazz.add(student2);
        clazz.add(student3);
        System.out.println("Danh sách sinh viên");
        for (int i = 0; i < clazz.getSize(); i++) {
            System.out.println(clazz.getListStudent()[i]);
        }
        double[] point4 = {10.0, 1.0, 9.0};
        Student student4 = new Student(04, "linh", point4, "Nam");
        clazz.edit(3, student4);
        System.out.println("Danh sách sinh viên sau khi sửa:");
        for (int i = 0; i < clazz.getSize(); i++) {
            System.out.println(clazz.getListStudent()[i]);
        }
        clazz.delete(02);
        System.out.println("Danh sách sau khi xóa:");
        for (int i = 0; i < clazz.getSize(); i++) {
            System.out.println(clazz.getListStudent()[i]);
        }
        System.out.println("Điểm trung bình của lớp là: " + (double) Math.round(clazz.getAvgClazz() * 1000) / 1000);
        System.out.println("Điểm trung bình lớn nhất là: " + clazz.getMaxAvg());

        System.out.println("Danh sách sinh viên có chữ h: ");
        for (Student student1 : clazz.getStudentByName("h")) {
            System.out.println(student1);
        }
    }

}
