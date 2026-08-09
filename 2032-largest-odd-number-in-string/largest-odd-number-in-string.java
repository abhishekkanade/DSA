class Solution {
    public String largestOddNumber(String num) {
        int i= num.length()-1;
        while(i>=0){
            int c = num.charAt(i)-'0';
            if(c%2 == 1) return num.substring(0, i+1);
            i--;
        }
        return "";
    }
}