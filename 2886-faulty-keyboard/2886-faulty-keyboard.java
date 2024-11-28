class Solution {
    public String finalString(String s) {
       StringBuilder sb=new StringBuilder();
       boolean found=false;
       for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='i'){
                found=!found;
            }            
            if(found==true && s.charAt(i)!='i'){
                sb.insert(sb.length(),s.charAt(i));
            }
            else if(s.charAt(i)!='i'){
                sb.insert(0,s.charAt(i));
            }
       } 
       return found ? sb.toString():sb.reverse().toString();
    }
}