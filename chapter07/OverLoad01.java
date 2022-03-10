public class MethodExercise01 {

	public static void main(String[] args) {
	MyCalculator mc = new MyCalculator();
	System.out.println(my.calculator(1 , 2));//看符合那个就用那个！
	}
}
class MyCalculator {
	pubulic int calculator(int n1, int n2){
		return n1 + n2;
	}
	pubulic int calculator(int n1, double n2){
		return n1 + n2;
	}
	pubulic int calculator(double n1, int n2){
		return n1 + n2;
	}
	pubulic int calculator(int n1, int n2 , int n3){
		return n1 + n2 + n3;
	}
}