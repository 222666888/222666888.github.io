public class ArrayExercise02 {
	//��дһ�� main ����
	
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
	  System.out.println("���ֵΪ" + max + "�±�Ϊ" + index);
	  }
}