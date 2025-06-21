package leetcode;

public class Palindrome {
	
	    public boolean isPalindrome(int x) {
	        if(x<0){
	            return false;
	        }
	        int n =x;
	        int revno=0;

	        while(n>0){
	            int digit = n%10;
	            revno= revno*10+digit;
	            n=n/10;
	        }

	        if(revno==x){
	            return true;

	        }
	        else{
	            return false;
	        }
	    }
	}

