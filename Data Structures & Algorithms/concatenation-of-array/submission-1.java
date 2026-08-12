class Solution {
    public int[] getConcatenation(int[] nums) {
        // int ans[]=new int[2*nums.length];
        // for(int i=0;i<nums.length;i++)
        // {
        //     ans[i]=nums[i];
        // }
        // int index=nums.length;
        //     for(int i=0;i<nums.length;i++)
        //     {
        //         ans[index]=nums[i];
        //         index++;
        //     }
        //     return ans;

         int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }
}