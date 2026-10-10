class Solution {
    public String countAndSay(int n) {
        
      return count(n, "");
    }

    String count(int n, String str){
        if(n==1){
            str = str+'1';
            return str;
        }

        str = count(n-1, str);

        int i=0;
        int j=0;
        StringBuilder sb = new StringBuilder();
        while(i<str.length()){
            if(str.charAt(j)==str.charAt(i)){
                i++;
                continue;
            } 
            else{
                sb.append(i-j);
                sb.append(str.charAt(j));
                j=i;
                i++;
            }
        }
        sb.append(i-j);
        sb.append(str.charAt(j));
        str = sb.toString();

        return str;
    }
}