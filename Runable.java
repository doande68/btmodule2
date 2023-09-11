public class Runable {

    public static void main(String[] args) {
//        Demo car1 = new Demo();
//        System.out.println(car1.name);
//        System.out.println(car1.weight);
//        System.out.println(car1.color);
//        System.out.println(car1.toString());
//          Rectangle hch = new Rectangle();
//        System.out.println(hch.toString());
//        System.out.println(hch.gets());
//        System.out.println(hch.getC());
//        QuadraticEquation quadraticEquation = new QuadraticEquation(5,9,2);
//        System.out.println(quadraticEquation);
//        if (!quadraticEquation.checkDelta()) {
//            System.out.println("Vô nghiệm bạn ơi!!");
//        } else {
//            System.out.println("Nghiệm 1 là : " + Math.floor(quadraticEquation.getRoot2() * 100) / 100);
//            System.out.println("Nghiệm 2 là : " + (double) Math.round(quadraticEquation.getRoot2()));
//        }

        double[] mark = {9.0, 8.3, 8.0};
        Student s1 = new Student("Đề", 39, mark);
        double[] mark2 = {8.0, 8.9, 8.5};
        Student s2 = new Student("Đức", 20, mark2);
        s1.comparAvg(s1,s2);
    }
}
