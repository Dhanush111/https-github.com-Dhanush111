class Solution {
    public int maxSubArray(int[] nums) {
       int sum=0;
       int maxsum=Integer.MIN_VALUE;
       for(int i:nums){
           sum+=i;
           if(sum>maxsum){
               maxsum=sum;
           }
           if(sum<0){
               sum=0;
           }
       }
       return maxsum;
    }
}