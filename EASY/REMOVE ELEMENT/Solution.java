import java.util.*;

class Solution {

    public static int removeElement(int[] nums, int val) {

        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }



    public static void main(String args[]){
        
        int[] num = new int[]{0,1,2,2,3,0,4,2};
        System.out.println(removeElement(num, 2));

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }


    }
}