class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int[] ans= new int[2];
        int index=0;
        for(int num:map.keySet()){
            if(map.get(num)==1){
                ans[index]=num;
                index++;
            }
        }
        return ans;
    }
}