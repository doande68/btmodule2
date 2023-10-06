package View;

import Manager.ProductManager;
import Model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ProductManager listProduct = new ProductManager();
    private Scanner inputNum = new Scanner(System.in);
    private Scanner inputStr = new Scanner(System.in);


    public void showMainMenu(){
        int choice;
        do {
            System.out.println("----Quản lý sản phẩm ----\n" +
                    "1.Thêm sản phẩm \n" +
                    "2.Sửa sản phẩm \n" +
                    "3.Xóa sản phẩm \n" +
                    "4.Lấy ra tất cả sản phẩm \n" +
                    "5.Tìm kiếm các sản phẩm gần đúng \n" +
                    "6.Nhập vào sản phẩm và lấy ra các sản phẩm cùng loại \n " +
                    "7.Tìm sản phẩm theo id\n" +
                    "8.Thoát trương trình \n");
            System.out.println("Nhập lựa chọn của bạn:");
            try {
                choice = Integer.parseInt(inputStr.nextLine());
                switch (choice) {
                    case 1:
                        showMenuAdd();
                        break;
                    case 2:
                        showMenuEdit();
                        break;
                    case 3:
                        showMenuDelete();
                        break;
                    case 4:
                        showMenuShow();
                        break;
                    default:
                        System.out.println("Thoát chương trình thành công !!!");
                        break;
                }
            } catch (NumberFormatException exception) {
                System.out.println("Nhập sai định dạng");
                choice = -1;
            }
        } while (choice != 0);
    }
    public void showMenuAdd(){
        System.out.println("Thêm sản phẩm :");
        System.out.println("Nhập tên sản phẩm:");
        String name = inputNum.nextLine();
        System.out.println("Nhập số lượng sản phẩm : ");
        int quantity = inputNum.nextInt();
        System.out.println("Nhập giá sản phẩm :");
        double price = inputNum.nextInt();
        System.out.println("Nhập loại sản phẩm :");
        String categorize = inputStr.nextLine();
        Product product = new Product(name , quantity,price,categorize);
        listProduct.add(product);
        System.out.println("Thêm thành công !!!\n");
    }
    public void showMenuEdit(){

    }
    public void showMenuDelete(){

    }
    public void showMenuShow(){
        System.out.println("Danh sách sản phẩm hiện tại:");
        ArrayList<Product> list = listProduct.showAll();
        for (Product product:
           list  ) {
            System.out.println(product);
        }
        System.out.println();
   }
}
