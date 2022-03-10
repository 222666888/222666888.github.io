public class HomeWork06 {
	//编写一个 main 方法
	public static void main(String[] args) {
		Cale a = new Cale(3.5,0);
		System.out.println(a.plus());System.out.println(a.subtract());
		System.out.println(a.multiply());System.out.println(a.divive());
		
	}
}
class Cale{
	double a;
	double b;
	public Cale(double a,double b){
		this.a = a;
		this.b = b;
	}
	public double plus(){
		return a + b;
	}
	public double subtract(){
		return a - b;
	}
	public double multiply(){
		return a * b;
	}
	public Double divive(){
		if(b == 0){
			System.out.println("不能为空");
			return null;
		}
		return a / b;
	}
}