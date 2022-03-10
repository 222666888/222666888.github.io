public class MethodDetail02 {
	//编写一个 main 方法
	public static void main(String[] args) {
		A a = new A();
		a.m1();
	}
}
class A {
	//同一个类中的方法调用：直接调用即可
	//
	public void print(int n){
		System.out.println("n=" + n);
	} 
	public void sayok(){//sayOk 调用 print(直接调用即可
		print(10);
		System.out.println("林黛玉");
	}
	public void m1(){
		System.out.println("m1()方法被调用");
		B b = new B();
		b.hi();
		System.out.println("继续");
	}
}

class B{
	public void hi(){
		System.out.println("B类hi()被执行");
	}
}