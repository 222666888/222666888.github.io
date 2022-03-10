public class ArrayExercise02 {
	//编写一个 main 方法
	
	public static void main(String[] args) {
		int array[] = {4 ,-1 ,9 ,10 ,23 ,20 ,500, 888};
		int max = array[0];
		int index = 0;
		for(int i =1;i < array.length;i++){
			if(max < array[i]){
				max = array[i];
				index = i;
			}
		}
	  System.out.println("最大值为" + max + "下标为" + index);
	  }
}