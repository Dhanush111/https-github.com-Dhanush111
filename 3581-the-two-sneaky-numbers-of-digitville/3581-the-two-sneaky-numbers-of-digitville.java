import java.util.Map.Entry;

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ar=new int[2];
        int i=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:nums){
            map.put(a,(map.getOrDefault(a,0))+1);
        }
        Set<Entry<Integer,Integer>> s=map.entrySet();
        for(Entry<Integer,Integer> e:s){
            if( e.getValue()>=2){
                ar[i++]=e.getKey();
            }
        }
        return ar;
    }
}