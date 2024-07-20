class Solution {
    public boolean backspaceCompare(String s, String t) {
        // if(s.length()!=t.length()){
        //     return false;
        // }
        Stack<Character>a=new Stack<>();
        Stack<Character>b=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)!='#'){
                a.push(s.charAt(i));
            }
            else if(a.isEmpty()){
                // a.push('#');
                continue;
            }
            else{
                a.pop();
            }
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)!='#'){
                b.push(t.charAt(i));
            }
            else if(b.isEmpty()){
                // b.push('#');
                continue;
            }
            else{
                b.pop();
            }
        }
        if(a.size()!=b.size()){
            return false;
        }
        while(!a.isEmpty()){
            if(a.pop()!=b.pop()){
                return false;
            }
        }
        return true;
        
    }
}
