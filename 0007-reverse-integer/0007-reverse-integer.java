class Solution {
    public int reverse(int n) {
        long num=0;
        while(Math.abs(n)>0){
            long rem=n%10;
            num=rem+num*10;
            n=n/10;
        }
            if(num>Integer.MAX_VALUE || num<Integer.MIN_VALUE){
            return 0;
            }
        return (int)num;
    }
}