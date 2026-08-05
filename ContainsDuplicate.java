class Solution {
    public boolean containsDuplicate(int[] nums) {
       for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
          if (nums[i] == nums[j]) {
            return true;
             }
        }
       }
    return false;
    }
}

// using Array sort and find adjecent duplicate value
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }
}

// Using Hashset to get O(n) optimization
import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
