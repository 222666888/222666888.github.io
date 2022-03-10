// public class ArrayReverse {
// 	//编写一个 main 方法
// 	public static void main(String[] args) {
// 		int arr1[] = {11,22,33,44,55,66};
// 		int arr2[] = new int[6];
// 		for(int i = 0;i < arr1.length;i++){
// 			arr2[5-i] = arr1[i];
// 		}
// 		for(int i = 0;i < arr2.length;i++){
// 			System.out.println(arr2[i]);
// 		}
// 	}
// }//根的代码
// 
// 
// 
 public class ArrayReverse {
	//编写一个 main 方法
	public static void main(String[] args) {
		//1. 把 arr[0] 和 arr[5] 进行交换 {66,22,33,44,55,11}
		//2. 把 arr[1] 和 arr[4] 进行交换 {66,55,33,44,22,11}
		//3. 把 arr[2] 和 arr[3] 进行交换 {66,55,44,33,22,11}
		//4. 一共要交换 3 次 = arr.length / 2
		//5. 每次交换时，对应的下标 是 arr[i] 和 arr[arr.length - 1 -i]
		//代码 //优化
		int arr[] = {11,22,33,44,55,66};
		int temp = 0;
		int len = arr.length;
		for(int i = 0; i < len;i++){
			temp = arr[len-1 -i];//这个是中间变量
			arr[len-1 -i] = arr[i];
			arr[i] = temp;
		}
	System.out.println("===翻转后数组===");
		for(int i = 0; i < arr.length; i++) {
		 System.out.print(arr[i] + "\t");//66,55,44,33,22,11 
		}
	}
}