class Solution
{
    //Function to count number of nodes in BST that lie in the given range.
    // ArrayList<Integer>a=new ArrayList<>();
    int a=0;
    int getCount(Node root,int l, int h)
    {
        //Your code here
        help(root,l,h);
        return a;
        
    }
    void help(Node root,int l,int h){
        if(root==null){
            return ;
        }
        help(root.left,l,h);
        if(root.data>=l && root.data<=h){
            a++;
        }
        help(root.right,l,h);
    }
}
