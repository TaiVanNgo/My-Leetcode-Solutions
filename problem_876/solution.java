package problem_876;

public class solution {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

     public ListNode middleNode(ListNode head) {
        int count = 0;// Count the length of the node
        ListNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int mid = count / 2;    

        temp = head;
        count = 0;
        ListNode middleList = new ListNode();
        while (temp != null) {
            if(count == mid){
                middleList.val = temp.val;
                middleList.next = temp.next;
            }
            temp = temp.next;
            count ++;
        }

        return middleList;
    }

    public static void main(String[] args) {
        System.out.println(5/2);
    }

}
