#EASY LEVEL

## 3)Contains Duplicate
 i) Approach -1 
class Solution {
    public boolean containsDuplicate(int[] nums) {
 Set<Integer> numSet = new HashSet<>();
        
        for (int num : nums) {
            if (numSet.contains(num)) {
                return true;
            }
            numSet.add(num);
        }
        
        return false;
		 }
}

ii) Approach-2 
class Solution {
    public boolean containsDuplicate(int[] nums) {
 Arrays.sort(nums);
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        
        return false;
    }
}
