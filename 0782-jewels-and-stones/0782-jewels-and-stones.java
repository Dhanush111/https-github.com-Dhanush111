class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> hs1=new HashSet<>();
        for(char c:jewels.toCharArray()){
            hs1.add(c);
        }
        int count=0;
        for(char a:stones.toCharArray()){
            if(hs1.contains(a)){
                count++;
            }
        }
        return count;
    }
}