public class YangHui {
	public static void main(String[] args) {
		boolean bar[]=new boolean[2];
		System.out.println(bar[2] + "");
		}
	}
		/*使用二维数组打印一个 10 行杨辉三角 
			1 
			1 1 
			1 2 1 
			1 3 3 1
			1 4 6 4 1 
			1 5 10 10 5 1
 规律1.第一行有 1 个元素, 第 n 行有 n 个元素
  2. 每一行的第一个元素和最后一个元素都是 1 
  3. 从第三行开始, 对于非第一个元素和最后一个元素的元素的值. 
  arr[i][j] arr[i][j] = arr[i-1][j] + arr[i-1][j-1]; 
//必须找到这个规律 */
// 		int yanghui[][]=new int[10][];
// 		//给每一个一维数组（行）开空间
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
// 		  //遍历输出该行 
// 		  System.out.print(yanghui[i][j] + "\t"); 
// 		  }
// 		  System.out.println();//换行. 
// 		}
// 	}
// }