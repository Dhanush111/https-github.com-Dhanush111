class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] answer=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int temp=0;
            for(int j=0;j<nums.length;j++){   
                if(nums[i]>nums[j]){
                    temp++;          
                }      
            }
            answer[i]=temp;
        }
        return answer;
    }
}