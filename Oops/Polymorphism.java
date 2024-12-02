package Oops;

public class Polymorphism {
    public static void main(String[] args) {
        
    }
}
class Calculator{
  // Now we are defining the type of polymorphism called 
  //" method Overloading "   
    int Sum(int a,int b){ // here we will deifine the Sum function
        return a+b;
    }
    float Sum(float a, float b){ // we have defined the same Sum function but with the different parameters
        return a+b;
    }
}
