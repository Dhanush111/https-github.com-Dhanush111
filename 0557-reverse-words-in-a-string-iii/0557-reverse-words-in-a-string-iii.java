class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            StringBuilder sb2=new StringBuilder(arr[i]);
            if(i==arr.length-1){
                sb.append(sb2.reverse());
            }else{
                sb.append(sb2.reverse()+" ");
            }
        }
        return sb.toString();
    }
}