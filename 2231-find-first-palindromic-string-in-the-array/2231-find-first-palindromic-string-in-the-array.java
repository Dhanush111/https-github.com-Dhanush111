class Solution {
    public String firstPalindrome(String[] words) {
        String[] w2=new String[words.length];
        String[] words2= new String[words.length];
		String result="";
		for(int j=0;j<words.length;j++) {
		words2[j]="";
		char[] ch=words[j].toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			words2[j]+=ch[i];
		}
		if(words[j].equals(words2[j])) {
			result=words[j];
			break;}
		}
		return result;
    }
}