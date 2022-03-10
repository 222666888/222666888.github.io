public class BubbleSort {
	public static void main(String[] args) {
		//化繁为简，先死后活
		//数组 [24,69,80,57,13]
		//第 1 轮排序: 目标把最大数放在最后
		//第 1 次比较[24,69,80,57,13]
	int arr [] = {24,69,80,57,13,8,9,5,200,333};
	int temp = 0;	
	for(int i= 0;i < arr.length - 1;i++){//4等于 arr.length - 1
		
		for(int j =0 ;j < arr.length - 1 -i ;j++){
			if(arr[j] > arr[j+1]){
				temp = arr[j+1];
				arr[j+1] = arr[j];
				arr[j] = temp;
			}
		}
	}
	System.out.println("最后");
		for(int j = 0 ;j < arr.length;j++){
			System.out.print(arr[j] + "\t");
		}
	
	}
}















		// int arr [] = {24,69,80,57,13};
		// int temp = 0;	
		// for(int j =0 ;j < 4 ;j++){
		// 	if(arr[j] > arr[j+1]){
		// 		temp = arr[j+1];
		// 		arr[j+1] = arr[j];
		// 		arr[j] = temp;
		// 	}
		// }
// 		System.out.println("第一轮");
// 		for(int j = 0 ;j < arr.length;j++){
// 			System.out.print(arr[j] + "\t");
// 		}
// 		// 第 2 次比较[24,69,80,57,13]
// 		for(int j =0 ;j < 3 ;j++){
// 			if(arr[j] > arr[j+1]){
// 				temp = arr[j+1];
// 				arr[j+1] = arr[j];
// 				arr[j] = temp;
// 			}
// 		}
// 		System.out.println("\n第二轮");
// 		for(int j = 0 ;j < arr.length;j++){
// 			System.out.print(arr[j] + "\t");
// 		}	
// 	 	//第 3 次比较[24,69,57,80,13]
// 			for(int j =0 ;j < 2 ;j++){
// 			if(arr[j] > arr[j+1]){
// 				temp = arr[j+1];
// 				arr[j+1] = arr[j];
// 				arr[j] = temp;
// 			}
// 		}
// 		System.out.println("\n第三轮");
// 		for(int j = 0 ;j < arr.length;j++){
// 			System.out.print(arr[j] + "\t");
// 		}	
// 			for(int j =0 ;j < 1 ;j++){
// 			if(arr[j] > arr[j+1]){
// 				temp = arr[j+1];
// 				arr[j+1] = arr[j];
// 				arr[j] = temp;
// 			}
// 		}
// 		System.out.println("\n第四轮");
// 		for(int j = 0 ;j < arr.length;j++){
// 			System.out.print(arr[j] + "\t");
// 		}	
// 	}
// }