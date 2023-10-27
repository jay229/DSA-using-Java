class Solution {
    public int majorityElement(int[] nums) {

        //  Boyer-Moore Algorithm
        int n=nums.length;
        int count=1;
        int major=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]==major){
                count++;

            }
            else if(count==0){
                major=nums[i];
                count=1;
            }
            else{
                count--;
            }
        }
        return major;
    }
}