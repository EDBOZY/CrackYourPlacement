class Solution {
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> nums , int n) {
        // code here
        ArrayList<ArrayList<Integer>> aa = new ArrayList<>();
        ArrayList<Integer>bb=new ArrayList<>();
        HashMap<Integer,Integer>cc=new HashMap<>();
        help(nums,aa,bb,cc);
        Collections.sort(aa,(x,y)->{
            for(int i=0;i<x.size();i++){
                if(x.get(i)!=y.get(i)) return x.get(i)-y.get(i);
            }
            return x.get(x.size())-y.get(y.size());
        });
        // Collections.sort(a);
        return aa;
    }
    static void help(ArrayList<Integer>nums, ArrayList<ArrayList<Integer>> a, ArrayList<Integer>b,HashMap<Integer,Integer>c){
        if(b.size()==nums.size()){
            if(!a.contains(b)){
                a.add(new ArrayList<>(b));
            }
            return;
        }
        for(int j=0;j<nums.size();j++){ 
                   if(!c.containsKey(j)){
                        c.put(j,1);
                        b.add(nums.get(j)); 
                        help(nums,a,b,c);
                        b.remove(b.size()-1);
                        c.remove(j);
                   }
               }
    }
};
