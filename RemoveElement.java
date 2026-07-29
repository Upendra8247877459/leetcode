class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0,temp;
        int len=nums.length;
        for(int i=0;i<len;i++) {
            if(nums[i]==val) {
                temp=nums[i];
                for(int j=i+1;j<len;j++) {
                    nums[j-1]=nums[j];
                }
                nums[len-1]=temp;
                i--;
                len--;              
            }
        }
        for(int i=0;i<len;i++) {
            if(nums[i]!=val) 
             count=count+1;
        }
        return count;
    }
}
