package View;

import Manager.StudentManager;
import model.Student;

import java.util.Scanner;

public class Menu {
    private StudentManager studentManager = new StudentManager();
    private Scanner inputInt = new Scanner(System.in);
    private Scanner inputString = new Scanner(System.in);

    public void showMainMenu(){
        int choice;
        do{
            System.out.println("-------Quản lý sinh viên ------/n1.Thêm sinh viên"+
                    "/n2.Xóa sinh viên/n3.Sửa sinh viên/n4.Tìm kiếm sinh viên theo Id/n5.Hiển thị danh sách sinh viên theo tên gần đúng"+
                    "/n6.Học viên có điểm trung bình lớn nhất/n7.Hiển thị tất cả:");
            System.out.println("Nhập lựa chọn cuả bạn :");
            choice = inputInt.nextInt();
            switch (choice){
                case 1:
                    showMenuAdd();
                    break;
                case 2:
                    showmMenuDelete();
                    break;
                case 3:
                    showMenuEdit();
                    break;
                case 4:
                    showSeachMenuById();
                    break;
                case 5:
                  //  showSeachMenuByName();
                    break;
                case 6 :
                  //  showTheBestAverage();
                    break;
                case 7 :
                    showAll();
                    break;
            }
        } while (choice != 0);
    }
    public void showMenuAdd(){
        System.out.println("---1.Thêm sinh viên mới---");
        System.out.println("Nhập tên sinh viên: ");
        String name = inputInt.nextLine();
        System.out.println("Nhập giới tính: ");
        String gender = inputInt.nextLine();
        System.out.println("Nhập điểm toán:");
        int math = inputInt.nextInt();
        System.out.println("Nhập điểm Anh:");
        int english = inputInt.nextInt();
        System.out.println("Nhập điểm Văn: ");
        int literature = inputInt.nextInt();
        Student student = new Student(name, gender,math,english,literature);
        studentManager.add(student);
        System.out.println("Thêm sinh viên thành công!!!");
    }
    public void showmMenuDelete(){
        System.out.println("---2.Xóa sinh viên---");
        System.out.println("Nhập ID sinh viên muốn xóa :");
        int id = inputInt.nextInt();
        if(studentManager.chekId(id)== false){
            System.out.println("/n Không có sinh viên này trong danh sách ???");
        }
        else {
            studentManager.delete(id);
            System.out.println("Đã xóa sinh viên thành công!!!");
        }
    }
    public void showMenuEdit(){
        System.out.println("---3.Sửa sinh viên ---");
        System.out.println("Nhập ID sinh viên cần sửa:");
        int id = inputInt.nextInt();
        System.out.println("Nhập tên sinh viên :");
        String name = inputInt.nextLine();
        System.out.println("Nhập giới tính sinh viên:");
        String gender = inputInt.nextLine();
        System.out.println("Nhập điểm toán:");
        int math = inputInt.nextInt();
        System.out.println("Nhập điểm Anh:");
        int enghlish = inputInt.nextInt();
        System.out.println("Nhập điểm văn:");
        int literature = inputInt.nextInt();
        Student student = new Student(name,gender,math,enghlish,literature);
        StudentManager.edit(id,student);
        System.out.println("===> Sửa thành công!!");
    }
    public void showSeachMenuById(){
        
    }

    public void showAll(){
        Student[] students = studentManager.findAll();
        int size = studentManager.getSize();
        System.out.println("Danh sách sinh viên là ");
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
    }


}
