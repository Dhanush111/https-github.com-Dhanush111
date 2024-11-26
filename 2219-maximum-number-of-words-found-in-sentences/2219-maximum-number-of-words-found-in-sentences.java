class Solution {
    public int mostWordsFound(String[] sentences) {
        int length=0;
        for(int i=0;i<sentences.length;i++){
            String[] arr=sentences[i].split("\\ "); 
            if(length < arr.length){
                length= arr.length;
            }
        }
        return length;
    }
}