/**
 * 文档注释
 */
public class CodingStandard
{
	
	public static void main2(String[] args) {
		//求1到5的阶乘的和
		int sum=0;
		for (int i=1; i<=5; i++) {
			int num = 1;
            for (int j=1; j<=i; j++) {
                num *= j;
            }
            sum += num;
		}
		System.out.println(sum);
	}
	public static void main1(String[] args) {
	    int myName = 233;
		final int MAX_NUM = 4399;
		Long a = 20L;
		String say = "hello";
		int flag = 0;
		if (flag==0) {
			System.out.println(say);
		}
		if (flag==1) {
            System.out.println("world");  
		} else {
			System.out.println("ok");
		}
	}
}