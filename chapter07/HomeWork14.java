import java.util.Scanner;
public class HomeWork14 {
	//��дһ�� main ����
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int count1 = 0;

		for(int i = 0;i <=2 ;i++ ){
		System.out.println("������һ������0ȭͷ����1��������2��");
			int a = myScanner.nextInt();
			int b = (int)(Math.random()*3);
			if(b == 0){
				if(a == 0){
					System.out.println("ƽ��");
				}else if (a == 1){
					System.out.println("ʤ��");
					count1++;
				}else if(a == 2){
					System.out.println("ʧ��");
				}
			}
			if(b == 1){
				if(a == 0){
					System.out.println("ʧ��");
				}else if (a == 1){
					System.out.println("ƽ��");
				}else if(a == 2){
					System.out.println("ʤ��");
					count1++;
				}
			}
			if(b == 2){
				if(a == 0){
					System.out.println("ʧ��");
				}else if (a == 1){
					System.out.println("ʤ��");
					count1++;
				}else if(a == 2){
					System.out.println("ƽ��");
				}
			}
		}
		
	}
}