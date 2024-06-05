package leetcode;

import java.util.Queue;
import java.util.Stack;

public class Leetcode148 {
    public boolean validateBookSequences(int[] putIn, int[] takeOut) {
        Stack<Integer> stack = new Stack();
        int j=0;
        for(int i:putIn){
            stack.add(i);
            while(!stack.isEmpty()&&stack.peek()==takeOut[j]){
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty()?true:false;

    }
}
