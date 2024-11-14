class Solution {
    public int largestAltitude(int[] gain) {
        int ans=0;
        int sol=0;
        for(int i=0;i<gain.length;i++){
          ans=ans+gain[i];
          if(sol<ans){
              sol=ans;
          }
        }
        return sol;
    }
}