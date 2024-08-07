class Solution{
    Node divide(int N, Node head){
        // initialize variables for odd head, odd tail, even head, even tail
        Node oh, ot;
        Node eh, et;
        
        // initialize all variables to null
        oh = ot = eh = et = null;
        
        // set current node to head
        Node curr = head;
        
        // iterate through the linked list
        while(curr != null)
        {
            // if current node's data is even
            if(curr.data % 2 == 0)
            {
                // if even head is null, set current node as even head
                // otherwise, set the next of even tail as current node and update even tail
                if(eh == null)
                    eh = curr;
                else
                    et.next = curr;
                et = curr;
            }
            else // if current node's data is odd
            {
                // if odd head is null, set current node as odd head
                // otherwise, set the next of odd tail as current node and update odd tail
                if(oh == null)
                    oh = curr;
                else
                    ot.next = curr;
                ot = curr;
            }
            
            // move to the next node in the linked list
            curr = curr.next;
        }
        
        // if even head is null, return odd head
        if(eh == null)
            return oh;
        // if odd head is null, return even head
        if(oh == null)
            return eh;
        
        // set the next of even tail as odd head and nullify the next of odd tail
        et.next = oh;
        ot.next = null;
        
        // return even head as the final merged linked list
        return eh;
    }
}
