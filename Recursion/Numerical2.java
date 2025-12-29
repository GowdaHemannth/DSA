import java.util.ArrayList;
import java.util.function.Function;;

public class Numerical2 {
    public static void Fucntion(int idx, String s, StringBuilder Current, List<String> lis) {
        if (idx == s.length()) {
            lis.add(Current);
            return;
        }

        Function(idx + 1, s, Current, lis);

        Current.append(s.charAt(idx));
        Fucntion(+1, s, Current, lis);
        // Here i might be Wondering why am did not add one more call becase they told no duplicates SO thats why 
        Current.deleteCharAt(Current.length() - 1);

    }

    public static void main(String[] args) {
        String s = "abc";
        StringBuilder Current = new StringBuilder();
        List<String> list = new ArrayList<>();

    }

}
