public class TestPerson {
	public static void main(String[] args) {
		// ���� Person �࣬������ name��age ���ԣ�
		// ���ṩ compareTo �ȽϷ����������ж��Ƿ����һ������ȣ��ṩ������ TestPerson ���ڲ���, 
		// ���ֺ�������ȫһ�����ͷ��� true, ���򷵻� false
		Person p1 = new Person("chengen",24);
		Person p2 = new Person("chengen",24);
		boolean a = p1.compareTo(p2);
		System.out.println("a=" + a);
	}
}
class Person{
	int age;
	String name;
	public Person(String name,int age){
		this.age = age;
		this.name = name;
	}
	public boolean compareTo(Person p){
		return this.name.equals(p.name) && this.age == p.age;
	}
}