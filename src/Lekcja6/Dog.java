package Lekcja6;

public class Dog {

    protected static int count = 0;
    protected String name;
    protected int age;

    public Dog(String name,int age){
        this.name = name;
        this.age = age;
        Dog.count +=1;
        Dog.display();

    }
    public static void display(){
        System.out.println("Im a dog!");
    }
    public void speak(){
        System.out.println("I am " + this.name + " and I am " + this.age + " years old!");
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

}
