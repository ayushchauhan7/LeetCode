class Solution {
    public int searchInsert(int[] nums, int target) {
        int insertIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                insertIndex = i;
                break;
            } else if (nums[i] < target) {
                insertIndex = i + 1;
            }
        }
        return insertIndex;

    }
}