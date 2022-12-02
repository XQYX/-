package shiyan5;
import java.util.Scanner;
public class wenzi {
	public static void main(String[] args){
		String str1 = "汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行<未完，待续>";
		StringBuffer sb = new StringBuffer(str1);
	
		int size=str1.length()/7;
		for (int i=0;i<size;i++){
			if (i%2==0) {
				sb.insert(7*(i+1)+i, "，");
			}
			else   {
				sb.insert(7*(i+1)+i, "。");
			}
		}
		int size2=sb.length()/16;
		for (int i=0;i<size2;i++){
			sb.insert(16*(i+1)+i, "\n");
		}
		System.out.println(sb);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要查询的字或词：");
		String strrr = sc.nextLine();
		String str = sb.toString();
		int num =test(str,strrr);
		

		
//		String [] strs = new String[sb.length()];
//		Scanner sc=new Scanner(System.in);
//		System.out.println("请输入要查询的字或词：");
//		String strrr = sc.nextLine();
//		int count = 0;
//		for(int i = 0;i<sb.length();i++){
//			strs[i] = sb.substring(i,i+1);
//		}
//		//挨个字符进行查找，查找到之后count++
//		for(int i = 0;i<strs.length;i++){
//			if(strs[i].equals(strrr)){
//				count++;
//			}
//		}
		
		System.out.println("一共有"+num+"个");
	}
	
	public static int test(String a,String b) {
		int len=b.length();
		int num=0;
		while(a.indexOf(b)!=-1) {
			a=a.substring(a.indexOf(b)+len);
			num++;
		}
		return num;
	}
}
