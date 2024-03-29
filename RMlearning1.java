package java8.other;

/**
	*功能：
	*@author  ALex
	*@version 1.0 create:2019年6月18日
	*/
public class RMlearning1 {

	public static void main(String[] args) {
		/*1.用户表达式模式*/
		String regex1 = "^[a-z0-9_-]{3,15}";
		
		/*2.密码正则表达式模式*/
		String regex2 = "((?=.*\\d)(?=.*[a-z]) (?=.*[A-Z])(?=.*[@#$%]).{6,20})";
		
		/*3.16进制颜色代码正则表达式模式*/
		String regex3 = "^#[a-z0-9A-Z]{6}|[a-z0-9A-Z]{3}";
		
		/*4.Email正则表达式模式*/
		String regex4 = "^[a-z0-9A-Z-]+(\\. [_[a-z0-9A-Z]+])*@[a-z0-9A-Z]+(\\.[a-z0-9A-Z])*(\\.[a-zA-Z]){2})";
		
		/*5.图像文件扩展名正则表达式模式*/
		String regex5 = "([^\\s]+(\\.(?i))(jpg|png|gif|bmp))$)";
		
		/*6.IP地址正则表达式模式*/
		String regex6 = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\. ^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
		
		/*7.时间格式正则表达式模式*/
		/*12- 小时制时间正则表达式模式*/
		String regex7 = "(1[012]|[1-9]):[0-5][0-9](\\s)?(?i)(am|pm)";
		/*24 小时制时间正则表达式模式*/
		String regex8 = "([01]?[0-9]|2[0-3]):[0-5][0-9]";
		
		/*8.日期格式(dd/mm/yyyy)正则表达式模式*/
		String regex9= "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)";
		
		/*9.HTML标签正则表达式模式*/
		/*String regex10 = "<("[^"]*"|'[^']*'|[^'">])*>";*/
		
		/*10.?HTML链接正则表达式模式*/
		/*HTML中的A标签正则表达式模式*/
		String regex10 = "(?i)<a([^>]+)>(.+?)</a>";
		/*提取HTML链接正则表达式模式*/
		/*String regex10 = "\\s*(?i)href\\s*=\s*(\\"([^"]*\\")|'[^']*'|([^'">\\s]+)";*/
		
	}
}
