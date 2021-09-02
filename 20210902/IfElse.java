import java.util.Scanner;

public class IfElse {
    //逻辑控制和输入输出作业
    public static void main(String[] args) {
    	//1.根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上）
    	// int age = 999;
    	// if (age <= 18) {
    	// 	System.out.println("少年");
    	// } else if (age <= 28) {
    	// 	System.out.println("青年");
    	// } else if (age <= 55) {
    	// 	System.out.println("中年");
    	// } else {
    	// 	System.out.println("老年");
    	// }
    	//2. 判定一个数字是否是素数
    	// int num = 5389;
    	// int i = 0;
    	// //试除法
    	// for(i = 2; i < num; i ++) {
    	// 	if (num % i == 0) {
    	// 		System.out.println("不是素数");
    	// 		break;
    	// 	}
    	// }
    	// if (i == num) {
    	// 	System.out.println("是素数");
    	// }
    	//3. 打印 1 - 100 之间所有的素数
    	// int i = 0;
    	// int j = 0;
    	// //试除
    	// for(i = 1; i < 100; i ++) {
    	//     for(j = 2; j < i; j ++) {
    	// 	    if (i % j == 0) {
    	// 		    break;
    	// 	    }
    	//     }
    	//     if (j == i) {
    	// 	    System.out.println(j+" ");
    	//     }
        // }
    	//4.输出 1000 - 2000 之间所有的闰年
    	// int i = 0;
    	// for (i = 1000; i <= 2000; i += 4) {
    	// 	if ((i % 100 != 0 && i % 4 == 0) || (i % 400 == 0)) {
    	// 		System.out.println(i);
    	// 	}
    	// }
    	//5. 输出乘法口诀表
    	// int i = 0;
    	// int j = 0;
    	// for (i = 1; i <= 9; i++) {
    	// 	for (j = 1; j <= i; j++) {
    	// 		//文艺复兴
    	// 		System.out.printf("%2d*%2d=%2d",i,j,i*j);
    	// 	}
    	// 	System.out.println("");
    	// }
    	//6.求两个正整数的最大公约数
    	// int a = 20;
    	// int b = 30;
    	// int c = a;
    	// int d = b;
    	// int e = 0;
    	// //辗转相除
    	// while (c % d != 0) {
    	// 	e = c % d;
    	//     c = d;
    	//     d = e;
    	// }
    	// a /= e;
    	// b /= e;
    	// int result = a * b * e;
        // System.out.println(result);
        //7. 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
        // int i = 0;
        // double sum = 0;
        // for (i = 1; i <= 100; i ++) {
        //     sum += 1.0 / i;
        // }
        // System.out.println(sum);
        //8.编写程序数一下 1到 100 的所有整数中出现多少个数字9。
        // int num = 0;
        // int i = 0;
        //0-99的个位数中的9的个数
        // for (i = 0; i <= 9; i ++) {
        // 	num ++;
        // }
        // //90-99中十位数的9的个数
        // for (i = 0; i < 10; i ++) {
        //     num++;
        // }
        // System.out.println(num);
        //9.求出0～999之间的所有“水仙花数”并输出。
        int i = 0;
        for (i = 100; i <= 999; i ++) {
             //模除法剥离i的各个数
        	int tmp = i;
        	int a = tmp % 10;
        	tmp /= 10;
        	int b = tmp % 10;
        	tmp /= 10;
        	int c = tmp;
        	if ((a * a * a) + (b * b * b) + (c * c * c) == i) {
        		System.out.println(i);
        	}
        }
    }

	//数据类型与操作符的课后作业

	//给定3个int变量 求最大值和最小值
	public static void main14(String[] args) {
		int a = 4;
        int b = 3;
        int c = 2;
        //对abc三个整形使用冒泡排序法
        if (a > b) {
        	int tmp = a;
        	a = b;
        	b = tmp;
        }
        if(b > c) {
        	int tmp = b;
        	b = c;
        	c = tmp;
        }
        if(a > b) {
        	int tmp = a;
        	a = b;
        	b = tmp;
        }
        System.out.println("最大值为"+c);
        System.out.println("最小值为"+a);
	} 
	//交换两个int变量的值
	public static void main13(String[] args) {
		int a = 10;
		int b = 20;
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println(a);
		System.out.println(b);
	}
	//switch
	//面试题：什么数据类型不支持switch？
	//答：包括long、float、double、boolean（反过来说 非long的整数、枚举、字符、字符串均可支持switch）
	public static void main12(String[] args) {
		String a = "hehe";
		switch(a) {
			case "hehe":
			    System.out.println("1");
			    break;
			case "haha":
			    System.out.println("2");
			    break;
			default:
			    System.out.println("再输一次");
			    break;
		}
	}
    //if else
    public static void main11(String[] args) {
    	// int a = 10;
    	// if(a == 10) {
    	// 	System.out.println("hello");
    	// }

    	//判断一个数是奇数还是偶数
    	// Scanner scan = new Scanner(System.in);
    	 // int a = scan.nextInt();
    	 // if (a % 2 == 1) {
    	 // 	System.out.println("奇数");
    	 // } else {
    	 // 	System.out.println("偶数");
    	 // }

    	 //判断一个数是正数还是负数
    	 // Scanner scan = new Scanner(System.in);
    	 // int b = scan.nextInt();
    	 // if (b > 0) {
    	 // 	System.out.println("正数");
    	 // } else if (b < 0) {
    	 // 	System.out.println("负数");
    	 // } else {
    	 // 	System.out.println("0");
    	 // }

    	//判断一个年是不是闰年
    	 // Scanner scan = new Scanner(System.in);
    	 // while (scan.hasNextInt()) {
    	 // 	int year = scan.nextInt();
    	 // 	if ((year % 100 != 0 && year % 4 == 0) || (year % 400 == 0)) {
    	 // 	System.out.println("是闰年");
    	 //    } else {
    	 // 	System.out.println("不是闰年");
    	 //    }
    	 // }
    	 
    	 //悬空else（if会自动与附近的else进行匹配）
    	int x = 10;
    	int y = 10;
    	if (x == 10)
    		if (y == 10)
    		System.out.println("aaa");
    	else 
    		System.out.println("bbb");
    }

    //拓展：java的scanf
    public static void main10(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	// int a = scan.nextInt();
    	// System.out.println(a);

    	String str = scan.next();
    	System.out.println(str);

    	// String str = scan.nextLine();
    	// System.out.println(str);
    }
    //条件操作符
    public static void main9(String[] args) {
    	int a = 10;
    	int b = 20;
    	int max = a > b ? a : b ;
    	System.out.println(max);
    }
    //移位操作符
    public static void main8(String[] args) {
    	//左移
    	// int a = 0X10;
    	// System.out.printf("%x\n", a << 1);

    	//右移
    	 int a = 0X10;
    	 System.out.printf("%x\n", a >> 1);

    	 //算术右移
    	 int b = 0X10;
    	 System.out.printf("%x\n", a >>> 1);
    }

	//位运算
	//按位与
    public static void main7(String[] args) {
    	//逻辑与
    	// int a = 10;
    	// int b = 20;
    	// System.out.println(a & b);

    	//按位或
    	// int a = 10;
    	// int b = 20;
    	// System.out.println(a | b);

    	//按位取反
    	// int a = 0;
    	// System.out.println(~a);

    	//按位异或
    	// int a = 0x1;
    	// int b = 0x2;
    	// System.out.println(a ^ b);
    }
	public static void main6(String[] args) {
		//逻辑与
		// int a = 10;
		// int b = 20;
		// int c = 30;
		// System.out.println((a <= b) && (b <= c));
        //逻辑或
		// int a = 10;
		// int b = 20;
		// int c = 30;
		// System.out.println((a <= b) || (b <= c));

		//逻辑取反
		// int a = 10;
		// int b = 20;
		// System.out.println(!(a < b));
        
        //逻辑与和逻辑或均为短路求值
		System.out.println(10 > 20 && 1 / 0 == 0);
		System.out.println(10 < 20 || 1 / 0 == 0);
	}

	//关系运算符 java中的布尔值只有true和false两种取值
	public static void main5(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(a == b);// flase
		System.out.println(a != b);// ture
		System.out.println(a > b);// false
		System.out.println(a < b);// ture
		System.out.println(a >= b);// false
		System.out.println(a <= b);// ture
	}

	//运算符

	public static void main4(String[] args) {
		int i = 10;
        i = i++;//java中++的坑 有需要可以深究
        System.out.println(i);
	}

	public static void main3(String[] args) {
		int a = 10;
		int b = ++a;
		System.out.println(b);//11
		int c = a++;
		System.out.println(c);//11
	}

    public static void main2(String[] args) {
    	System.out.println(10 % 3);//1
		System.out.println(-10 % 3);//-1
		System.out.println(10 % -3);//1
		System.out.println(-10 % -3);//-1
    }

	public static void main1(String[] args) {
		System.out.println(5 / 2);//2
		System.out.println(5.0 / 2);//2.5
		System.out.println((float)5 / 2);//2.5
		System.out.println((float)(5 / 2));//2.0
		System.out.println(3 / 1.5);
	}

}