package javaexperiment.javatest4;

/*
  包装类和基本输入输出。
      实验要求：
            编写一个java程序，输出每种数据类型的二进制位数和最大值、最小值，完成一些基本类型变量的类型转换，
            使用包装类的方法完成基本类型或字符串向包装类的转换以及包装类或字符串向基本类型的转换。
            填写用方括号括起来的代码块，使程序能正确地编译、运行。
 */
public class WrapperExample
{
    public void b001() {
        // byte字节型
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
        System.out.println("包装类：java.lang.Byte");
        System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
        System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);
        System.out.println();
        //short短整型
        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);
        System.out.println("包装类：java.lang.Short");
        System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
        System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);
        System.out.println();
        //int整型
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);
        System.out.println("包装类：java.lang.Integer");
        System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
        System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
        System.out.println();
        //long长整型
        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);
        System.out.println("包装类：java.lang.Long");
        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);
        System.out.println();
        //float单精度浮点型
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
        System.out.println("包装类：java.lang.Float");
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
        System.out.println();
        //double双精度浮点型
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
        System.out.println("包装类：java.lang.Double");
        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
        System.out.println();
        //char字符型
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
        System.out.println("包装类：java.lang.Character");
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
        System.out.println("最小值：Character.MIN_VALUE=" + (int) Character.MIN_VALUE);
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
        System.out.println("最大值：Character.MAX_VALUE=" + (int) Character.MAX_VALUE);
        //数据类型的转换：自动转换与强制类型转换,只有boolean不参与数据类型的转换
        byte b = 0;int i=b; long l=b; float f=b; double d=b;//自动转换
        char c='c'; int j=c;
        System.out.println("output:"+j);//自动转换的是ASCII码
        System.out.println(b+""+i+""+l+""+f+""+d+""+j);//对于byte,short,char三种类型而言，他们是平级的，因此不能相互自动转换
        //强制类型转换
        int n=(int)3.14159/2;//大数据转小数据，导致溢出和精度的下降
		Double D1 = Double.valueOf(100.00);//将浮点数100.00构造为相应的包装类的对象D1
		int k = D1.intValue();//D1转换为整型，赋给整型变量k
        //其它类型向字符串的转换
        String str1 = D1.toString();//利用toString方法将D1转换为字符串，赋给字符串变量str1
        String str2=D1+"";
		String str3 = String.valueOf(D1); //利用valueO方法将D1转换为字符串，赋给字符串变量str3
        System.out.println(k+""+str1+""+str2+""+str3);
        //静态parseXXX方法
        String s = "1";
		byte b1 = s.getBytes()[0];  //将s转换为字节型
		short t1 = Short.parseShort(s); //将s转换为短整型
		int i1 = Integer.parseInt(s);    //将s转换为整型
		long l1 = Long.parseLong(s);     //将s转换为长整型
        Float f1 = Float.parseFloat(s);
        Double d1 = Double.parseDouble(s);
        System.out.println(b1+""+t1+""+i1+""+l1+""+f1+""+d1);
        Integer n2=20;
        Integer n3=20;
        Integer n4=new Integer(20);//int的包装类
        System.out.println(n2==n3);//true (== 判断的是引用地址)
        System.out.println(n2==n4);//false
        System.out.println(n2.equals(n3));//true（equals 判断的是值内容）
        System.out.println(n2.equals(n4));//true
    }
    public void b002(){
        //包装类，每一个基本类型都有对应的包装类，
        //并且都有一个将基本类型创建成包装类的构造方法。
        Boolean bobj = new Boolean(true);    //用true创建一个布尔型包装类的对象
        Integer iobj = new Integer(1);
        Long lobj = new Long(1);
        Short sobj = new Short((short) 1);
        Character cobj = new Character('a');
        Float fobj = new Float(1.0f);
        Double dobj = new Double(1.0);
        Byte byobj = new Byte((byte) 1);
        //每个包装类都有一个valueOf()方法，用于将字符串转成相应的包装类
        System.out.println(Boolean.valueOf("false"));
        System.out.println(Integer.valueOf("1"));
        System.out.println(Short.valueOf("1"));
        System.out.println(Long.valueOf("1"));
        System.out.println(Float.valueOf("1.0"));
        System.out.println(Double.valueOf("1.0"));
        System.out.println(Byte.valueOf("1"));
        //Character类是将基本类型char转成包装类型Character
        System.out.println(Character.valueOf('a'));
        //每个包装类都有一个parseXxx方法，将字符串转成对应的基本类型,除Character类
        System.out.println(Boolean.parseBoolean("false"));
        System.out.println(Integer.parseInt("1"));
        System.out.println(Short.parseShort("1"));
        System.out.println(Long.parseLong("1"));
        System.out.println(Float.parseFloat("1.0"));
        System.out.println(Double.parseDouble("1.0"));
        System.out.println(Byte.parseByte("1"));
        //Character包装类的常用方法
        Character.isLetter('a');//判断这个字符是否为英文字母
        Character.isDigit('1');//判断这个字符是否为数字
        Character.isUpperCase('A');//判断这个字符是否为大写
        Character.isLowerCase('a');//判断这个字符是否为小写
        Character.isWhitespace(' ');//判断这个字符是否为空格或回车
    }
    public static void main(String argr[]) {
        WrapperExample wr = new WrapperExample();
        wr.b001();
        wr.b002();
    }
}