import java.util.Arrays;

/**
 * @Author: 江桂煌
 * @Description: StringBuffer的方法试用+
 * @DateTime: 2021/9/26 15:13
 **/
public class Test4 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        boolean b = false;
        sb.append(b);
        System.out.println(sb);
        sb.append('a');
        System.out.println(sb);
        sb.append("   haha");
        System.out.println(sb);
        sb.append("abcdef", 1,2);
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.charAt(1));
        System.out.println(sb.codePointCount(1, 10));
        sb.delete(1,10);
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
        char[] arr = {'a', 'v'};
        sb.getChars(1,2,arr,0);
        System.out.println(Arrays.toString(arr));

        sb.insert(0,"hahahaha ");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.length());

        System.out.println(sb.substring(1));//这个方法不会改变原StringBuilder对象的内容 而会返回修改后的字符串
        System.out.println(sb);

    }
}
