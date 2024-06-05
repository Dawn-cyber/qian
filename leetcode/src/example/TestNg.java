package example;


import leetcode.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestNg {
    @Test
    public void test2437(){
        String s = "0?:0?";
        Leetcode2437 leetcode2437 = new Leetcode2437();
        int i = leetcode2437.countTime(s);
        System.out.println(i);
    }
    @Test
    public void test2385(){
        Leetcode2385 leetcode2385 = new Leetcode2385();
        String s = "1,5,3,null,4,10,6,9,2";
        String2TreeNode string2TreeNode = new String2TreeNode();
        TreeNode treeNode = string2TreeNode.createTreeNode(s);
        int i = leetcode2385.amountOfTime(treeNode,3);
        System.out.println(i);
    }

    @Test
    public void  test129(){
        Leetcode129 leetcode129 = new Leetcode129();
        String s = "1,5,1,null,null,null,6";
        String2TreeNode string2TreeNode = new String2TreeNode();
        TreeNode treeNode = string2TreeNode.createTreeNode(s);
        int ans = leetcode129.sumNumbers(treeNode);
        System.out.println(ans);
    }

    @Test
    public void test89(){
        Leetcode89 leetcode89 = new Leetcode89();
        List<Integer> integers = leetcode89.grayCode(4);
        integers.stream().forEach(integer -> {
            System.out.print(integer+" ");
        });
    }

    @Test
    public void test199(){
        Leetcode199 leetcode199 = new Leetcode199();
        String s = "1,2,3,null,5,null,4";
        String2TreeNode string2TreeNode = new String2TreeNode();
        TreeNode treeNode = string2TreeNode.createTreeNode(s);
        List<Integer> integers = leetcode199.rightSideView(treeNode);
        integers.stream().forEach(e->{
            System.out.print(e+" ");
        });
    }

    @Test
    public void test141(){
        Leetcode141 leetcode141 = new Leetcode141();
        ListNode listNode = new ListNode();
        String s = "3,2,0,-4";
        String[] split = s.split(",");
        int[] nums = Arrays.asList(split).stream().mapToInt(Integer::parseInt).toArray();
        ListNode listNode1 = listNode.makeNode(nums, 2);
        boolean b = leetcode141.hasCycle(listNode1);
        System.out.println(b);
    }

    @Test
    public void testLeetcode171(){
        Leetcode171 leetcode171 = new Leetcode171();
        String s = "AB";
        int i = leetcode171.titleToNumber(s);
        System.out.println(i);
    }

    @Test
    public void testLeetcode125(){
        Leetcode125 leetcode125 = new Leetcode125();
        String s = "0P";
        boolean palindrome = leetcode125.isPalindrome(s);
        System.out.println(palindrome);
    }

    @Test
    public void testLeetcode148(){
        Leetcode148 leetcode148 = new Leetcode148();
        int[] input = new int[]{2,1,0};
        int[] output = new int[]{1,2,0};
        System.out.println(leetcode148.validateBookSequences(input,output));
    }
}
