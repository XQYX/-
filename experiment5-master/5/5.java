package shiyan5;
import java.util.Scanner;
public class wenzi {
	public static void main(String[] args){
		String str1 = "������ɫ˼�����������󲻵������Ů���������������δʶ��������������һ��ѡ�ھ��������һЦ������������������ɫ������ԡ�������Ȫˮ��ϴ��֬�̶���������ʼ���³ж���ʱ���޻��ս�ҡܽ����ů�ȴ�����������ո���Ӵ˾������糯�л���������Ͼ���Ӵ���ҹרҹ�󹬼�����ǧ����ǧ�谮��һ�����ױ�ɽ���ҹ��¥�����ʹ���õ��ֽ���ʿ����������Ż��������¸�ĸ�Ĳ�����������Ů�깬�ߴ����������ַ�Ʈ�����Ż���������˿���վ�������������ܱ�Ķ����������������������س����̳���ǧ������������<δ�꣬����>";
		StringBuffer sb = new StringBuffer(str1);
	
		int size=str1.length()/7;
		for (int i=0;i<size;i++){
			if (i%2==0) {
				sb.insert(7*(i+1)+i, "��");
			}
			else   {
				sb.insert(7*(i+1)+i, "��");
			}
		}
		int size2=sb.length()/16;
		for (int i=0;i<size2;i++){
			sb.insert(16*(i+1)+i, "\n");
		}
		System.out.println(sb);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("������Ҫ��ѯ���ֻ�ʣ�");
		String strrr = sc.nextLine();
		String str = sb.toString();
		int num =test(str,strrr);
		

		
//		String [] strs = new String[sb.length()];
//		Scanner sc=new Scanner(System.in);
//		System.out.println("������Ҫ��ѯ���ֻ�ʣ�");
//		String strrr = sc.nextLine();
//		int count = 0;
//		for(int i = 0;i<sb.length();i++){
//			strs[i] = sb.substring(i,i+1);
//		}
//		//�����ַ����в��ң����ҵ�֮��count++
//		for(int i = 0;i<strs.length;i++){
//			if(strs[i].equals(strrr)){
//				count++;
//			}
//		}
		
		System.out.println("һ����"+num+"��");
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
