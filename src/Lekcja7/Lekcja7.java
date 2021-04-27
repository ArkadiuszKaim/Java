package Lekcja7;

public class Lekcja7 {
    public static void main(String[] args) {

        Student joe = new Student("Joe");
        Student matt = new Student("Matt");
        Student bill = new Student("Bill");

        System.out.println(joe.equals(bill));
        System.out.println(joe.compareTo(matt));
        System.out.println("(" + joe + ")");

        System.out.println("-----------------");

        OuterClass out = new OuterClass();
        out.inner();


    }
}
