import java.util.HashMap;

public class _205_IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> reverse = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (map.containsKey(a)) {
                if (map.get(a) != b) {
                    return false;
                }
            } else {
                map.put(a, b);
            }

            if (reverse.containsKey(b)) {
                if (reverse.get(b) != a) {
                    return false;
                }
            } else {
                reverse.put(b, a);
            }
        }

        return true;
    }
}
//TC: O(n)
//SC: O(n)
