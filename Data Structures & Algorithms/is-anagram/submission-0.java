class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        char[] chs = s.toCharArray();

        for (int i=0 ; i<chs.length; i++) {
            map.put(chs[i], map.getOrDefault(chs[i],0)+1);
        }

        char[] cht = t.toCharArray();

        for (int i=0 ; i<cht.length; i++) {

            if (!map.containsKey(cht[i])) {
                return false;
            }

           map.put(cht[i], map.get(cht[i])-1);

           if (map.get(cht[i]) == 0) {
                map.remove(cht[i]);
           }
        }

        return map.size() == 0;

        /** racecar carrace

        r - 1
        a - 1
        c - 1
        e - 1
        c - 1
        a - 1
        r - 1


        **/



    }
}
