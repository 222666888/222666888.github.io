public class HomeWork09 {
	//��дһ�� main ����
	public static void main(String[] args) {

	}
}
class Employee{
	String name;
	char gender;
	int age;
	String job;
	double sal;
	//��д�����ٵĹ�������
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