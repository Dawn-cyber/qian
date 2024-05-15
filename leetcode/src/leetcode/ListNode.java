package leetcode;

public class ListNode {
    public ListNode next;
    public int val;
    public ListNode(){

    }
    public ListNode(int val){
        this.val = val;
    }
    public ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }

    //创建单链表
     public ListNode makeNode(int[] nums) {
        if (nums.length == 0) return null;
        ListNode listNode = new ListNode(nums[0]);
        ListNode head = listNode;
        for (int i = 1; i < nums.length; i++) {
            ListNode node = new ListNode(nums[i]);
            listNode.next = node;
            listNode = node;
        }
        return head;
    }
    //创建循环链表
     public static ListNode makeNode(int[] nums, int pos) {
        if (nums.length == 0) return null;
        ListNode[] listNodes = new ListNode[nums.length];
        for (int i = 0; i < nums.length; i++) {
            listNodes[i] = new ListNode(nums[i]);
        }
        ListNode listNode = listNodes[0];
        for (int i = 1; i < listNodes.length; i++) {
            listNode.next = listNodes[i];
            listNode = listNodes[i];
        }
        if (pos >= 0 && pos < nums.length) {
            listNode.next = listNodes[pos];
        }
        return listNodes[0];
    }

}
