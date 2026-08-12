class Solution {
    public boolean hasDuplicate(int[] nums) {
        int temp=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(i<nums.length-1 && nums[i]==nums[i+1])
            {
                temp=1;
                break;
            }
            else{
                temp=0;
            }
        }

        if(temp==1)
    {
        return true;
    }
    else{
        return false;
    }
    }
    
}