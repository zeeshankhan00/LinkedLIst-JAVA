class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
       Node temp;
       
       for(int i= 0; i<k; i++){
          temp = head.next;
           
           
           Node temp1 = head;
           temp1.next = null;
           head = temp;
           
           
           while(temp.next!=null){
               temp = temp.next;
           }
           temp.next = temp1;
           
       }
       
       return head;
        
        
        
    }
}
