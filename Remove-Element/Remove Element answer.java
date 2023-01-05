class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=0;
        int k=0;
        while(i<nums.length)
        {
            if(nums[i]!=val)
            {
                nums[j]=nums[i];
                j++;
            }
            i++;
        }
         k=j; 
        while(j<nums.length)
        {
            nums[j]=0;
            j++;
        }
        return k;
    }
}