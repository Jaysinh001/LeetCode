import java.util.*;

class Solution {

    public static int searchInsert(int[] nums, int target) {
        // if the target is larger than all numbers of array
        if (target> nums[nums.length - 1]) {
            return nums.length;
        }
        // if the target is smallest than all numbers of array
        if (target < nums[0]) {
            return 0;
        }

        int low = 0, high = nums.length - 1, mid = 0;

        while (low <= high) {
            mid = (low+high) / 2;
            System.out.println("The Updated mid value is : " + mid);
            if(target == nums[(mid)]){
                return mid;
            }else if (target > nums[mid]) {
                low = mid + 1;
                System.out.println("The Updated low value is : " + low);
            }else{
                high = mid - 1;
                System.out.println("The Updated high value is : " + high);
            }

            System.out.println("Low is : "+low+" & high is :"+high);

        }
        // if target is not in array than return the best position to insert target element.
        return low;
    }



    public static void main(String args[]){
        int[] num = new int[]{1,3,5,6};
        System.out.println("The index is : " + searchInsert(num, 4));


    }
}