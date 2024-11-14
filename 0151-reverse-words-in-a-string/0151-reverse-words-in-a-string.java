class Solution {
    public String reverseWords(String s) {
        String tans=s.trim();
        String[] arr=tans.split(" +");//" +"means all spaces between those words
        String ans="";
        for(int i=arr.length-1;i>0;i--){
            ans=ans+arr[i]+" ";
        }
        ans=ans+arr[0];
        return ans;
    //     String tans=trim(s);
    //     String[] arr=tans.split(" ");
    //     String ans="";
    //     for(int i=arr.length-1;i>0;i--){
    //         ans=ans+arr[i]+" ";
    //     }
    //     ans=ans+arr[0];
    //     return ans;
    // }
    // public String trim(String s){
    //     String a=s.trim();
    //     String b="";
    //     for(int i=0;i<a.length()-1;i++){
    //         if(a.charAt(i)!=' ' || a.charAt(i)==' ' && a.charAt(i+1)!=' ' ){
    //            b=b+a.charAt(i);
    //         }
            
    //     }
    //     b=b+a.charAt(a.length()-1);
    //     return b;
    }
}