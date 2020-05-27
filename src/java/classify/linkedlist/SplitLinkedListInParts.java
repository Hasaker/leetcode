package java.classify.linkedlist;

import java.tools.ListNode;

public class SplitLinkedListInParts {

    /**
     * 0ms 100.00%
     * 35.2MB 99.62%
     */
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] parts = new ListNode[k];
        int len = 0;

        for (ListNode node = root; node != null; node = node.next) {
            len++;
        }

        int n = len / k; // n : minimum guaranteed part size;
        int r = len % k; // r : extra nodes spread to the first r parts;
        ListNode node = root;
        ListNode prev = null;

        for (int i = 0; node != null && i < k; i++, r--) {
            parts[i] = node;

            for (int j = 0; j < n + (r > 0 ? 1 : 0); j++) {
                prev = node;
                node = node.next;
            }

            prev.next = null;
        }

        return parts;
    }
}
