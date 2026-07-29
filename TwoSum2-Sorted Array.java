class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr=new int[2];
        int left=0;
        int right=numbers.length-1;
        while(left<right) {
            int current=numbers[left]+numbers[right];
            if(current==target&&left!=right) {
                arr[0]=left+1;
                arr[1]=right+1;
                break;
            }
            else if(current>target) {
                right--;
            }
            else {
                left++;
            }
        }
        return arr;
    }
}
