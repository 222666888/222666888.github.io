// import java.util.Scanner;
// public class ArrayReduce {
// 	public static void main(String[] args) {
// 		int arr1[] = {1 ,2 ,3 ,4 ,5 };
// 		int count = 5;
// 		Scanner myScanner = new Scanner(System.in);
// 		do{
// 		System.out.println("�Ƿ�Ҫ����y/n");
// 		String answer = myScanner.next();
// 		if("y".equals(answer)){
// 			int arr2[] = new int[arr1.length-1];
// 			for(int i = 0;i < arr1.length-1;i++){
// 			arr2[i] = arr1[i];
// 			System.out.println(arr2[i] + "");
// 			}
// 			arr1 = arr2;//������ǰ��arr1[]
// 			count--;
// 			System.out.println(count + "");
// 		}
// 		if("n".equals(answer)){
// 			System.out.println("��ѡ���˲�������");
// 			break;
// 		}
// 		if(count == 1){
// 			System.out.println("��Ϊֻʣһ��Ԫ���޷���������");
// 			break;
// 		}
// 		}while(true);
// 	}
// }  �ɹ��ˣ�������������������������