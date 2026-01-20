package BinarySearch;
class Painters_Partition_Problem_2 {
    public int minTime(int[] arr, int k) {
        // code here
        int left =  1;
        int right = 0 ;
        for(int i = 0; i<arr.length; i++ ){
            right = right + arr[i];
        }
        
        while( left < right ){
            int time = left + (right - left )/2;
            if( isValid(arr, time, k ) ){
                right = time;
            }else{
                left = time + 1;
            }
        }
        return left ;
    }
    
    public boolean isValid(int[] arr, int paintCap, int k ){
        int painter = 0;
        int paintedBoard = 0;
        for( int i = 0; i< arr.length; i++ ){
            if( arr[i] > paintCap ) return false;
            paintedBoard = paintedBoard + arr[i];
            if( paintedBoard >= paintCap ){
                painter++;
                if( paintedBoard != paintCap ){
                    paintedBoard = arr[i];
                }else{
                    paintedBoard = 0 ;
                }
            }
        }
        
        if( paintedBoard != 0 ) painter++;
        return painter <= k ;
    }
}
