/*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        
        SinglyLinkedListNode pre=null;
        SinglyLinkedListNode current=head;
        SinglyLinkedListNode next=null;
        while(current.next!=null){
            next=current.next;
            current.next=pre;
            pre=current;
            current=next;
            
        }
        current.next=pre;
        return current;
    }
