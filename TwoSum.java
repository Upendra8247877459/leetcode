class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        int k=0;
        while(k<nums.length-1) {
            int temp=nums[k];  
            for(int i=0;i<nums.length;i++) {
                if(temp+nums[i]==target && i!=k) {
                    arr[0]=i;
                    arr[1]=k;
                }
            }
            k=k+1;
        }
        return arr;
    }
}
