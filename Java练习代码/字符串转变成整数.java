class Solution {
    public int myAtoi(String str) {
        //判断字符串是否为空字符或是空格字符
        if ( str == null || "".equals(str) ) {
            return 0;
        }
        //找到第一个非空格字符的位置
        int start;
        for (int i = 0; i < str.length(); i++) {
            //记录第一个非空字符的位置
            if ( str.charAt(i) != ' ') {
                start = i;
                break;
            }
        }
        //记录第一个非空字符
        char startChar = str.charAt( start );
        //判断第一个非空字符是否为有效字符
        boolean isInvalidChar = !Character.isDitit( startChar ) && startChar != '-'  &&startChar != '+';
        if ( isInvalidChar ) {
            return 0;
        }
        //找到第一个有效字符
        boolean isPosition = startChar != '-';
        int numberStart = startChar == '+' || startChar == '-' ? start+1 : start;
        int ans = 0;
        for (int i = numberStart; i < str.length(); i++) {
            //判断每一个字符是否为数字字符
            if ( !Character.isDitit(str.charAt(i))) {
                break;
            }
            //计算结果
            ans = ans*10 + Integer.valueOf( str.charAt(i) - '0');
            //判断是否溢出long
            boolean isOutBound = ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE;
            if ( isOutBound ) {
                break;
            }
        }
        //判断符号
        if ( !isPosition ) {
            ans = -ans;
        }
        if (ans > Integer.MAX_VALUE ) {
            return Integer.MAX_VALUE;
        }
        else {
            if (ans < Integer.MIN_VALUE ) {
                return Integer.MIN_VALUE;
            }
            else {
                return (int)ans;
            }
        }
    }
}