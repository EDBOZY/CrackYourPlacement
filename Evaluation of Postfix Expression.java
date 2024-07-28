
class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String s)
    {
        // Your code here
        int a=0;
        Stack<Integer>b=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                b.push(s.charAt(i)-'0');
            }
            else{
                int d=b.pop();
                int e=b.pop();
                if(s.charAt(i)=='*'){
                    b.push(d*e);
                }
                if(s.charAt(i)=='-'){
                    b.push(e-d);
                }
                if(s.charAt(i)=='+'){
                    b.push(d+e);
                }
                if(s.charAt(i)=='/'){
                    b.push(e/d);
                }
            }
            
        }
        // b.push(-4);
        return b.pop();
    }
}
