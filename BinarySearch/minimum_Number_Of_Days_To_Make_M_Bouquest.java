package BinarySearch;
public class minimum_Number_Of_Days_To_Make_M_Bouquest {
    public int minDays(int[] bloomDay, int m, int k) {
        if( bloomDay.length < m*k ) return -1 ;
        int left = 1;
        int right = getMax( bloomDay );
        while(left < right ){
            int mid = ( left + right )/2;
            if( isValid( bloomDay, mid, m,  k ) ){
                right = mid ;
            }else{
                left = mid + 1;
            }
        }
        if( isValid( bloomDay, left, m,  k ) )
            return left ;
        return -1;
    }

    public boolean isValid(int[] nums,int day, int m, int k ){
        int bouq = 0 ;
        int curSize = 0;
        for(int i =0; i< nums.length; i++ ){
            if(nums[i] <= day ){
                curSize++;
                if( curSize == k ){
                    bouq++;
                    curSize = 0;
                }
            }else{
                curSize = 0;
            }
        }
        return bouq >= m ;
    }


    public int getMax(int[] nums ){
        int max = 0;
        for(int i=0; i<nums.length; i++ ){
            max = Math.max( max, nums[i] );
        }
        return max;
    }
}