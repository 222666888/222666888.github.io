import java.util.Scanner;
public class Array02 {
	//��дһ�� main ����
	public static void main(String[] args) {
		//��ʾ
		//����5���ɼ������浽double���顣�����
		//1.�Ƚ���һ��double����
		//double scores[] = new double[5];��һ�ַ��䷽ʽ
		//2.��̬��������
		double scores[];//����һ������
		scores = new double[5];//��̬���䷽ʽ	
		Scanner myScanner = new Scanner(System.in);
		for(int i = 0;i < scores.length;i++){
			System.out.println("�������" + (i+1) + "��Ԫ�ص�ֵ");
			scores[i] = myScanner.nextDouble();
		}
		//�����������
		for(int i = 0;i < scores.length;i++){
			System.out.println("��"+ (i+1) + "��Ԫ�ص�ֵ=" + scores[i]);
		}
	}
}