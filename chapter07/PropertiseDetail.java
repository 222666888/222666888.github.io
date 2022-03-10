public class PropertiseDetail {
	//编写一个 main 方法
	public static void main(String[] args) {
		//创建Person对象   new Person（）	
		//p1 是对象名
		//new persong（）创建的对象空间（数据）才是真的对象	}
		////int 0，short 0, byte 0, long 0, float 0.0,double 0.0，char \u0000，boolean false，String null;
		Person p1 = new Person();
			//对象的属性默认值，遵守数组规则:
			System.out.println("\n 当前这个人的信息"); 
			System.out.println("age=" + p1.age + " name=" + p1.name + " sal=" + p1.sal + " isPass=" + p1.isPass) ;


	}
}


class Person {
	//
	int age;
	String name;
	double sal;
	boolean isPass;
}