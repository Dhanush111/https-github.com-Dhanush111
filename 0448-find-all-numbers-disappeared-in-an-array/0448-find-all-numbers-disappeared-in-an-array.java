class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> hs=new HashSet<>();
        for(int a:nums){
            hs.add(a);
        }
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!hs.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}