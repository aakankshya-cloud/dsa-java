package DP;

public class ClimbingStairs {
    public int distinctWays(int n){
        if(n == 1) return 1;
        if(n == 0) return 1;
        int left = distinctWays(n - 1);
        int right = distinctWays(n - 2);
        return left + right;
    }
}
