public class YangHui {
	public static void main(String[] args) {
		boolean bar[]=new boolean[2];
		System.out.println(bar[2] + "");
		}
	}
		/*ʹ�ö�ά�����ӡһ�� 10 ��������� 
			1 
			1 1 
			1 2 1 
			1 3 3 1
			1 4 6 4 1 
			1 5 10 10 5 1
 ����1.��һ���� 1 ��Ԫ��, �� n ���� n ��Ԫ��
  2. ÿһ�еĵ�һ��Ԫ�غ����һ��Ԫ�ض��� 1 
  3. �ӵ����п�ʼ, ���ڷǵ�һ��Ԫ�غ����һ��Ԫ�ص�Ԫ�ص�ֵ. 
  arr[i][j] arr[i][j] = arr[i-1][j] + arr[i-1][j-1]; 
//�����ҵ�������� */
// 		int yanghui[][]=new int[10][];
// 		//��ÿһ��һά���飨�У����ռ�
// 		for(int i = 0;i < yanghui.length;i++){
// 			yanghui[i] = new int [i + 1];
// 			for(int j = 0;j < yanghui[i].length;j++){
// 				if(j==0 || j == yanghui[i].length-1){
// 					yanghui[i][j] = 1;
// 				}else{
// 					yanghui[i][j] = yanghui[i-1][j] + yanghui[i-1][j-1];
// 				}
// 			}
// 		}
// 		for(int i = 0; i < yanghui.length; i++) {
// 		  for(int j = 0; j < yanghui[i].length; j++) {
// 		  //����������� 
// 		  System.out.print(yanghui[i][j] + "\t"); 
// 		  }
// 		  System.out.println();//����. 
// 		}
// 	}
// }