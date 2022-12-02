# 实验5 古诗词文本处理

## 实验目的
掌握字符串String及其常用方法的使用

## 业务要求
有《长恨歌》古诗词，在经某程序处理后，被删去了非汉字部分，如标点符号、回车换行等。现请设计程序恢复。   
 
输入：  
汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行<未完，待续>   


输出：  
汉皇重色思倾国，御宇多年求不得。  
杨家有女初长成，养在深闺人未识。  
天生丽质难自弃，一朝选在君王侧。  
回眸一笑百媚生，六宫粉黛无颜色。  
春寒赐浴华清池，温泉水滑洗凝脂。  
侍儿扶起娇无力，始是新承恩泽时。  
云鬓花颜金步摇，芙蓉帐暖度春宵。  
春宵苦短日高起，从此君王不早朝。  
............  

## 实验要求
 
1.每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”；   
2.允许提供输入参数，统计古诗中某个字或词出现的次数。  

## 实验报告

1.  程序重点  
1）加入符号   
```
StringBuffer sb = new StringBuffer(str1);//先将String转换成StringBuffer格式
	
		int size=str1.length()/7;
		for (int i=0;i<size;i++){//先分别加入逗号和句号
			if (i%2==0) {
				sb.insert(7*(i+1)+i, "，");
			}
			else   {
				sb.insert(7*(i+1)+i, "。");
			}
		}
		int size2=sb.length()/16;
		for (int i=0;i<size2;i++){//再加入回车
			sb.insert(16*(i+1)+i, "\n");
		}
```
2）获取用户输入   

```
		Scanner sc=new Scanner(System.in);   //获取用户输入的要查询的字或词
		System.out.println("请输入要查询的字或词：");
		String strrr = sc.nextLine();
		String str = sb.toString();//将StringBuffer的原文转化成String
		int num =test(str,strrr);//出现次数调用test函数
```
3）统计次数函数    

```
	public static int test(String a,String b) {
		int len=b.length();
		int num=0;
		while(a.indexOf(b)!=-1) {
			a=a.substring(a.indexOf(b)+len);
			num++;
		}
		return num;//返回次数数值
	}
```


2.  运行结果     
https://github.com/XQYX/-/blob/main/5/5.png

3.  实验感受    
本实验还可添加报错系统，有待完善。






