class Solution {
    public int[] replaceElements(int[] arr) {
        int last=-1;
        for(int i=arr.length-1;i>=0;i--){
            int newmax=Math.max(arr[i],last);
            arr[i]=last;
            last=newmax;
        }
        return arr;
    }
}