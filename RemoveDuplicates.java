class Solution {
    public int removeDuplicates(int[] nums) {
        int temp,count=0;
        int len=nums.length;
        for(int i=1;i<len;i++) {
            if(nums[i]==nums[i-1]) {
              temp=nums[i];
            for(int j=i;j<len-1;j++) {
             
                nums[j]=nums[j+1];
            }
            nums[len-1]=temp;
            len--;
            i--;
          }
        }
        for(int i=0;i<len;i++) {
           count++;
        }
        return count;
    }
}

// O(n) optimization using two pointers pattern
class Solution {
    public int removeDuplicates(int[] nums) {
      int i=0,j=1;
      while(j<nums.length) {
        if(nums[i]==nums[j]) {
            j++;
        }
        else {
            i++;
            nums[i]=nums[j];
        }
      }
      return i+1;
    }
}
