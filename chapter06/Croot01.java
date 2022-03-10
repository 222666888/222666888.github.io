public class Croot01 {
	//编写一个 main 方法
	public static void main(String[] args) {
		int arr1[] = {10 ,12 ,45 ,90}; 
		int arr2[] =new int[arr1.length+1];
		for(int i = 0;i < arr1.length;i++){
			arr2[i] = arr1[i];
		}
			arr2[arr1.length] = 23;
			arr1 = arr2;
			int temp = 0;
		for(int i =0 ; i < arr1.length - 1;i++){
	    	for(int j = 0;j < arr1.length -1 - i ;j++){
		    	if(arr1[j] > arr1[j+1]){
		    		temp = arr1[j+1];
		    		arr1[j+1] = arr1[j];
		    		arr1[j] = temp;
		    	}
	    	}
		}
		for(int i =0;i < arr1.length;i++){
			System.out.print(arr1[i] + " ");
		}
	}
}
//老师的代码和我不一样