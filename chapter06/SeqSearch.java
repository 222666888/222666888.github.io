import java.util.Scanner;
public class SeqSearch {
	public static void main(String[] args) {
		/*��һ�����У���üӥ������ëʨ����������������������������Ϸ��
		 �Ӽ�������������һ�����ƣ��ж��������Ƿ���������ơ�˳����ҡ� Ҫ
		 ��: ����ҵ��ˣ�����ʾ�ҵ����������±�ֵ ˼·���� 
		 1. ����һ���ַ�������
		 2. �����û�����, �������飬��һ�Ƚϣ�����У�����ʾ��Ϣ�����˳� 
		 */
		String name[] = {"��üӥ��", "��ëʨ��","��������" , "��������" };
		int index = -1;
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�������Ҫ�ҵ�����");
		String findname = myScanner.next();
		for(int i = 0;i < name.length;i++){
			if(findname.equals(name[i])){
				System.out.println("��ϲ���ҵ���");
				System.out.println("�±�Ϊ" + i);
				index = 1;
				break;
				
			}
		}
		if(index == -1){
			System.out.println("û���ҵ�");
		}
	}
}