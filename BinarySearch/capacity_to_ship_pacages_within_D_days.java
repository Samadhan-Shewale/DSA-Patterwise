package BinarySearch;
class capacity_to_ship_pacages_within_D_days {
    public int shipWithinDays(int[] weights, int days) {
        int left = 1;
        int right = 0;
        for(int i = 0; i< weights.length; i++ ){
            right = right + weights[i];
        }

        while( left < right ){
            int capacity = left + ( right - left )/2;
            if( isValid( weights,capacity, days ) ){
                right = capacity;
            }else{
                left = capacity + 1;
            }
        }
        return left;
    }

    public boolean isValid(int[] nums, int cap, int days ){
        int curDays = 0;
        int curCap = 0;
        for(int i=0; i<nums.length ; i++ ){
            curCap = curCap + nums[i];
            if(nums[i] > cap ) return false ;
            if(curCap >= cap ){
                curDays++;
                if( curCap != cap ){
                    curCap = nums[i];
                }else{
                    curCap = 0;
                }
            }
        }
        if( curCap != 0 ) curDays++ ;
        return curDays <= days ;
    }
}