public class MethodParameterExercise {
	public static void main(String[] args) {
		HspMethod a = new HspMethod();
		a.showScore1("陈根",10,20,60);
	}
}
class HspMethod{
	public void showScore1(String name,int... num1){
		int sum = 0;//或者遍历成绩用for循环
		for(int i = 0;i < num1.length;i++){
			sum += num1[i];
		}
		System.out.println("你的姓名为" + name + "\n成绩=" + sum);
	}
}