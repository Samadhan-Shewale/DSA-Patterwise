package TwoPointer;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        
        int low = 0;
        for(int high=1; high<nums.length; high++ ){
            if(nums[low] != nums[high] ){
                low++;
                nums[low] = nums[high];
            }
        }
        return low+1;
    }
}
