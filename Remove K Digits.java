class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer>a=new Stack<>();
        for(int i=0;i<num.length();i++){
            while(!a.isEmpty() && k>0 && a.peek()>num.charAt(i)-'0'){
                a.pop();
                k--;
            }
            a.push(num.charAt(i)-'0');
        }
        while(k>0){
            a.pop();
            k--;
        }
        StringBuilder b=new StringBuilder();
        while(!a.isEmpty()){
            b.append(a.pop());
        }
        b.reverse();
        while(b.length()>0 && b.charAt(0)=='0'){
            b.deleteCharAt(0);
        }
        return b.length()==0?"0":b.toString();
    }
}
