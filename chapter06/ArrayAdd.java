import java.util.Scanner;
public class ArrayAdd {
	//��дһ�� main ����
	/*Ҫ��ʵ�ֶ�̬�ĸ��������Ԫ��Ч����ʵ�ֶ��������ݡ�ArrayAdd.java 
	1.ԭʼ����ʹ�þ�̬���� int[] arr = {1,2,3} 
	2.���ӵ�Ԫ�� 4��ֱ�ӷ����������� arr = {1,2,3,4} 
	3.�û�����ͨ�����·����������Ƿ������ӣ���ӳɹ����Ƿ������y/n*/
		// ˼·����
		// 1.�����ʼ���� int [] arr = {1,2,3} 
		// 2.����һ���µ����� int [] arrnew = new int[arr.length+1];
		// 3.����arr���飬���ν�arr��Ԫ�ؿ�����arrnew����
		// 4.��4����arrNew[arrNew.length - 1] = 4;��4����arrNew���һ��Ԫ��
		// 5.��arr ָ�� arrNew ; arr = arrNew����ô ԭ����arr���鱻���٣�
	public static void main(String[] args) {
		int arr[] = {1,2,3};
		//arr[3] = 4;�����϶�����
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�Ƿ�Ҫ���y/n");
		String answer = myScanner.next();
		do{//ѭ��
		if("y".equals(answer)){
		int arrNew[] = new int[arr.length+1];
		for(int i = 0;i < arr.length;i++){
			arrNew[i] = arr[i];
		}
		System.out.println("��������Ҫ��ӵ�����");
		int j = myScanner.nextInt();
		arrNew[arrNew.length - 1] = j;
		arr = arrNew;
		System.out.println("��ӳɹ�");
		for(int i = 0;i < arr.length;i++){
			System.out.println(arr[i] + "\t");
		}
		System.out.println("�Ƿ�������y/n");
		String answer1 = myScanner.next();
		
		if("n".equals(answer1)){
			System.out.println("�˳�");
		break;
		}
		if("n".equals(answer)){
			System.out.println("�˳�");
		break;
		}
		}
	}while(true);
		
	}
}