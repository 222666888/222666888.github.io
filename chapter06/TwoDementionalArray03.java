public class TwoDementionalArray03 {
	public static void main(String[] args) {
		//���� ��ά���飬һ���� 3 ��һά���飬����ÿ��һά���黹û�п����ݿռ�
		int arr[][] = new int[10][];
		for(int i = 0;i < arr.length ;i++){
			//��ÿ��һά���鿪�ռ� new
			//���û�и�һά���� new ,��ô arr[i]���� null
			arr[i] = new int[i + 1];
			//����һά���飬����һά�����ÿ��Ԫ�ظ�ֵ
			for(int j = 0; j < arr[i].length;j++){
				arr[i][j] = i + 1;
			}
		}
		System.out.println("=====arr Ԫ��=====");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " "); 
			}
			System.out.println();//����
		}
	}
}