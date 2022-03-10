public class HomeWrok4 {
	//编写一个 main 方法	
	public static void main(String[] args) {
		int arr1[] = {10 ,12 ,45 ,90}; 
		int arr2[] =new int[arr1.length+1];
		for(int i = 0;i < arr1.length;i++){
			arr2[i] = arr1[i];
		}
			arr2[arr1.length] = 23;
			arr1 = arr2;
		for(int i = 0;i < arr2.length;i++){
			System.out.print(arr1[i] + "\t");
		}
	}
}