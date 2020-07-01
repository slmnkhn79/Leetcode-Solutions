package leetcode.monthlychallenge.july;

public class Solution {
	public int arrangeCoins(int n) {
        int i;
        if(n==1)
            return 1;
        if(n==0)
            return 0;
       for(i=1;i<=n;i++){
           n=n-i;
           if(n<=i)
               break;
       }
        return i;
    }
}
