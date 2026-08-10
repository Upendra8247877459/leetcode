class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++) {
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}


class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int left=0,right=n-1;
        int writeIndex=n-1;
        int[] arr=new int[int];

        while(left<=right) {
            int leftSq=nums[left]*nums[left];
            int rightSq=nums[right]*nums[right];
            if(leftSq>rightSq]) {
                arr[writeIndex]=leftSq;
                left++;
            }
            else {
                arr[writeIndex]=rightSq;
                right--;
            }
            writeIndex--;
        }
        return arr;
    }
}
