class java_rough {
     /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean hasCycle(SinglyLinkedListNode head) {

        SinglyLinkedListNode slowPointer, fastPointer;
        slowPointer = head;
        fastPointer = head.next.next;
        while(slowPointer != fastPointer) {
            
        }
    }
}