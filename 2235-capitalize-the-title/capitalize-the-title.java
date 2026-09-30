class Solution {
    public String capitalizeTitle(String title) {
        String result="";
        title=title.toLowerCase();
        int len=0;
        for(int i=0;i<title.length();i++){
            char ch=title.charAt(i);
            if(ch==' '){
                result=result+ch;
                len=0;
            }
            else{
                len++;
                if(len==1 && i+2<title.length() && title.charAt(i+1)!=' ' && title.charAt(i+2)!=' '){
                    result=result+(char)(ch-32);
                }
                else result=result+ch;
            }
        }
        return result;
    }
}