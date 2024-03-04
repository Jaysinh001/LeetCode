import java.util.*;

class Solution {

    public static String addBinary(String a, String b) {

        int alen = a.length();
        int blen = b.length();
        int i = 0, c = 0;
        StringBuffer result = new StringBuffer();

        while (alen > i || blen > i || c != 0) {
            int num = 0;
            int x = 0;
            if (alen > i && a.charAt(alen-1 - i) == '1') {
                x = 1;
            }
            int y = 0;
            if (blen > i && b.charAt(blen-1 - i) == '1') {
                y = 1;
            }
            num = (x+y+c) % 2;
            c = (x + y + c) / 2;
            i++;
            result.append(String.valueOf(num));
        }

        System.out.println(result.reverse().toString());

        return result.reverse().toString();

    }

    public static void main(String args[]) {

        addBinary("1111", "11");

    }
}