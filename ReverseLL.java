class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node node)
    {
        Node p1,p2,p3;
        p1 = null;
        p2 = node;
        p3 = p2.next;
        p2.next = null;
        while(p3!=null){
            p1 = p2;
            p2 = p3;
            p3 = p3.next;
            p2.next = p1;
        }
        
        node = p2;
        return node; 
        
    
    }
}
