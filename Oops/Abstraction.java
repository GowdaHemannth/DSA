package Oops;

public class Abstraction {
    public static void main(String[] args) {
        
    }
}
abstract class Animal{
    void eat(){
        System.out.println("Animal Eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    void walk(){
        System.out.println("Animal walks");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("Animal walks");
    }
}