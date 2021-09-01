

public class HelloWorld {
	public static void main(String[] args) {
		double num=1.1;
		System.out.println(num*num);
		//两个整形运算结果必是整形 至少有一个浮点时 运算结果为浮点
		// int a=1;
		// double b=2.0;
		// System.out.println((a/b));
	}
	public static void main6(String[] args) {
		int a=1;
		int b=2;
		System.out.println((a/b));//由于两个整形进行运算 结果必是整形
		// double d=3.14;
		// System.out.println(d);
		// System.out.println(Double.MAX_VALUE);
		// System.out.println(Double.MIN_VALUE);
	}
	public static void main5(String[] args) {
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}
	}
	public static void main4(String[] args) {
		int a=1;
		int b=2;
		System.out.println("hehe"+a+b+"haha");
	}
	public static void main3(String[] args) {
		// long a=10;
		// System.out.println("最大值:"+Long.MAX_VALUE);
		int a=10;
		int b=20;
		System.out.println("值:"+a+b);
		System.out.println("值:"+(a+b));
	}
	public static void main2(String[] args) {
		Long a=10L;
		System.out.println(a);
	}
	public static void main1(String[] args) {
		int a=10;
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(a);
		System.out.print(a);
		System.out.printf("%d",a);
	    System.out.println("HelloWorld");
	}
}
class SB {
	
}
	