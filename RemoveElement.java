//O(n^2) optimization using logics
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

// O(n) optimization using two pointers pattern
class Solution {
    public int removeElement(int[] nums, int val) {
      int k=nums.length-1;
      for(int i=0;i<=k;i++) {
        if(nums[i]==val) {
            int temp=nums[i];
            nums[i]=nums[k];
            nums[k]=temp;
            k--;
            i--;
        }
      }
      return k+1;
    }
}
