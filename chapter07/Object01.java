public class Object01 {
	//��дһ�� main ����
	public static void main(String[] args) {

		//ʹ��oop���������
		//ʵ����һֱè
		//1.new cat��������һֻè
		//2.Cat cat1 = new Cat(); �Ѵ�����è����cat 1
		Cat cat1 = new Cat();
		cat1.name = "С��";
		cat1.age = 3;
		cat1.color = "��ɫ";
		cat1.weight = 10;
	System.out.println("�� 1 ֻè��Ϣ" + cat1.name + " " + cat1.age + " " + cat1.color + " " + cat1.weight);
	}
}

class Cat{
	//����/��Ա����/�ֶ�
	String name;//����
	int age;//����
	String color;//field
	double weight;
}