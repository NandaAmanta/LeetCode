class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 ) return false;
        
        int reversed = 0;
        int remainder;
        int original = x;
        while(x != 0){
            remainder = x % 10;
            reversed = reversed * 10 + remainder;
            x = x/10;
        }
        
        return reversed == original;
    }
}