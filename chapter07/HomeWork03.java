import java.util.Scanner;
public class HomeWork03 {
	//��дһ�� main ����
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("��������ļ۸�");
		int price = myScanner.nextInt();
		Book t1 = new Book();
		t1.updatePrice(price);
	
	}
}
class Book{
	String name;
	double price;
	public Book(String name,double price){
		this.name = name;
		this.price = price;
	}
	public void updatePrice(){
		if(this.price > 150){
			this.price= 150
		}else if(this.price > 100){
			this.price = 100;
		}
	}

}



class Book{
	public void updatePrice(double a){
		if(a >= 150){
			a = 150;
			System.out.println("����۸��Ϊ150");
		}else if(a < 150 && a >= 100){
			a = 150;
			System.out.println("����۸��Ϊ100");
		}else{
			System.out.println("����۸񲻱�");
		}
	}
}