class Solution {
    public int findPermutationDifference(String s, String t) {
        int ans=0;
        for(int i=0;i<s.length();i++){
          for(int j=0;j<t.length();j++){
            if(t.charAt(j)==s.charAt(i)){
                ans+=Math.abs(i-j);
            }
          }       
        }
        return ans;
        // int answer = 0;
        // for (int i = 0; i < s.length(); i++) {
        //     char ch = s.charAt(i);
        //     int index = t.indexOf(ch);
        //     answer += Math.abs(index - i);
        // }
        // return answer;

    }
}