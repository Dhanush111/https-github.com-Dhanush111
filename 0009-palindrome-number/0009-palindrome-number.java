class Solution {
    public boolean isPalindrome(int x) {
        int y=x;
        int z=0;
        while(x>0){
            z=z*10+x%10;
            x=x/10;
        }
        if(y==z){
            return true;
        }
        return false;
    }
}