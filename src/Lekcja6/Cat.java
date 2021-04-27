package Lekcja6;

public class Cat extends Dog {

        private int food;
    public Cat(String name, int age, int food) {
        super(name, age);
        this.food=food;
    }
    public Cat(String name, int age){
        super(name,age);
        this.food = 50;

    }
    public Cat(String name){
        super(name,0);
        this.food = 44;

    }
    public void speak(){
        System.out.println("Miauu, my Name is " + this.name + " and i get fed " + this.food + " age: " + this.age);
    }
    public int eat (int x){
       return this.food -= x;
    }
}
