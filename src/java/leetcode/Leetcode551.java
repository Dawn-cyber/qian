package src.java.leetcode;

public class Leetcode551 {
    public static void main(String[] args) {
        String s = "PPALLL";
        int absent = 0;
        boolean lflag = true;
        int size = s.length();
        for(int i=0;i<size;i++){
            if('A'==(s.charAt(i))){
                absent++;
            }
            if(i>0&&i<(size-1)){
                StringBuffer sb = new StringBuffer();
                sb.append(s.charAt(i-1));
                sb.append(s.charAt(i));
                sb.append(s.charAt(i+1));
                if("LLL".equals(sb.toString())){
                    lflag = false;
                }
            }
        }
        boolean aflag = absent<2?true:false;
        System.out.println(aflag&&lflag);
    }
}
