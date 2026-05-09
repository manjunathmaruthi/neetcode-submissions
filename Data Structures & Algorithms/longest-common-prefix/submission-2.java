class Solution {
    public String longestCommonPrefix(String[] strs) {
        /**
        "bat"
            j
        ["ba","bag","bank","band"]
                  j

                result = frist.charAt(i);

        1. Go with brutforce approach


       String firstElement = strs[0];
        int j = -1;
      while (true) {
         j++;

         if (j >= firstElement.length()) {
            return result.toString();
         }
        for (int i=1; i< strs.length(); i++) {
            if (j >= strs[i].length() || firstElement.charAt(j) != strs[i].charAt(j)) {
                return result.toString();
            }
        }

        result.append(firstElement.charAt(j));

       }



        *
    */

        String firstElement = strs[0];
        int j = -1;
        StringBuilder result = new StringBuilder();
        while (true) {
            j++;

            if (j >= firstElement.length()) {
                return result.toString();
            }
            for (int i = 1; i < strs.length; i++) {
                if (j >= strs[i].length() || firstElement.charAt(j) != strs[i].charAt(j)) {
                    return result.toString();
                }
            }

            result.append(firstElement.charAt(j));
        }

        //return result.toString();
    }
}