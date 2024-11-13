class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0,j=0;
        String newstring="";
        while(i<word1.length() && j<word2.length()){
            newstring=newstring+word1.charAt(i);
            i++;
            newstring=newstring+word2.charAt(j);
            j++;
        }
        while(i<word1.length()){
            newstring=newstring+word1.charAt(i);
            i++;
        }
        while(j<word2.length()){
            newstring =newstring+word2.charAt(j);
            j++;
        }
        return newstring;

    }
}