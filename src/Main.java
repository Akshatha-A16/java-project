import java.awt.*;
import OOPS.*;
class Shape{
    String color;

}
class Triangle extends  Shape{
   public void area(int l, int b)
   {
       System.out.println(1/2*l*b);
       System.out.println("triangle color is "+this.color);

   }
}
class Circle extends  Shape{
            public  void area(int r){
                System.out.println(3.14*r*r);
                System.out.println("circlr color is "+this.color);
            }
}

class Rectangle extends Circle{
    public void area(int l , int b){
        System.out.println(l*b);
        System.out.println("reactange color"+this.color);

    }
}
public class Main {
    public static void main(String[] args){
        Shape s1 = new Shape();
        Triangle t1 = new Triangle();
        t1.color="red";
        t1.area(2,4);
        Circle c1 = new Circle();
        c1.color="green";
        c1.area(5);
        Rectangle r1 = new Rectangle();
//        r1.area(4,5);
        r1.color="blue";
        r1.area(4,5);

        // Encapsulation + Constructor
        Animal a = new Animal("Lion", 6);
        System.out.println(a.getName());
        a.makeSound();

        // Inheritance + Polymorphism
        Dog d = new Dog("Buddy", 3, "Beagle");
        System.out.println(d.getName() + " - " + d.getBreed());
        d.makeSound();

        // Abstraction
        Sparrow sp = new Sparrow();
        sp.fly();
        sp.eat();

        // Static Concept
        new Counter();
        new Counter();
        System.out.println("Counter objects: " + Counter.getCount());

    }
}