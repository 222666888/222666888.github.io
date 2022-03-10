import java.util.Scanner;
public class HomeWork14 {
	//编写一个 main 方法
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int count1 = 0;

		for(int i = 0;i <=2 ;i++ ){
		System.out.println("请输入一个数字0拳头或者1剪刀或者2布");
			int a = myScanner.nextInt();
			int b = (int)(Math.random()*3);
			if(b == 0){
				if(a == 0){
					System.out.println("平局");
				}else if (a == 1){
					System.out.println("胜利");
					count1++;
				}else if(a == 2){
					System.out.println("失败");
				}
			}
			if(b == 1){
				if(a == 0){
					System.out.println("失败");
				}else if (a == 1){
					System.out.println("平局");
				}else if(a == 2){
					System.out.println("胜利");
					count1++;
				}
			}
			if(b == 2){
				if(a == 0){
					System.out.println("失败");
				}else if (a == 1){
					System.out.println("胜利");
					count1++;
				}else if(a == 2){
					System.out.println("平局");
				}
			}
		}
		
	}
}