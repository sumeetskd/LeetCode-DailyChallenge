import java.util.*;

// 24. Swap Nodes in Pairs


//   Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        if(head!=null && head.next!=null){
           
        }

        ListNode temp = head.next;
        head.next =  swapPairs(head.next.next);
        temp = head;
        return temp;
    }
   
}
public class SwapNode{
    public static void main(String args[]){
        ListNode head = new ListNode(1, null);
        for(int i = 1; i<=4; i++){
            ListNode t = new ListNode(i, null);
            head.next = t;
            head = head.next;
        }
        ListNode t = head;
        while(t!=null){
            System.out.println(t.val);
            t = t.next;
        }
    }
}
