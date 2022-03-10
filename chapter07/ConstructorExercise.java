public class Constructor01 {
	//编写一个main主方法
	public static void main(String[] args) {
		Person p1 = new Person();//无参构造器'
		//下面输出 name = null, age = 18
		System.out.println("p1 的信息 name=" + p1.name + " age=" + p1.age);

		Person p2 = new Person("scott", 50);
		//下面输出 name = scott, age = 50
		System.out.println("p2 的信息 name=" + p2.name + " age=" + p2.age);
	}
}

class Person{//构造器
	int age;
	String name;
	public Person(){
		int age = 18;
	}
	public Person(String pName, int pAge){
		name = pName;
		age = pAge;
	}
}