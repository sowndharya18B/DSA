class Solution {
    public String longestPrefix(String s) {
       int []ans = new int[s.length()];
        for(int i=1;i<ans.length;i++){
            int j=ans[i-1];
            while(j>0 && s.charAt(i)!=s.charAt(j)){
                j=ans[j-1];
            }
            if(s.charAt(i)==s.charAt(j)) j++;
            ans[i]=j;
        }
        return s.substring(0,ans[s.length()-1]); 
    }
}