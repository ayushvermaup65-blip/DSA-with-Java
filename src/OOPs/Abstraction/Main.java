package OOPs.Abstraction;

abstract class Bird{
    abstract void fly();
    abstract void eat();
}

class Sparrow extends Bird {
    @Override
    void fly() {
        System.out.println("Sparrow flying");
    }
    @Override
    void eat(){
        System.out.println("Sparrow eating");
    }
}


public class Main {
    static void main() {
        Bird b = new Sparrow();
        b.eat();
        b.fly();
    }
}
