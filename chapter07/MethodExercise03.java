public class MethodExercise03 {
	public static void main(String[] args) {
		//1) 编写类 MyTools 类，编写一个方法可以打印二维数组的数据。
		//2) 编写一个方法 copyPerson，可以复制一个 Person 对象，返回复制的对象。
		//克隆对象， 注意要求得到新对象和原来的 对象是两个独立的对象，只是他们的属性相同
	Person p = new Person();
	p.name = "jack";
	p.age = 50;

	Mytools tools = new Mytools();
	Person p2 = tools.copyPerson(p);
	System.out.println(p == p2);
	}
}
class Person{
	String name;
	int age;

}

class Mytools{
	//编写方法的思路 
	//1. 方法的返回类型 Person
	//2. 方法的名字 copyPerson 
	//3. 方法的形参 (Person p) 
	//4. 方法体, 创建一个新对象，并复制属性，返回即可
	public Person copyPerson(Person p){
		Person p2 = new Person();
		p2.name = p.name;
		p2.age = p.age; 
		return p2;
	}
}