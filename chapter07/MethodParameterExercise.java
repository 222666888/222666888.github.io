public class MethodParameterExercise {
	public static void main(String[] args) {
		HspMethod a = new HspMethod();
		a.showScore1("�¸�",10,20,60);
	}
}
class HspMethod{
	public void showScore1(String name,int... num1){
		int sum = 0;//���߱����ɼ���forѭ��
		for(int i = 0;i < num1.length;i++){
			sum += num1[i];
		}
		System.out.println("�������Ϊ" + name + "\n�ɼ�=" + sum);
	}
}