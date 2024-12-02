package SlidingWindow;

public class Example2 {
    // Function to find the longest substring without repeating characters
    public static int Function(String str) {
        int MaxLength = 0;

        // Loop to set the starting point of the substring
        for (int i = 0; i < str.length(); i++) {
            int[] hash = new int[256];  // Array to store the frequency of characters

            // Loop to set the ending point of the substring
            for (int j = i; j < str.length(); j++) {
                char rchar = str.charAt(j);  // Get the character at index j

                // If the character is already seen, break the loop
                if (hash[rchar] == 1) {
                    break;  // Break before updating MaxLength if we encounter a repeat
                }

                // Mark this character as seen
                hash[rchar] = 1;

                // Now calculate the maximum length, since no repeated character is found
                int Length = j - i ;
                MaxLength = Math.max(MaxLength, Length);
            }
        }

        return MaxLength;
    }

    public static void main(String[] args) {
        String str = "abcdeabvc";
        int result = Function(str);
        System.out.println(result);  // Output the result
    }
}
