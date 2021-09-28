/**
 * @Author: 江桂煌
 * @Description: TODO
 * @DateTime: 2021/9/28 16:12
 **/
public class Test7 {

    public static int[] getNext(String sub) {
        int subLen = sub.length();
        int[] next = new int[subLen];
        //检测参数合法性
        next[0] = -1;
        if (subLen > 1) {
            next[1] = 0;
        }
        int i = 2;//用于确定next[i]的值
        int j = 0;//帮助i确定next[i]的值
        while (i < subLen) {
            if (j == -1 ||sub.charAt(i - 1) == sub.charAt(j)) {
                next[i] = j + 1;
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        //next的优化
        i = 2;
        while (i < subLen) {
            if (next[i] != -1 && sub.charAt(next[i]) == sub.charAt(i)) {
                next[i] = next[next[i]];
            } else {
                next[i] = next[i];
            }
            i++;
        }
        return next;
    }
    /**
     *
     * @param str 主串
     * @param sub 子串
     * @param pos 主串开始遍历的位置
     * @return 子串在主串中的索引 找不到子串则返回-1
     */
    public static int myKMP(String str, String sub, int pos) {
        //检测参数合法性
        if (str == null || sub == null) {
            return -1;
        }
        int strLen = str.length();
        int subLen = sub.length();
        if (strLen == 0 || subLen == 0 || pos < 0 || pos >= strLen) {
            return -1;
        }
        int i = pos;//用于遍历主串的索引值
        int j = 0;//用于遍历子串的索引值
        int[] next = getNext(sub);
        while (i < strLen && j < subLen) {
            if (j == -1 ||str.charAt(i) == sub.charAt(j)) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        if (i == strLen) {
            return -1;
        }
        return i - j;
    }
    public static void main(String[] args) {
        String str = "aababcabcdabcdeabcef";
        System.out.println(myKMP(str, "aab", 0));
        System.out.println(myKMP(str, "aab", 2));
        System.out.println(myKMP(str, "abcde", 0));
        System.out.println(myKMP(str, "e", 0));
    }
}
