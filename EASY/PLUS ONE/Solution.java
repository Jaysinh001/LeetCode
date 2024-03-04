import java.util.*;

class Solution {

    public static int[] plusOne(int[] digits) {


        
            for (int i = digits.length - 1; i >= 0; i--) {

                if (digits[i] != 9) {
                    digits[i] = digits[i] + 1;
                    return digits;                       
                }else{
                    digits[i] = 0;
                }  
            }

            // if all elements of digits are 9 then the return statement of for loop will not executed as it only executed on non 9 element 

            int[] arr = new int[digits.length + 1];
            arr[0] = 1;
            return arr;
        }
        
        
       


    public static void main(String args[]){
        // int[] arr = new int[]{1,2,3};
        int[] arr = new int[]{0};
        int[] xarr = plusOne(arr);
        

        System.out.println("The size of array is : "+xarr.length);
        for (int i = 0; i < xarr.length; i++) {
            System.out.print(xarr[i] + ", ");
        }

    }
}