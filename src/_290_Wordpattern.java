import java.util.HashMap;

public class _290_Wordpattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> reverse = new HashMap<>();
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            char a = pattern.charAt(i);
            String b = words[i];
            if (map.containsKey(a)) {
                if (!map.get(a).equals(b)) {
                    return false;
                }
            } else {
                map.put(a, b);
            }
            if (reverse.containsKey(b)) {
                if (!reverse.get(b).equals(a)) {
                    return false;
                }
            } else {
                reverse.put(b, a);
            }
        }
        return true;
    }
}
//TC=O(n)
//SC=O(n)
