public class BubbleSort {
	public static void main(String[] args) {
		//����Ϊ���������
		//���� [24,69,80,57,13]
		//�� 1 ������: Ŀ���������������
		//�� 1 �αȽ�[24,69,80,57,13]
	int arr [] = {24,69,80,57,13,8,9,5,200,333};
	int temp = 0;	
	for(int i= 0;i < arr.length - 1;i++){//4���� arr.length - 1
		
		for(int j =0 ;j < arr.length - 1 -i ;j++){
			if(arr[j] > arr[j+1]){
				temp = arr[j+1];
				arr[j+1] = arr[j];
				arr[j] = temp;
			}
		}
	}
	System.out.println("���");
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
// 		System.out.println("��һ��");
// 		for(int j = 0 ;j < arr.length;j++){
// 			System.out.print(arr[j] + "\t");
// 		}
// 		// �� 2 �αȽ�[24,69,80,57,13]
// 		for(int j =0 ;j < 3 ;j++){
// 			if(arr[j] > arr[j+1]){
// 				temp = arr[j+1];
// 				arr[j+1] = arr[j];
// 				arr[j] = temp;
// 			}
// 		}
// 		System.out.println("\n�ڶ���");
// 		for(int j = 0 ;j < arr.length;j++){
// 			System.out.print(arr[j] + "\t");
// 		}	
// 	 	//�� 3 �αȽ�[24,69,57,80,13]
// 			for(int j =0 ;j < 2 ;j++){
// 			if(arr[j] > arr[j+1]){
// 				temp = arr[j+1];
// 				arr[j+1] = arr[j];
// 				arr[j] = temp;
// 			}
// 		}
// 		System.out.println("\n������");
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
// 		System.out.println("\n������");
// 		for(int j = 0 ;j < arr.length;j++){
// 			System.out.print(arr[j] + "\t");
// 		}	
// 	}
// }