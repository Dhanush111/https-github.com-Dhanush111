class Solution {
    public String reversePrefix(String word, char ch) {
    StringBuilder ans=new StringBuilder();
    boolean found=false;
    for(int i=0;i<word.length();i++){  
        if(found){
            ans.insert(ans.length(),word.charAt(i));
        }
        else{
            ans.insert(0,word.charAt(i));
        }
        if(word.charAt(i)==ch){
            found=true;
        }
    }
    if(!found){
        ans=new StringBuilder(word);
    }
    return ans.toString();
    }
}