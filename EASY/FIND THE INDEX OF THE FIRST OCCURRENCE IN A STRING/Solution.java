import java.util.*;

class Solution {

    public static int strStr(String haystack, String needle) {
        int len_needle = needle.length();

        for (int i = 0; i < haystack.length(); i++) {
            if ((haystack.length() - i >= len_needle) && (haystack.substring(i, i+len_needle).equals(needle))) {
                return i;
            }
        }
        return -1;
    }



    public static void main(String args[]){
        
        int[] num = new int[]{0,1,2,2,3,0,4,2};
        System.out.println(removeElement(num, 2));

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }


    }
}