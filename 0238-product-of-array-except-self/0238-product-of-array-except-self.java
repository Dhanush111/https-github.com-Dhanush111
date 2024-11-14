class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix=new int[nums.length];
        prefix[0]=1;
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]*nums[i-1];
        }
      //  return prefix;
        int[] suffix=new int[nums.length];
        suffix[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            suffix[i]=suffix[i+1]*nums[i+1];
        }
        // return suffix;

        for(int a=0;a<nums.length;a++){
            nums[a]=prefix[a]*suffix[a];
        }
        return nums;
    }
}