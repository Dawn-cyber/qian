package leetcode;

public class Leetcode125 {
    public boolean isPalindrome(String s) {
        int len = s.length();
        s = s.toLowerCase();
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=0;i<len;i++){
            if(Character.isLetterOrDigit(s.charAt(i))) {
                stringBuffer.append(s.charAt(i));
            }
        }
        len = stringBuffer.length();
        for(int i=0,j=len-1;i<len/2;i++,j--){
            if(stringBuffer.charAt(i)!=stringBuffer.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
