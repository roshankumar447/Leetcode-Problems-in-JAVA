import java.util.ArrayList;
import java.util.List;

class Solution {
    public String removeOuterParentheses(String s) {
        List<String> arr = new ArrayList<>();
        int c = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                c += 1;
                if (c > 1) {
                    arr.add(Character.toString(ch));
                }
            } else {
                c -= 1;
                if (c > 0) {
                    arr.add(Character.toString(ch));
                }
            }
        }
        
        return String.join("", arr);
    }
}
