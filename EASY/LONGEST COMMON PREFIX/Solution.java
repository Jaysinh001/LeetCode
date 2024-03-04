class Solution {
    public static String longestCommonPrefix(String[] strs) {

        if (strs.length == 1) {
            return strs[0];
        }
        String longestString = strs[0];

        for (int i = 0; i < strs.length; i++) {
            for (int j = 1; j < longestString.length(); j++) {

                if (strs[i].length() == j || longestString.charAt(j) != strs[i].charAt(j)) {
                    longestString = longestString.substring(0, j);
                }
                
            }
        }

        

        return longestString;
    }


    public static void main(String args[]){
        String arr[] = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(arr));
    }
}