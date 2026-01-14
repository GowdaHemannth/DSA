public class StaircaseMatrix {
    public static Boolean Function(int matrix[][], int key){
        int row=0; int column=matrix[0].length-1;
        while(row<matrix.length&& row>0 && column>=0 && column<matrix[0].length){
            if(key==matrix[row][column]){
                System.out.print("(" + row + " " + column + ")");


                return true;
            }
           else if( key<matrix[row][column]){
                column--;
            }
            else{
                row++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                         {27,29,37,48},
                          { 32,33,39,50}};
                          int key=33;
                          Boolean result=Function(matrix, key);
                          System.out.println(result);
    }
}

 