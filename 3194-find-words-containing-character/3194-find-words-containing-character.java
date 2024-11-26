class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            Set<Character> set=new HashSet<>();
            for(char c:words[i].toCharArray()){
                set.add(c);
            }
            if(set.contains(x)){
                list.add(i);
            }
        }
        return list;
    }
}