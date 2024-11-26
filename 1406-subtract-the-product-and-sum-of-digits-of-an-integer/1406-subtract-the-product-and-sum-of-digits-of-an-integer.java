class Solution {
    public int subtractProductAndSum(int n) {
        int mul=1;
        int sum=0;
        while(n>0){
            int temp=n%10;
            sum+=temp;
            mul*=temp;
            n/=10;
        }
        return mul-sum;
    }
}