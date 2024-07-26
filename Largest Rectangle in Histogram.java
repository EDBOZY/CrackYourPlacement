class Solution {
    public int largestRectangleArea(int[] h) {
        Stack<Integer>a=new Stack<>();
        int l[]=new int[h.length];
        int r[]=new int[h.length];

        for(int i=0;i<h.length;i++){
            while(!a.isEmpty() && h[a.peek()]>=h[i]){
                a.pop();
            }
            if(a.isEmpty()){
                l[i]=-1;
            }
            else{
                l[i]=a.peek();
            }
            a.push(i);
        }
        a=new Stack<>();
        for(int i=h.length-1;i>=0;i--){
            while(!a.isEmpty() && h[a.peek()]>=h[i]){
                a.pop();
            }
            if(a.isEmpty()){
                r[i]=h.length;
            }
            else{
                r[i]=a.peek();
            }
            a.push(i);
        }

        int w=0;
        for(int i=0;i<h.length;i++){
            int hr=r[i]-l[i]-1;
            w=Math.max(w,hr*h[i]);
        }
        return w;
    }
}
