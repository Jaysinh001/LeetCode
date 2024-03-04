import java.util.*;

class Solution {

    public static int climbStairs(int n) {

        // it is simillar to fibonachi series 
        // let say n == 3 then there are ways(n-1) + ways(n-2)

        // simillarly for n-1 we can say the total ways for reaching n-1 is ways(n-2) + ways(n-3).

        // threre are two approach for this problem 1. dynamic programming & 2. Recursive aproach

        // for DP approach 
        if(n == 1 || n == 2) return n;

        int[] arr = new int[n+1];

        arr[1] = 1;
        arr[2] = 2;

        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }


        return arr[n];
        
    }

    public static void main(String args[]) {

        System.out.println(climbStairs(4));

    }
}