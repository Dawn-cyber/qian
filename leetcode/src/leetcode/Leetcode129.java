package leetcode;


import java.util.ArrayList;

public class Leetcode129 {
    ArrayList<String> list = new ArrayList();

    public int sumNumbers(TreeNode root) {
        StringBuffer stringBuffer = new StringBuffer();
        numbers(root,stringBuffer);
        int ans = 0;
        for(String temp:list){
            ans += Integer.parseInt(temp);
        }
        return ans;
    }

    public void numbers(TreeNode root,StringBuffer stringBuffer){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            stringBuffer.append(root.val);
            list.add(stringBuffer.toString());
            stringBuffer.deleteCharAt(stringBuffer.length()-1);
            return;
        }
        stringBuffer.append(root.val);
        numbers(root.right,stringBuffer);
        numbers(root.left,stringBuffer);
        stringBuffer.deleteCharAt(stringBuffer.length()-1);
    }
}
