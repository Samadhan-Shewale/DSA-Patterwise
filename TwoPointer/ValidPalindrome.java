package TwoPointer;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        int left = 0;
        int right = str.length()-1;
        while( left <= right ){
            if( str.charAt(left)==(str.charAt(right)) ){
                left++; 
                right --;
            }else{
                return false;
            }
        }
        return true;
    }
}
