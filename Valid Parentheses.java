class Solution {
    public boolean isValid(String s) {
        Stack<Character>a=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                a.push(s.charAt(i));
            }
            else if(!a.isEmpty()&&((s.charAt(i)==']' && a.peek()=='[') ||(s.charAt(i)=='}' && a.peek()=='{') || (s.charAt(i)==')' && a.peek()=='('))){
                a.pop();
            }
            else{
                a.push(s.charAt(i));
            }
        }
        return a.isEmpty();
    }
}
