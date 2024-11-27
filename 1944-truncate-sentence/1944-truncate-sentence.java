class Solution {
    public String truncateSentence(String s, int k) {
        // String ans="";
        // int count=0;
        // // s.charAt(0)==' '?count:count+1;
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)==' '){
        //         count++;
        //     }
        //     if(count>=k){
        //         break;
        //     }      
        //     ans+=s.charAt(i);
            
            // (s.charAt(i)!='' && s.charAt(i+1)!=''){
            //     count++;
            // }
        // }
        // return ans;
         int wordCount = 0;
        StringBuilder SB = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                wordCount++;
                if(wordCount == k) {
                    return s.substring(0,i);
                }
            }
        }
        return s;
    }
}