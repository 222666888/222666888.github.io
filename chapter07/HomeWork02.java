import java.util.Scanner;
public class HomeWork02 {
	//��дһ�� main ����
	public static void main(String[] args) {
		String arr1[]= {"��ëʨ��","��������","���ո���","��üӥ��"};
		A02 t = new A02();
		int a = t.find(arr1);
		if(a == 1){
			System.out.println("��ϲ���ҵ���");
		}if(a == -1){
			System.out.println("û����Ҫ��");
		}
	}
}

class A02{
	public int find(String [] arr){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("��������Ҫ������");
		String name = myScanner.next();
		for(int i = 0;i < arr.length;i++ ){
			if(arr[i].equals(name)){
				return 1;
			}
		}
		return -1;
	}
}