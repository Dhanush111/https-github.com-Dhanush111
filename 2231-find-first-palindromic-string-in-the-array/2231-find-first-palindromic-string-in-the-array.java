class Solution {
    public String firstPalindrome(String[] words) {	
        String r="";
		for(int j=0;j<words.length;j++) {
		String result="";
		char[] ch=words[j].toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			result+=ch[i];
		}
		if(result.equals(words[j])) {
			r=words[j];
			break;}
		}
		return r;
    }
}