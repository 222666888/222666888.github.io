public class Constructor01 {
	//编写一个main主方法
	public static void main(String[] args) {
		Person p1 = new Person("斯密斯",80);
		System.out.println("p1 的信息如下"); 
		System.out.println("p1 对象 name=" + p1.name);//smith 
		System.out.println("p1 对象 age=" + p1.age);//80
	}
}
class Person{
	//构造器 //老韩解读 
	//1. 构造器没有返回值, 也不能写 void
	//2. 构造器的名称和类 Person 一样 
	//3. (String pName, int pAge) 是构造器形参列表，规则和成员方法一样
	String name;
	int age;
	public Person(String pName,int pAge){
		System.out.println("构造器被调用~~ 完成对象的属性初始化");
		name = pName;
		age = pAge;
	}
}