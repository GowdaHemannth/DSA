package Oops;

public class Interface {
    public static void main(String[] args) {
        Queen q=new Queen();
        q.moves();
    }
    
}

interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
  public  void moves(){ // it is neccessary to add public keyword to it or it will be of public 
    System.out.println("This can move horizontally and verticalyy");
    }
}
