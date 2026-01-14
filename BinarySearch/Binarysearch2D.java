package BinarySearch;

import java.util.Arrays;

import java.util.List;
import java.util.ArrayList;

public class Binarysearch2D {
    public static boolean Function(int matrix[][], int key, List<List<Integer>> list) {
        // here as we know every Elemsnt is Increasing in Row Wise and ColumnWise So
        // if elemsnt is greater than key then no need to go to elemsnt in next column
        int row = 0;
        int column = matrix[0].length - 1;
        while (row < matrix.length && column >= 0) {
            // Currently we standing at top-Right
            if (key == matrix[row][column]) {
                // Here Arrays Used add row and column
                System.out.println("row" + " " + row +"  "+"column"+ " "+ column);
                return true;
            } else if (key < matrix[row][column]) {
                column--;

            } else {
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Here we will be APPLYING bIANR sEARCH oN 2D aRRAY
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        int key = 33;
        List<List<Integer>> list = new ArrayList<>();
        Function(matrix, key, list);
        // These How we ierate through list arrayslist if theyare nested 
        

    }

}