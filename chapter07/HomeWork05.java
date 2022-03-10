public class HomeWork05 {
	//编写一个 main 方法
	public static void main(String[] args) {
		Circle t = new Circle();
		double a = 5;
		System.out.println(t.radius(a));
		System.out.println(t.mianji(a));
		



		Circle t = new Circle(1);
		System.out.println("周长=" + t.len());
		System.out.println("面积=" + t.mianji());
	}
}
class Circle{
	public double radius(double a){
		return 2*a*Math.PI;
	}
	public double mianji(double a){
		return Math.PI*a*a;
	}
}


class Circle{
	double radius;

	public Circle(double radius){
		this.radius = radius;
	}
	public double len(){
		return 2*radius*Math.PI;
	}
	public double mianji(){
		return Math.PI*radius*radius;
	}
}