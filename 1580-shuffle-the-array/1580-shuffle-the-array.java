class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] shufarr=new int[nums.length];
        int j=0;
        for(int i=0;i<n;i++){
            shufarr[j]=nums[i];
            shufarr[j+1]=nums[i+n];
            j=j+2;
        }
        return shufarr;
    }
}