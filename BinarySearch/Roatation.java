package BinarySearch;

public class Roatation {
    // Function to count array rotations
    //  To find the Number of rotation find the minimum Elements index
    static int Rotation(int arr[], int Start, int End) {
        int n = arr.length;
        
        while (Start <= End) {
            int mid = Start + (End - Start) / 2;
            int Prev = (mid + n - 1) % n;
            int Next = (mid + 1) % n;

            // Check if mid is the pivot (smallest element)
            if (arr[mid] <= arr[Prev] && arr[mid] <= arr[Next]) {
                return n-mid; // The number of rotations is the index of the smallest element
            }

            // If left half is sorted, move to the right half
            if (arr[Start] <= arr[mid]) {
                Start = mid + 1;
            } else {
                End = mid - 1;
            }
        }
        
        return 0; // If the array is not rotated
    }

    public static void main(String[] args) {
        int arr[] = {6,8,11,12,15,18,2,5}; // Rotated array
        int Start = 0;
        int End = arr.length - 1;
        System.out.println("Array is rotated " + Rotation(arr, Start, End) + " times.");
    }
}
