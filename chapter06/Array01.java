public class Array01 {
	//��дһ�� main ����
	public static void main(String[] args) {
		//˼·����
		//1.����6������double��
		//2.ƽ��=��/6
		//����6�������ܴ�
		//���������ó����飬���ô�ͳ�ķ���
		//���Զ�������
		//1.double[] ��ʾ ��double���͵����飬 ������ hens
		//2.{3, 5, 1, 3.4 ,2 ,50}��ʾ�����ֵ/Ԫ��
		double[] hens = {3, 5, 1, 3.4 ,2 ,50};
		//��������õ����������Ԫ�صĺͣ���forѭ��
		//�Ϻ����
		//1.���ǿ���ͨ��hens[�±�]������Ԫ��
		//�±��0��ʼ��ŵ�һ��Ԫ�ؾ���hens[0] , �ڶ�������hens[1]
		//2.ͨ��for�Ϳ���ѭ������ 
		System.out.println("����ĳ���=" + hens.length );
		double totalWeight = 0;
		for(int i = 0;i < hens.length;i++ ){
			totalWeight += hens[i]; 
		}
		System.out.println("ƽ������=" + (totalWeight/hens.length));
	}
}