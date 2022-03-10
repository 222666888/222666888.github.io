import java.util.Scanner;
public class HomeWork02 {
	//编写一个 main 方法
	public static void main(String[] args) {
		String arr1[]= {"金毛狮王","紫衫龙王","琴艺父王","白眉鹰王"};
		A02 t = new A02();
		int a = t.find(arr1);
		if(a == 1){
			System.out.println("恭喜你找到了");
		}if(a == -1){
			System.out.println("没有你要的");
		}
	}
}

class A02{
	public int find(String [] arr){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入你要的名字");
		String name = myScanner.next();
		for(int i = 0;i < arr.length;i++ ){
			if(arr[i].equals(name)){
				return 1;
			}
		}
		return -1;
	}
}