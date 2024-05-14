package src.java.leetcode;

import java.util.ArrayList;

public class Leetcode129 {
    ArrayList<String> list = new ArrayList();

    public int sumNumbers(TreeNode root) {
        StringBuffer stringBuffer = new StringBuffer();
        numbers(root,stringBuffer);
        int ans = 0;
        for(String temp:list){


        }
        return ans;
    }

    public void numbers(TreeNode root,StringBuffer stringBuffer){
        if(root==null){
            list.add(stringBuffer.toString());
            return;
        }
        stringBuffer.append(root.val);
        numbers(root.right,stringBuffer);
        numbers(root.left,stringBuffer);
    }
}
