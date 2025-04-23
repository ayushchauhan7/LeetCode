//https://leetcode.com/problems/concatenation-of-array/

public class Concatenation_of_Array_1929 {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len * 2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans [i + nums.length] = nums[i];
        }
        return ans;
    }
}