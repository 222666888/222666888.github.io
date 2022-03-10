public class Method02 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.speak();
		p1.cal01();
		p1.cal02(10);
		p1.cal02(5);	
		int returnres = p1.getsum(10,20);
		System.out.println("getsum=" + returnres);
	}
}

class Person{
	String name;
	int age;
	//
	//1.public ��ʾ�����ǹ���
	//2. void �� ��ʾ����û�з���ֵ
	//3. speak() : speak �Ƿ������� () �β��б�
	//4.{} �����壬����д����Ҫִ�еĴ���
	//5.System.out.println("����һ������"); ��ʾ���ǵķ����������һ�仰
	public void speak() {
		System.out.println("����һ������");
	}

	public void cal01() {
		int res = 0;
		for(int i = 1 ;i <= 1000;i++){
			res += i;
		}
	System.out.println("cal01������=" + res);
	}
	//��� cal02 ��Ա����,�÷������Խ���һ���� n������� 1+..+n �Ľ��
	//1. (int n) �β��б� ��ʾ��ǰ��һ���β� n, ���Խ����û�����
	public void cal02(int n) {
		int res = 0;
		for(int i = 1 ;i <= n;i++){
			res += i;
		}
	System.out.println("cal02������=" + res);
	}
	//1. public ��ʾ�����ǹ�����
	//2. int :��ʾ����ִ�к󣬷���һ�� int ֵ
	//3. getSum ������
	//4. (int num1, int num2) �β��б�2 ���βΣ����Խ����û������������
	//5. return res; ��ʾ�� res ��ֵ�� ���� 
	public int getsum(int num1,int num2) {
		int res = num1 + num2;
		return res;
	}
}

