class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            list.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(list.contains(nums2[i]) && !list2.contains(nums2[i])){
                list2.add(nums2[i]);
            }
        }
        int[] arr=new int[list2.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=list2.get(i);
        }
        return arr;
    }
}