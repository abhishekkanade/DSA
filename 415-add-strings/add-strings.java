class Solution {
    public String addStrings(String num1, String num2) {

        StringBuilder ans = new StringBuilder();
        int n1 = num1.length();
        int n2 = num2.length();
        int i=n1-1;
        int j=n2-1;

        int carry=0;
        int digit=0;
        int val1=0;
        int val2=0;

        while(i>=0 || j>=0 || carry!=0){
            if(i>=0) val1 = num1.charAt(i)-'0';
            else val1=0;
            if(j>=0) val2 = num2.charAt(j)-'0';
            else val2=0;

            int sum= val1+val2+carry;
            digit = sum%10;
            carry = sum/10;
            ans.append(digit);
            
            i--;
            j--;
        }

        System.out.println(ans);
        return ans.reverse().toString();


// Restrictions Failed - method not according to que.
        // int val1=0, val2=0;
        // for(int i=0; i<num1.length(); i++){
        //     val1 = (val1*10)+(num1.charAt(i)-'0');
        // }
        // for(int i=0; i<num2.length(); i++){
        //     val2 = (val2*10)+(num2.charAt(i)-'0');
        // }


        // System.out.print(val1 +" "+val2);
        // return (val1+val2)+"";
    }
}