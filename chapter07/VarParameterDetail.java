public class MethodParameter {
	public static void main(String[] args) {

	}
}
class T{
	public void f1(int... nums){
		System.out.println("长度 = " + nums.length);
	}
	public void f2(String... nums ,int... nums){
		////细节: 可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数放到后面、
	}
	public void f3(int... nums ，double ... nums){
		//细节: 一个形参列表中只能出现一个可变参数 //下面的写法是错的
	 	//不能有两个
	}
}