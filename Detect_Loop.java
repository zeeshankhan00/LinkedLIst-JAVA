class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
        if(head== null)
        return false;
        Node hare = head;
        Node tur = head;
        
        while(hare!=null && hare.next!=null){
            
            
            hare = hare.next.next;
            tur = tur.next;
            if(hare == tur)
            return true;
        }
       
       return false;
    }
}
