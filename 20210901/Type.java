public class Type {
	//对赋值问题的手贱尝试
	 public static void main(String[] args) {
	 	int a=1;
	 	byte b=a;
	 	System.out.println(b);
	 }
     //int和string的相互转换
	   //int转为string
	   public static void main12(String[] args) {
	   // 	int a=10;

	   // 	//方法一：使用拼接
	   // 	// String str=a+"";
	   // 	//方法二：使用类方法
	   // 	String str=String.valueOf(a);
	   // 	System.out.println(str);
	   //string转为int
	   String str="200";
	   int a=Integer.parseInt(str);
	   System.out.println(a);

     
	   }
	   //类型转换
	   //1显示类型转换（强转 大转小）
	   //2隐式类型转换（小转大 由分为整形提升和算术转换）
	   //现在讲讲算术转换
	   public static void main11(String[] args) {
	   	int intValue=10;
	   	long longValue=intValue;
	   	System.out.println(longValue);
	   }
     public static void main10(String[] args) {
     	//常量的定义 命名往往约定用全大写
     	final int MAXLAVUE=233;
     	//尝试修改常量的值会导致报错
      // MAXLAVUE=2333;
     	System.out.println(MAXLAVUE);
     }
     //变量命名形式（建议使用小驼峰）（即首个单词首字母不大写 其他单词首字母都大写）
	  public static void main9(String[] args) {
		byte byteMax=10;
		char charMax=0;
		short shortMax=0;
		int intMax=0;
		long longMax=123L;
		Float floatMax=3.14f;
		Double doubleMax=4.56;
		boolean booleanMax=false;
	  }
	   //字符串
   	public static void main8(String[] args) {
		  // String str="hehe";
		  // System.out.println(str);
		  //字符串中的转义字符
		  String str="hehe\n";
		  System.out.println(str);

		  String str1="hehe\t hehe";
		  System.out.println(str1);

		  String str2="\"hehe\"";
		  System.out.println(str2);

		  String str3="\'hehe\'";
		  System.out.println(str3);

		  String str4="\\hehe\\";
		  System.out.println(str4);
	  }
     //布尔类型
     public static void main7(String[] args) {
     	boolean flag=true;//出错 int无法转换为Boolean
     	System.out.println(flag);
     }
	   //短整型
	   public static void main6(String[] args) {
	    	short sh=176;
	    	System.out.println(sh);
	    	System.out.println(Short.MAX_VALUE);
	    	System.out.println(Short.MIN_VALUE);
	    } 
	    //byte
	    public static void main5(String[] args) {
		    // byte a=12;
		    // byte b=21;
		    // System.out.println(a+" "+b);
		    // System.out.println(Byte.MAX_VALUE);
		    // System.out.println(Byte.MIN_VALUE);

		    //赋值超出变量类型的取值范围
		    // byte c=Byte.MAX_VALUE+1;
		    // System.out.println(c);
        
        //println默认以整形形式打印 因此打印128
		    // System.out.println(Byte.MAX_VALUE+1);

		    //典型的赋值符的问题  已知 int 的最大值为 2147483647
		    // int a=Integer.MAX_VALUE+1;
		    // System.out.println(a);//1不会报错 输出int最小值
		    // int b=2147483648;
		    // System.out.println(b);//2报错 结果是超出变量取值范围
		    // byte a=1;
		    // byte b=2;
        //   byte c=b+a;
        //   System.out.println(c);//3报错 
        //3的修改
        byte a=10;
        byte b=10;
        byte c=(byte)(a+b);
        System.out.println(c);
		    //原因分析：1.不报错的原因是 先计算再赋值 因为整形的运算特点（画圆） 所以最大值加1变成最小值 最小值不超过其整形取值范围 因此成功赋值

		    //         2.报错的原因是 赋值超过取值范围
        //         3.报错原因：整形提升
		    //原理总结
		    // 1 赋值符原理：超过范围则报错 数值默认为整形类型 复合变量范围会修改其默认类型（有确定类型的变量很明显无法修改）
		    // 2 整形提升 不解释
		    // 3 若变量有正负号 则其加减运算遵循圆形模型（圆形模型本质为补码的变化）

	    }
      //字符类型
	    public static void main4(String[] args) {
	    	char ch1='a';
	    	System.out.println(ch1);

	    	char ch2='江';
	    	System.out.println(ch2);

	    	char ch3=97;
	    	System.out.println(ch3);
	    	System.out.println(Character.MAX_VALUE);
	    	System.out.println(Character.MIN_VALUE);
	    }
	    //单精度浮点类型
	    public static void main3(String[] args) {
	    	float f =3.14f;
	    System.out.println(f);
	    }
      public static void main2(String[] args) {
      	//小转大时 若超出小的能表示的范围 则会直接报错
      	char a=0;
      	char b=1;
        System.out.println(a);
        System.out.println(b);
      }
	//尝试超界 看java编译器的反应 结果是报错 
	public static void main1(String[] args) {
		byte a=127;
		System.out.println(a);
	}
}