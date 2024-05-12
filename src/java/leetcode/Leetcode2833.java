package src.java.leetcode;

public class Leetcode2833 {
    public static void main(String[] args) {
        String moves = "_______";
        int len = moves.length();
        int countL=0,countR=0,count =0;
        for (int i = 0; i < len; i++) {
            //System.out.println(moves.charAt(i));
            if('L'==(moves.charAt(i))){
                countL++;
            }
            if('R'==(moves.charAt(i))){
                countR++;
            }
        }
        System.out.println(countL>countR?len-2*countR:len-2*countL);
    }
}
