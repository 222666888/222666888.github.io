public class Constructor01 {
	//编写一个main主方法
	public static void main(String[] args) {
		Person p1 = new Person("斯密斯",80);
		Person p2 = new Person("tom");
		Dog dog1 = new Dog();
	}
}
class Dog{
	//如果程序员没有定义构造器，系统会自动给类生成一个默认无参构造器(也叫默认构造器) 
	//使用 javap 指令 反编译看看 
	/* 默认构造器 
		Dog() { 
		
		} 
	*/
	public Dog(String dName){
		//...
	}
	Dog(){//显式的定义一下 无参构造

	}
}



class Person{
	//构造器 //老韩解读 
	//第一个构造器
	String name;
	int age;
	public Person(String pName,int pAge){
		name = pName;
		age = pAge;
	}
	//第二个构造器，重载！
	public Person(String pName){
		name = pName;
	}
}