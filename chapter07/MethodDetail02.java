public class MethodDetail02 {
	//��дһ�� main ����
	public static void main(String[] args) {
		A a = new A();
		a.m1();
	}
}
class A {
	//ͬһ�����еķ������ã�ֱ�ӵ��ü���
	//
	public void print(int n){
		System.out.println("n=" + n);
	} 
	public void sayok(){//sayOk ���� print(ֱ�ӵ��ü���
		print(10);
		System.out.println("������");
	}
	public void m1(){
		System.out.println("m1()����������");
		B b = new B();
		b.hi();
		System.out.println("����");
	}
}

class B{
	public void hi(){
		System.out.println("B��hi()��ִ��");
	}
}