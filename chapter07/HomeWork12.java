public class HomeWork09 {
	//编写一个 main 方法
	public static void main(String[] args) {

	}
}
class Employee{
	String name;
	char gender;
	int age;
	String job;
	double sal;
	//先写属性少的构造器！
	public Employee(String job ,double sal){
		this.job = job;
		this.sal = sal;
	}
	public Employee(String name ,char gender,int age){
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public Employee(String name ,char gender,String job ,double sal,,int age){
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.job = job;
		this.sal = sal;
	}
}