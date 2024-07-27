class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
        HashMap<String,List<String>>a=new HashMap<>();
        for(String i:s){
            char[] c=i.toCharArray();
            Arrays.sort(c);
            String b=new String(c);
            if(!a.containsKey(b)){
                a.put(b,new ArrayList<>());
            }
            a.get(b).add(i);
        }
        return new ArrayList<>(a.values());
    }
}
