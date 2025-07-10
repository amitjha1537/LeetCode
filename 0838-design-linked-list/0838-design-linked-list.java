class MyLinkedList {
    Node head;
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }

    public MyLinkedList() {
        head=null;
        
    }
    
    public int get(int index) {
        Node temp=head;
        int i=0;
       
        while(temp!=null)
        {
        
            if(i++==index){
                return temp.val;
            }
            temp=temp.next;
        }
        return -1;
        
    }
    
    public void addAtHead(int val) {
        Node newNode=new Node(val);
        newNode.next=head;
        head=newNode;

        
    }
    
    public void addAtTail(int val) {
        if(head==null){
            addAtHead(val);
            return;

        }
        Node temp=head;
        Node newNode=new Node(val);
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;

        
    }
    
    public void addAtIndex(int index, int val) {
        if(index==0){
            addAtHead( val);
            return;
        }
        int i=0;
        Node temp=head;
        while(temp!=null){
            if(i+1==index){
                Node newNode=new Node(val);
                newNode.next=temp.next;
                temp.next=newNode;
                return;
            }
            i++;
            temp=temp.next;

        }
        
    }
    
    public void deleteAtIndex(int index) {
        int i=0;
        if(index==0&&head!=null){
            head=head.next;
        }
        Node temp=head;
        while(temp!=null&&temp.next!=null){
            if(i+1==index){
                temp.next=temp.next.next;
            }
            i++;
            temp=temp.next;
        }
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */