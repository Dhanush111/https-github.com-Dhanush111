class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList<>();
        int max=0;
        for(int a:candies){
            max=Math.max(a,max);
        }
        for(int i:candies){
            boolean ans=(i+extraCandies>=max)?true:false;
            list.add(ans);
            // if(i+extraCandies>=max){
            //     list.add(true);
            // }
            // else{
            //     list.add(false);
            // }
        }
        return list;
    }
}