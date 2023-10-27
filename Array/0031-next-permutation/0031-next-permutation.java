class Solution {

     private void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int bp=-1;

        // get the breakpoint
        for(int i=n-1;i>0;i--){
            if(nums[i-1]<nums[i])
            {
                bp=i-1;
                break;
            }
        }
        if(bp!=-1){
           int swap_index=bp;
           for(int i=n-1;i>bp;i--){
               if(nums[i]>nums[swap_index]){
                   swap_index=i;
                   break;
               }
           }
            swap(nums,bp,swap_index);
            reverse(nums,bp+1);
            return;
        }
       reverse(nums,0);


    }
}