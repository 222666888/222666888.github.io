public class VarScopeDetail {
	public static void main(String[] args) {

	}
}
class T{
	public T(){
		this("jack",100);
		System.out.println(" ");
	}
	public T(String name ,int age){
		System.out.println(" 用了T（String）这个构造器");
	}
	public void f1(){
		System.out.println("f1() 方法");
	}
	public void f2(){
		System.out.println("f1() 方法");
		//第一种
		f1();
		//第二种
		this.f1();
	}

}