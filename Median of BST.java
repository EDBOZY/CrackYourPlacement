//User function Template for Java

class Tree
{
    public static float findMedian(Node root)
    {
        // code here.
        ArrayList<Integer>a=new ArrayList<>();
        check(root,a);
        int n=a.size();
        if(n%2==0){
            float d=a.get(n/2)+a.get((n/2)-1);
            return d/2;
        }
        return a.get(n/2);
    }
    public static void check(Node root,ArrayList<Integer>a){
        if(root==null){
            return;
        }
        check(root.left,a);
                a.add(root.data);

        check(root.right,a);
    }
}
