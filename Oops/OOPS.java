package Oops;

public class OOPS{
    public static void main(String[] args) {
        Pen p1=new Pen();// now we have created the pen object
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.Tip=8;
        System.out.println(p1.getTip());
      Student s1=new Student();
      s1.name="Hemanth";
      s1.roll=234;
      Student s2=new Student(s1);
      System.out.println(s2.name);

    }

}

class Pen{
    String color;
    int Tip;
    
    String getColor(){
      return  this.color;
    }

    int getTip(){
        return this.Tip;
    }
    void setColor(String newcolor){
        color=newcolor; // it can also be return as this.color=newcolor 
    }
    void setTip(int newtip){
        Tip=newtip;

    }
}

class Student{
    String name;
    int roll;

     Student(Student s1){ // this is a  Shallow copy Constructor 
        this.name=s1.name;
        this.roll=s1.roll;
     }

     // Now we will define the deep copy Constructor



     Student(){
        System.out.println("Hello everyone");
     }  
}
