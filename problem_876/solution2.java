package problem_876;

public class solution2 {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        //Slow go 1 step, fast go 2 steps'
        
        while(slow != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
