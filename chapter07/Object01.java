public class Object01 {
	//编写一个 main 方法
	public static void main(String[] args) {

		//使用oop面向对象解决
		//实例化一直猫
		//1.new cat（）创建一只猫
		//2.Cat cat1 = new Cat(); 把创建的猫赋给cat 1
		Cat cat1 = new Cat();
		cat1.name = "小白";
		cat1.age = 3;
		cat1.color = "白色";
		cat1.weight = 10;
	System.out.println("第 1 只猫信息" + cat1.name + " " + cat1.age + " " + cat1.color + " " + cat1.weight);
	}
}

class Cat{
	//属性/成员变量/字段
	String name;//名字
	int age;//属性
	String color;//field
	double weight;
}