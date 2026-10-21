class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head; // 1. Link dummy to head
        
        ListNode slow = dummy; // 2. Start slow at dummy
        ListNode fast = dummy; // 3. Start fast at dummy
        
        // Advance fast so there is an n-node gap between slow and fast
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        
        // Move both until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        // Remove the nth node from the end
        slow.next = slow.next.next;
        
        return dummy.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna