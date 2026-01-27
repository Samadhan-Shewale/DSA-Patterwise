package TwoPointer;

public class ReverseString {
    public void reverseString(char[] s) {
        
        for(int i=0 , j = s.length-1 ; i<=j ; i++,j--){
            // swap
            char ch = s[i];
            s[i] = s[j];
            s[j] = ch;
        }
    }
}
