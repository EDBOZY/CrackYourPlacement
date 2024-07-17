class Solution {
    public String intToRoman(int num) {
         String s="";
        String []a={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String []b={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String []c={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String []d={"","M","MM","MMM"};
        String g=String.valueOf(num);
        return d[num/1000]+c[(num%1000)/100]+b[(num%100)/10]+a[(num%10)/1];
    }
}
