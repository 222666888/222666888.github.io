public class MethodParameter {
	public static void main(String[] args) {

	}
}
class T{
	public void f1(int... nums){
		System.out.println("���� = " + nums.length);
	}
	public void f2(String... nums ,int... nums){
		////ϸ��: �ɱ�������Ժ���ͨ���͵Ĳ���һ������β��б������뱣֤�ɱ�����ŵ����桢
	}
	public void f3(int... nums ��double ... nums){
		//ϸ��: һ���β��б���ֻ�ܳ���һ���ɱ���� //�����д���Ǵ��
	 	//����������
	}
}