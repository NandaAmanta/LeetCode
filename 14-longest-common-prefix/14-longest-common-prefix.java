class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longestPrefix = strs[0];
        if(longestPrefix.length() == 0){
            return "";
        }

        for (int i = 1; i < strs.length ; i++) {
            String element = strs[i];
            if(element.length() == 0){
                return "";
            }
            if (element.charAt(0) != longestPrefix.charAt(0)) {
                return "";
            }
if (element.length() < longestPrefix.length()) {
                longestPrefix = longestPrefix.substring(0, element.length());
                
            }
            for (int j = 1; j < element.length(); j++) {
                
                if(element.length() <= j || longestPrefix.length() <= j){
                    break;
                }
                
                if (element.charAt(j) != longestPrefix.charAt(j)) {
                    longestPrefix = longestPrefix.substring(0, j);
                    break;
                }
            }
        }

        return longestPrefix;
    }
}