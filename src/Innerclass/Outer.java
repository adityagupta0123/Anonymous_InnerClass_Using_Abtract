package Innerclass;

abstract class My{
    abstract void display();
}

public class Outer {
        public void meth() {
            My m = new My() {
                @Override
                void display() {
                    System.out.println("hello");
                }
            };
            m.display();
        }
}
class test {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.meth();
    }
}
