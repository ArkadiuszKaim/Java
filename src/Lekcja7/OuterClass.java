package Lekcja7;

public class OuterClass {
        public void inner(){
             class InnerClass{
                 public void display() {
                     System.out.println("This is Inner");
                 }
        }
            InnerClass in = new InnerClass();
             in.display();
        }
}

