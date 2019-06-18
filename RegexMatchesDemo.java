package java8.other;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatchesDemo {
	public static void main(String[] args) {
		checkQQ();//2.1 匹配
		checkTel();//
		splitDemo() ;//分割
		splitDemo2();
		replaceAllDemo();
		replaceAllDemo2();
		getDemo();
	}

	public static void checkQQ() {
		String qq = "123a45664";

		String regex = "[1-9]*[a-z]\\d{4,14}";

		boolean flag = qq.matches(regex);
		if (flag)
			System.out.println(qq + "...is ok");
		else
			System.out.println(qq + "... 不合法");

	} // 不合法

	/*
    匹配
    手机号段只有 13xxx 15xxx 18xxxx
    */
    public static void checkTel()
    {
        String tel = "16900001111";
        String telReg = "1[368]\\d{9}";
        System.out.println(tel.matches(telReg));
    }
	
    //2.2 切割
    public static void splitDemo() {
    	
    String str = "avg   bb   geig   glsd   abc";
    String reg = " +";//按照多个空格来进行切割
    String[] arr = str.split(reg);  
    System.out.println(arr.length);
    for(String s : arr)
    {
        System.out.print(s+" ");
    }

}
    public static void splitDemo2()
    {

    String str = "erkktyqqquizzzzzo";
    String reg ="(.)\\1+";//按照叠词来进行切割
        //可以将规则封装成一个组。用()完成。组的出现都有编号。
        //从1开始。 想要使用已有的组可以通过  \n(n就是组的编号)的形式来获取。
    String[] arr = str.split(reg);  
    System.out.println(arr.length);
    for(String s : arr)
    {
        System.out.print(s+" ");
    }
    System.out.println();
}  
    
    //2.3 替换
    public static void replaceAllDemo()
    {
    
        String str = "wer1389980000ty1234564uiod234345675f";//将字符串中的数字替换成#。
 
        str = str.replaceAll("\\d{1}","#");

        System.out.println(str);
    }
	//组group举例：
    public static void replaceAllDemo2()
    {
    
        String str1 = "erkktyqqquizzzzzo";//将叠词替换成$.  //将重叠的字符替换成单个字母。zzzz->z
 
        str1 = str1.replaceAll("(.)\\1+","$1");

        System.out.println(str1);
    }
    
    public static void getDemo()
    {
        String str = "yin yu shi wo zui cai de yu yan";
        System.out.println(str);
        String reg = "\\b[a-z]{3}\\b";//匹配只有三个字母的单词

        //将规则封装成对象。
        Pattern p = Pattern.compile(reg);

        //让正则对象和要作用的字符串相关联。获取匹配器对象。
        Matcher m  = p.matcher(str);

        //System.out.println(m.matches());//其实String类中的matches方法。用的就是Pattern和Matcher对象来完成的。
        //只不过被String的方法封装后，用起来较为简单。但是功能却单一。

       // boolean b = m.find();//将规则作用到字符串上，并进行符合规则的子串查找。
       // System.out.println(b);
       // System.out.println(m.group());//用于获取匹配后结果。
        
        
        while(m.find())
        {
            System.out.println(m.group());
            System.out.println(m.start()+"...."+m.end());
                // start()  字符的开始下标（包含）
                // end()  字符的结束下标（不包含）
        }
    }        
    
    
}