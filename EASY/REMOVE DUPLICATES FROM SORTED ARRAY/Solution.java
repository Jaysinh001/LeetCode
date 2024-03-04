import java.util.*;

class Solution {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1)
            return nums.length;

        HashMap<Integer, Integer> _map = new HashMap<>();
        int k = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (!_map.containsKey(nums[i])) {
                _map.put(nums[i], 1);
                k++; // increase the counter for unique elements
            }

        }
        int counter = 0;
        for (int i = nums[0]; i <= nums[nums.length - 1]; i++) { // as array is in assending order thus last element will be the biggest.
            if (_map.containsKey(i)) {
                nums[counter] = i;
                counter++;
            }
        }
        
        return k;
    }

    public static void main(String args[]) {

        int[] nums = new int[] {-1,0,0,0,0,3,3};
        // int[] nums = new int[] { 1, 1, 2 };
        // int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicates(nums);
        System.out.println(k);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ,");
        }
    }
}