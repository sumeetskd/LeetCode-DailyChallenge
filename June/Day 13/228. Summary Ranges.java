class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            int k = nums[i];
            while(i+1<nums.length && nums[i]+1 == nums[i+1]){
                i++;
            }
            if(k!=nums[i]){
                res.add(k+"->"+nums[i]);
            }else{
                res.add(String.valueOf(k));
            }
        }
        return res;
    }
}