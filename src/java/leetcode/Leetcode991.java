package src.java.leetcode;

public class Leetcode991 {
    public static void main(String[] args) {
        int startValue = 2,target = 3;
        int answer = 0;
        while (target>startValue){
            answer++;
            if(target%2==0){
                target /=2;
            }else {
                target++;
            }
        }
        System.out.println(answer+startValue-target);
    }


}
