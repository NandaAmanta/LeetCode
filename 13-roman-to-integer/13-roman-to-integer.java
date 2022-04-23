class Solution {
   public int romanToInt(String s) {
        char[] array = s.toCharArray();
        int result = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (result == 0) {
                result += this.convert(array[i]);
                continue;
            }
            if (this.convert(array[i]) == this.convert(array[i + 1])) {
                result += this.convert(array[i]);
                continue;
            }

            if (result > this.convert(array[i])) {
                result -= this.convert(array[i]);
                continue;
            }
            if (result <= this.convert(array[i])) {
                result += this.convert(array[i]);
            }
        }
       
        return result;    
   }

    private int convert(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;

        }
        return 0;
    }
}