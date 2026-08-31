import java.util.Arrays;
class Solution {
    public int lengthOfLastWord(String s) {
        String[] val=s.split("");
        String num=val[val.length-1];
        return num.length();
    }
}




class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        boolean counting = false;

        for (char c : s.toCharArray()) {
            if (c != ' ') {
                if (!counting) {
                    counting = true;
                    length = 1;
                } else {
                    length++;
                }
            } else {
                counting = false;
            }
        }

        return length;        
    }
}
