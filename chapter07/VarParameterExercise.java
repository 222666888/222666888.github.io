public class MethodParameterExercise {
	public static void main(String[] args) {
		HspMethod a = new HspMethod();
		a.showScore1("�¸�",10,20);
	}
}
class HspMethod{
	public void showScore1(String name,int... num1){
		int sum = num1[0] + num1[2];//���߱����ɼ���forѭ��
		System.out.println("�������Ϊ" + name + "\n�ɼ�=" + sum);
	}
}