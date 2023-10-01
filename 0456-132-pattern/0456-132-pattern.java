class Solution {
    public boolean find132pattern(int[] nums) {
        int n=nums.length;
        int num3=Integer.MIN_VALUE;
        Stack<Integer>stk=new Stack<>();
        for(int i=n-1;i>=0;i--){
            if(nums[i]<num3){
                return true;
            }
            while(!stk.isEmpty() && stk.peek()<nums[i]){
                num3=stk.peek();
                stk.pop();
            }
            stk.push(nums[i]);
        }
        return false;

    }
}