class GfG
{
    Node flatten(Node root)
    {
	// Your code here
	Node ans=null;
	Node curr=root;
	while(curr!=null){
	    ans=merge(ans,curr);
	    curr=curr.next;
	}
	return ans;
    }
    
    Node merge(Node ans,Node curr){
        if(ans==null|| curr==null){
            return ans==null?curr:ans;
        }
        Node p1=ans;
        Node p2=curr;
        Node dummy=new Node(-1);
        Node a=dummy;
        
        while(p1!=null || p2!=null){
            int val1=p1!=null?p1.data:Integer.MAX_VALUE;
            int val2=p2!=null?p2.data:Integer.MAX_VALUE;
            
            if(val1<val2){
                dummy.bottom=p1;
                dummy=dummy.bottom;
                p1=p1.bottom;
            }
            else{
                dummy.bottom=p2;
                dummy=dummy.bottom;
                p2=p2.bottom;
            }
        }
        return a.bottom;
    }
}
