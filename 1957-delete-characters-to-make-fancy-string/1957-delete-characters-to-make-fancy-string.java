class Solution {
    public String makeFancyString(String s) {
        char currentChar = s.charAt(0);
        int count = 1;
        StringBuilder sb = new StringBuilder().append(currentChar);

        for (int i = 1; i < s.length(); i++) {
            char element = s.charAt(i);
            if (element == currentChar) {
                count++;
            } else {
                currentChar = element;
                count = 1;
            }

            if (count == 3) {
                count--;
                continue;
            }

            sb.append(element);
        }

        return sb.toString();
    }
}