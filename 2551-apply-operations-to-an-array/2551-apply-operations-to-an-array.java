class Solution {
    public int[] applyOperations(int[] nums) {
        for(int k=0;k<nums.length-1;k++){
            if(nums[k]==nums[k+1]){
                nums[k]=nums[k]*2;
                nums[k+1]=0;
            }
        }
        int i=0;
        for(int num:nums){
            if(num!=0){
                nums[i]=num;
                i++;
            }
        }
        while(i<nums.length){
            nums[i]=0;
            i++;
        }
        return nums;
    }
}