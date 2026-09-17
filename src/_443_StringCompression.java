public class _443_StringCompression {
    public int compress(char[] chars) {
        int read = 0;
        int write = 0;
        while (read < chars.length) {
            int count = 0;
            char currentChar = chars[read];
            while (read < chars.length && chars[read] == currentChar) {
                count++;
                read++;
            }
            chars[write] = currentChar;
            write++;
            if (count > 1) {
                String countStr = String.valueOf(count);

                for (int i = 0; i < countStr.length(); i++) {
                    chars[write] = countStr.charAt(i);
                    write++;
                }
            }
        }
        return write;
    }
}
//TC=O(n)
//SC=O(1)
