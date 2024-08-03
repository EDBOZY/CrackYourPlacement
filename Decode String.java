class Solution {
    public String decodeString(String s) {
        Stack<Integer>stac=new Stack<>();
        Stack<StringBuilder> stacSB = new Stack<>();
        StringBuilder str = new StringBuilder();
        int n = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                n = n * 10 + (c - '0');
            } else if (c == '[') {
                stac.push(n);
                n = 0;
                stacSB.push(str);
                str = new StringBuilder();
            } else if (c == ']') {
                int k = stac.pop();
                StringBuilder temp = str;
                str = stacSB.pop();
                while (k-- > 0) {
                    str.append(temp);
                }
            } else {
                str.append(c);
            }
        }
        return str.toString();
    }
}
