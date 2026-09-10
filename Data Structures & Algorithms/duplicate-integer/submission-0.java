class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashSet<Integer> numL = new HashSet<>();
        int n = nums.length;
        for(int i = 0;i < n;i++){
            if(numL.contains(nums[i])) return true;
            numL.add(nums[i]);
        }

        return false;
    }
}