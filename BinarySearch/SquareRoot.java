package BinarySearch;
class SquareRoot {
    int floorSqrt(int n) {
        // code here
        int left = 1;
        int right = n/2;
        while( left < right ){
            int mid = ( left + right )/2;
            if( isValid(n, mid )){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return left*left > n ? left-1 : left;
    }
    
    boolean isValid(int n, int checkNumber ){
        return ( checkNumber*checkNumber ) <= n;
    }
}