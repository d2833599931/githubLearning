package java8.other;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatchesDemo {
	public static void main(String[] args) {
		checkQQ();//2.1 ƥ��
		checkTel();//
		splitDemo() ;//�ָ�
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
			System.out.println(qq + "... ���Ϸ�");

	} // ���Ϸ�

	/*
    ƥ��
    �ֻ��Ŷ�ֻ�� 13xxx 15xxx 18xxxx
    */
    public static void checkTel()
    {
        String tel = "16900001111";
        String telReg = "1[368]\\d{9}";
        System.out.println(tel.matches(telReg));
    }
	
    //2.2 �и�
    public static void splitDemo() {
    	
    String str = "avg   bb   geig   glsd   abc";
    String reg = " +";//���ն���ո��������и�
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
    String reg ="(.)\\1+";//���յ����������и�
        //���Խ������װ��һ���顣��()��ɡ���ĳ��ֶ��б�š�
        //��1��ʼ�� ��Ҫʹ�����е������ͨ��  \n(n������ı��)����ʽ����ȡ��
    String[] arr = str.split(reg);  
    System.out.println(arr.length);
    for(String s : arr)
    {
        System.out.print(s+" ");
    }
    System.out.println();
}  
    
    //2.3 �滻
    public static void replaceAllDemo()
    {
    
        String str = "wer1389980000ty1234564uiod234345675f";//���ַ����е������滻��#��
 
        str = str.replaceAll("\\d{1}","#");

        System.out.println(str);
    }
	//��group������
    public static void replaceAllDemo2()
    {
    
        String str1 = "erkktyqqquizzzzzo";//�������滻��$.  //���ص����ַ��滻�ɵ�����ĸ��zzzz->z
 
        str1 = str1.replaceAll("(.)\\1+","$1");

        System.out.println(str1);
    }
    
    public static void getDemo()
    {
        String str = "yin yu shi wo zui cai de yu yan";
        System.out.println(str);
        String reg = "\\b[a-z]{3}\\b";//ƥ��ֻ��������ĸ�ĵ���

        //�������װ�ɶ���
        Pattern p = Pattern.compile(reg);

        //����������Ҫ���õ��ַ������������ȡƥ��������
        Matcher m  = p.matcher(str);

        //System.out.println(m.matches());//��ʵString���е�matches�������õľ���Pattern��Matcher��������ɵġ�
        //ֻ������String�ķ�����װ����������Ϊ�򵥡����ǹ���ȴ��һ��

       // boolean b = m.find();//���������õ��ַ����ϣ������з��Ϲ�����Ӵ����ҡ�
       // System.out.println(b);
       // System.out.println(m.group());//���ڻ�ȡƥ�������
        
        
        while(m.find())
        {
            System.out.println(m.group());
            System.out.println(m.start()+"...."+m.end());
                // start()  �ַ��Ŀ�ʼ�±꣨������
                // end()  �ַ��Ľ����±꣨��������
        }
    }        
    
    
}