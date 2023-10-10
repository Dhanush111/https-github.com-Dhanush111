class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++){
        //     boolean sortt=false;
        //     for(int j=1;j<nums.length-i;j++){
        //         if(nums[j]<nums[j-1]){
        //             int temp=nums[j];
        //             nums[j]=nums[j-1];
        //             nums[j-1]=temp;
        //             sortt=true;
        //         }

        //     }
        // }
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }return false;
    }
}