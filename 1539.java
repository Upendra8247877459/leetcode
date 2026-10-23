// Using Binary Search
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int low=0;
        int high=n-1;
        int miss=0;
        while(low<=high)  {
            int mid=(low+high)/2;
            miss=arr[mid]-(mid+1);
            if(miss<k) low=mid+1;
            else high=mid-1;
        }
        return arr[high]+(k-miss);
    }
}
// brute force solution
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int i=0;
        while(i<n) {
            if(arr[i]<=k) k++;
            i++;
        }
        return k;
    }
}
