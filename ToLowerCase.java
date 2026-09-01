class Solution {
    public String toLowerCase(String s) {
        String res="";
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if(65<=ch && ch<=90) {
                res+=(char)(ch+32);
            } else {
                res+=ch;
            }
        }
        return res;
    }
}
//we can also use direct pre defind method: s.toLowerCase();
