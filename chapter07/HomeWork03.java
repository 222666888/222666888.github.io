import java.util.Scanner;
public class HomeWork03 {
	//编写一个 main 方法
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入书的价格");
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
			System.out.println("此书价格改为150");
		}else if(a < 150 && a >= 100){
			a = 150;
			System.out.println("此书价格改为100");
		}else{
			System.out.println("此书价格不变");
		}
	}
}