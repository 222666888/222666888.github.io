public class MethodParameterExercise {
	public static void main(String[] args) {
		HspMethod a = new HspMethod();
		a.showScore1("陈根",10,20);
	}
}
class HspMethod{
	public void showScore1(String name,int... num1){
		int sum = num1[0] + num1[2];//或者遍历成绩用for循环
		System.out.println("你的姓名为" + name + "\n成绩=" + sum);
	}
}