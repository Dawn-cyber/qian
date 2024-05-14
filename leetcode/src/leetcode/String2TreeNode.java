package src.java.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class String2TreeNode {
    public TreeNode createTreeNode(String s){
        //{1,#,1,#,#,#,1,#,1}
        String[] strings = s.split(",");
        return createTreeNode(strings);
    }
    public TreeNode createTreeNode(String[] s){
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = constructOne(s[0]);
        queue.add(root);
        int index = 1;
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(null==node){
                continue;
            }
            if (s.length==index){
                break;
            }
            TreeNode left = constructOne(s[index]);
            node.left = left;
            queue.add(left);
            index++;
            if (index==s.length){
                break;
            }
            TreeNode right = constructOne(s[index]);
            index++;
            node.right = right;
            queue.add(right);
        }
        return root;
    }

    public void printNode(TreeNode root,int indent){
        StringBuffer sb = new StringBuffer();
        for (int i=0;i<indent;i++){
            sb.append("\t");
        }
        sb.append(root.val);
        System.out.println(sb.toString());
    }

    public void  printTreeNode(TreeNode root,int indent){
        if(null==root){
            return;
        }
        printTreeNode(root.right,indent+1);
        printNode(root,indent);
        printTreeNode(root.left,indent+1);
    }

    public void printTreeNode(TreeNode root){
        printTreeNode(root,0);
    }

    private TreeNode constructOne(String s){
        if("null".equals(s)){
            return null;
        }else {
            return new TreeNode(Integer.parseInt(s));
        }
    }



}
