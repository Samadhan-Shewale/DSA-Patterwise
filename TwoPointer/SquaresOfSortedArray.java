package TwoPointer;

class SquaresOfSortedArray {
    public int LowestPositive(int[] nums){
        int left = 0; 
        int right = nums.length-1;
        while(left < right ){
            int mid = left + ( right - left)/2;
            if( nums[mid] == 0 ) return mid;
            if( nums[mid] < 0 ){
                left = mid + 1;
            }else{
                right = mid ;
            }
        }
        return left ;
    }
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int lowPt = LowestPositive( nums );
        int left = lowPt-1;
        int right = lowPt;
        if( nums[lowPt] < 0 ) {
            left = lowPt ;
            right =  nums.length ;
        }
        
        // ans[0] = lowPt ;
        for( int i = 0 ; i < nums.length; i++ ){
            if( (right >= nums.length) || ( left>= 0 && Math.abs( nums[left]) < nums[right] )){
                ans[i] = nums[left] * nums[left] ;
                left--;
            }else{
                ans[i] = nums[right] * nums[right] ;
                right++;
            }
        }
        return ans;

    }
}
