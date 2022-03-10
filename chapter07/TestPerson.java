public class TestPerson {
	public static void main(String[] args) {
		// 定义 Person 类，里面有 name、age 属性，
		// 并提供 compareTo 比较方法，用于判断是否和另一个人相等，提供测试类 TestPerson 用于测试, 
		// 名字和年龄完全一样，就返回 true, 否则返回 false
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