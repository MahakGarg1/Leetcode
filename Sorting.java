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


#MEDIUM LEVEL
	
1) 3SUM
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

if (nums == null || nums.length < 3)
{
return new ArrayList<>(); }
Arrays.sort(nums);
 Set<List<Integer>> res = new HashSet<>();
for(int i =0; i<nums.length-2 ; i++)
{  int l = i+1;
   int r =  nums.length -1;
  while(l < r){
 int sum = nums[i] + nums[l] + nums[r];
if (sum == 0){
res.add(Arrays.asList(nums[i], nums[l], nums[r]));
l ++;
r--;
} else if(sum<0)
{ l++ ;}
else { r--; }			
 }
 }
return new ArrayList<>(res);
}
}	


2) 3 SUM CLOSET
	
class Solution {
 public int threeSumClosest(int[] nums, int target) {

Arrays.sort(nums);
 int res = nums[0] + nums[1]+ nums[2];
 int mindif = Integer.MAX_VALUE;
 
for(int i =0; i<nums.length-2 ; i++)
{  int l = i+1;
   int r =  nums.length -1;
  while(l < r){
 int sum = nums[i] + nums[l] + nums[r];
if (sum == target){
return target;
} else if(sum<target)
{ l++ ;}
else { r--; }		
int diftarget = Math.abs(sum-target);
if(diftarget< mindif){
res= sum;
mindif = diftarget;
 }
 }
}
return res;	  
}
}


# HARD LEVEL
1) Contains Duplicate III
	class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
	    int n = nums.length;
for(int i = 0; i<n; i++){
for(int j = i+1; j<n; j++){
if(Math.abs(1L * num[i]-nums[j]) <= valueDiff  && j-i <= indexDiff ){
return true;
}
}
}
reture false;
}
}
	    

	
