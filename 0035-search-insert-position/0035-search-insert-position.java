class Solution {
    public int searchInsert(int[] nums, int target) {
        int indexLocation = 0;
        for(int i = 0; i< nums.length ; i++){
            if(i == nums.length - 1 && nums[i] < target){
                indexLocation = nums.length;
                break;
            } 
            if(nums[i] == target){
                indexLocation = i;
                break;
            }
            if(nums[i] > target){
                indexLocation = i;
                break;
            }
        }
        return indexLocation;
    }
}