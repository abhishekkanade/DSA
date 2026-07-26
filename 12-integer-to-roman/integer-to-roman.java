class Solution {
    public String intToRoman(int num) {
        int count=0;
        int n=num;
        int[] dec = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb=new StringBuilder();

        for(int i=0; i<dec.length; i++){

            while(num >= dec[i]){
                sb.append(roman[i]);
                num -= dec[i];
            }
        }
        return sb.toString();
    }
    
}