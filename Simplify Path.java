class Solution {
    public String simplifyPath(String path) {
        String p[]=path.split("/");
        Stack<String>a=new Stack<>();
        StringBuilder b=new StringBuilder();
        for(int i=0;i<p.length;i++){
            if(!a.isEmpty() && p[i].equals("..")){
                a.pop();
            }
            else if(!p[i].equals(".") && !p[i].equals("..") && !p[i].equals("")){
                a.push(p[i]);
            }
        }
        // String b="";
        if(a.isEmpty()){
            return "/";
        }
        else{
            while(!a.isEmpty()){
                b.insert(0,a.pop()).insert(0,"/");
            }
        }
        return b.toString();
    }
}
