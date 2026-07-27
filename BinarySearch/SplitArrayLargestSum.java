package BinarySearch ;
class SplitArrayLargestSum {
    public int splitArray(int[] nums, int k) {
        int left = 0;
        int right = 0;
        for(int i=0 ; i<nums.length; i++ ){
            right = right + nums[i] ;
        }

        while(left < right ){
            int trySum = left + ( right - left )/2 ;
            if( isValid(nums, trySum, k ) ){
                right = trySum;
            }else{
                left = trySum + 1;
            }
        }
        return left ;
    }

    public boolean isValid( int[] nums,int trySum,int k ){
        int countSA = 0;
        int curSum = 0;
        for(int i=0; i<nums.length; i++ ){
            curSum = curSum + nums[i];
            if(nums[i] > trySum) return false;
            if( curSum >= trySum ){
                countSA++;
                if( curSum != trySum ){
                    curSum = nums[i];
                }else{
                    curSum = 0;
                }
            }
        }
        if(curSum != 0 ) countSA++;

        return countSA <= k ;
    }
}