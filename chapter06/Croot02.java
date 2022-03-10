public class Croot02 {
	//编写一个 main 方法
	public static void main(String[] args) {
		int arr1[] = new int[100];
		//(int)(Math.random()*100) + 1; //产生随机数 1- 100
		for(int i = 0;i < arr1.length;i++){
			arr1[i] = (int)(Math.random() * 100) + 1;
		}
		int temp = 0;
		for(int i =0 ; i < arr1.length - 1;i++){
	    	for(int j = 0;j < arr1.length -1 - i ;j++){
		    	if(arr1[j] < arr1[j+1]){
		    		temp = arr1[j+1];
		    		arr1[j+1] = arr1[j];
		    		arr1[j] = temp;
		    	}
	    	}
		}
	
		
		
		int index = -1 
		int sum = 0;
		double average = 0;
		for(int i =0;i < arr1.length;i++){
			System.out.print(arr1[i] + " ");
			sum += arr1[i];
		if(8 == arr1[i]){
			System.out.println("i= " + i);
			index = i;
			}
		if(index == -1){
			System.out.println("没有8这个数字");
		}
		}
			average = sum/100.0;
			System.out.println("\naverage=" + average);
		



		int max =arr1[0];
		int maxIndex = 0;
		for(int i =1 ; i < arr1.length;i++){
			if(max < arr1[i]){
				max = arr1[i];
				maxIndex = i;
			}	
		}
		System.out.println("max=" + max + " " + "maxIndex=" + maxIndex);
	}
}