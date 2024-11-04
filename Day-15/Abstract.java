public class Abstract{
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();

        //Animal --> Horse --> Mustang (hierarchy)
    }
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("animal constructor called");
        color = "Brown";
    }
    void eat() {
        System.out.println("animals eat");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("horse constructor called");
    }
    void changeColor() {
        color = "dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "yellow";
    }
    void walk() {
        System.out.println("walk on 2 legs");
    }
}