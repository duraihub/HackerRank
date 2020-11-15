 static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        System.out.println(llist);
        
       SinglyLinkedListNode node = new SinglyLinkedListNode(data);
    if (llist == null) {
         return node;
    }
   

    node.next = llist;
    return node;
        

    }
