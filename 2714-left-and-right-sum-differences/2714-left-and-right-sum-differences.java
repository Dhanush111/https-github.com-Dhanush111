class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] prefix=new int[nums.length];
        int[] suffix=new int[nums.length];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            suffix[i]=suffix[i+1]+nums[i+1];
        }
        int[] sol=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sol[i]=Math.abs(prefix[i]-suffix[i]);
        }
        // System.gc();
        return sol;
    }
}