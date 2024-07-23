static class Solution {
    // Function that constructs BST from its preorder traversal.
    public Node Bst(int pre[], int size) {
        // code here
        Node ans=new Node(pre[0]);
        for(int i=1;i<size;i++){
            ans=help(pre[i],ans);
        }
        return ans;
    }
    public Node help(int i,Node root){
        if(root==null){
            return new Node(i);
        }
        if(root.data>i){
            root.left=help(i,root.left);
        }
        if(root.data<i){
           root.right= help(i,root.right);
        }
        return root;
    }
}

//{ Driver Code Starts.

    public static void printInorder(Node node) {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }

    public static void printPostorder(Node node) {
        if (node == null) {
            return;
        }
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.data + " ");
    }

    public static void printPreorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }
}
// } Driver Code Ends
