// import java.util.Scanner;
// public class ArrayReduce {
// 	public static void main(String[] args) {
// 		int arr1[] = {1 ,2 ,3 ,4 ,5 };
// 		int count = 5;
// 		Scanner myScanner = new Scanner(System.in);
// 		do{
// 		System.out.println("是否要缩减y/n");
// 		String answer = myScanner.next();
// 		if("y".equals(answer)){
// 			int arr2[] = new int[arr1.length-1];
// 			for(int i = 0;i < arr1.length-1;i++){
// 			arr2[i] = arr1[i];
// 			System.out.println(arr2[i] + "");
// 			}
// 			arr1 = arr2;//消除以前的arr1[]
// 			count--;
// 			System.out.println(count + "");
// 		}
// 		if("n".equals(answer)){
// 			System.out.println("你选择了不用缩减");
// 			break;
// 		}
// 		if(count == 1){
// 			System.out.println("因为只剩一个元素无法继续缩减");
// 			break;
// 		}
// 		}while(true);
// 	}
// }  成功了！！！！！！！！！！！！！