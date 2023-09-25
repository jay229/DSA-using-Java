class Solution {
    public char findTheDifference(String s, String t) {
        
        char charArr1[]= s.toCharArray();
        char charArr2[]= t.toCharArray();

        int i=0;
        int j=0;
        int m=charArr1.length;
        int n=charArr2.length;

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        while(i<m && j<n){
            if(charArr1[i]==charArr2[j]){
                i++;
                j++;
            }
            else{
                return charArr2[j];
            }
        }
        return charArr2[j];
    }
}