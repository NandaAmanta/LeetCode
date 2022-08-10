class Solution {
    public boolean isValid(String s) {
       char currentElement = s.charAt(0);
        var sb = new StringBuilder().append(currentElement);
        if (currentElement == ')' || currentElement == '}' || currentElement == ']' || s.length() % 2 == 1) {
            return false;
        }
        for (int i = 1; i < s.length(); i++) {
            char element = s.charAt(i);
            if (sb.length() > 0) {
                if ((sb.charAt(sb.length() - 1) == '(' && element == ')')
                        || (sb.charAt(sb.length() - 1) == '[' && element == ']')
                        || (sb.charAt(sb.length() - 1) == '{' && element == '}')) {
                    sb.deleteCharAt(sb.length() - 1);
                    continue;
                }
            }
            sb.append(element);
            
        }
        return sb.length() == 0;
    }
}