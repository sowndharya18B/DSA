class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word=s.split(" ");
        HashMap<Character,String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        if(word.length!=pattern.length()){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String a=word[i];
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(a)){
                    return false;
                }
            }
            else{
                if(set.contains(a)){
                    return false;
                }
            map.put(ch,a);  //(a,dog)
            set.add(a);
            }
        }
        return true;
    }
}