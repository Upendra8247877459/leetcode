class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char num: s.toCharArray()) {
          map.put(num,map.getOrDefault(num,0)+1);
        }
        for(char num: t.toCharArray()) {
            if(!map.containsKey(num)) {
                return false;
            }
          map.put(num,map.get(num)-1);
        }
        for(int value: map.values()) {
            if(value!=0) {
                return false;
            }
        }
        return true;
    }
}
