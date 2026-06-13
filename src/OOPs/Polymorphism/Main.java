package OOPs.Polymorphism;

public class Main {
    static void main() {
//        Calculator c = new Calculator();
//        System.out.println(c.add(2,3));
//        System.out.println(c.add(2,3,4));
//        System.out.println(c.add(2,3,4,5.6));

        // Runtime Polymorphism
        Circle c = new Circle();
        doDrawingStuff(c);

        Rect r = new Rect();
        doDrawingStuff(r);
//
        Shape s = new Shape();
        doDrawingStuff(s);

    }

    public static void doDrawingStuff(Shape s){
        s.draw(); //  iska meaning hai ki Shape class ka draw method call hona chahiye , par ye Circle class ke draw method ko call kar rha hai
    }
}
