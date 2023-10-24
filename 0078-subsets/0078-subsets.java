class Solution {
   
   public void solve(int arr[],int i,List<Integer>subset,List<List<Integer>>ans){
       if(i>=arr.length){
           ans.add(new ArrayList<>(subset));
           return;
       }
    //    Take
        subset.add(arr[i]);
        solve(arr,i+1,subset,ans);

        // Not take
        subset.remove(subset.size()-1);
        solve(arr,i+1,subset,ans);

   }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>subset=new ArrayList<>();
        solve(nums,0,subset,ans);
        return ans;
    }
}