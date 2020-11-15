   static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode node=new SinglyLinkedListNode(data);
//node.data=data;
node.next=null;
        if(position==0){
            node.next=head;
return node;
        }
        else{
            SinglyLinkedListNode temp=head;
            for(int i=0;i<position-1;i++){
                temp=temp.next;
            }
            node.next=temp.next;
            temp.next=node;
            return head;
        }
    }
