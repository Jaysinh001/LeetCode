import java.util.*;

class Solution {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] mArray = new int[m];
        for (int i = 0; i < m; i++) {
            mArray[i] = nums1[i];
        }

        int m_counter = 0;
        int n_counter = 0;

        for (int i = 0; i <= nums1.length - 1; i++) {
            if ((m >= i) && (mArray[m_counter] > nums2[n_counter])) {
                nums1[i] = nums2[n_counter];
                n_counter++;
                System.out.println("The value of i : "+ i + ", ===> " + nums1[i]);
            } else if ((m >= i) && (mArray[m_counter] <= nums2[n_counter])) {
                nums1[i] = mArray[m_counter];
                m_counter++;
                System.out.println("The value of i : "+ i + ", ===> " + nums1[i]);
            } else {
                nums1[i] = nums2[n_counter];
                n_counter++;
                System.out.println("The value of i : "+ i + ", ===> " + nums1[i]);
            }
        }

    }

    public static void main(String args[]) {

        // int[] num1 = new int[] { 1, 2, 3, 0, 0, 0 };
        // int[] num2 = new int[] { 2, 5, 6 };

        int[] num1 = new int[] {1};
        int[] num2 = new int[] {};

        // int[] num1 = new int[] { 1, 2, 3, 0, 0, 0 };
        // int[] num2 = new int[] { 2, 5, 6 };

        merge(num1, 1, num2, 0);

    }
}