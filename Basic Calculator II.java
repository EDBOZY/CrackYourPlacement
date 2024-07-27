class Solution {
    public int calculate(String s) {
        Stack<Integer>a=new Stack<>();
        char x='+';
        int sum=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                sum=sum*10+(c-'0');
            }
            if(!Character.isDigit(c) && c!=' ' || i==s.length()-1){
                if(x=='+'){
                    a.push(sum);
                }
                else if(x=='-'){
                    a.push(-sum);
                }
                else if(x=='*'){
                    a.push(a.pop()*sum);
                }
                else if(x=='/'){
                    a.push(a.pop()/sum);
                }
                x=c;
                sum=0;

            }
        }
        int ans=0;
        while(!a.isEmpty()){
            ans+=a.pop();
        }
        return ans;
    }
}
