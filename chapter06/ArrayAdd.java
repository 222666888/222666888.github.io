import java.util.Scanner;
public class ArrayAdd {
	//编写一个 main 方法
	/*要求：实现动态的给数组添加元素效果，实现对数组扩容。ArrayAdd.java 
	1.原始数组使用静态分配 int[] arr = {1,2,3} 
	2.增加的元素 4，直接放在数组的最后 arr = {1,2,3,4} 
	3.用户可以通过如下方法来决定是否继续添加，添加成功，是否继续？y/n*/
		// 思路分析
		// 1.定义初始数组 int [] arr = {1,2,3} 
		// 2.定义一个新的数组 int [] arrnew = new int[arr.length+1];
		// 3.遍历arr数组，依次将arr的元素拷贝到arrnew数组
		// 4.将4赋给arrNew[arrNew.length - 1] = 4;把4赋给arrNew最后一个元素
		// 5.让arr 指向 arrNew ; arr = arrNew；那么 原来的arr数组被销毁！
	public static void main(String[] args) {
		int arr[] = {1,2,3};
		//arr[3] = 4;这样肯定不行
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("是否要添加y/n");
		String answer = myScanner.next();
		do{//循环
		if("y".equals(answer)){
		int arrNew[] = new int[arr.length+1];
		for(int i = 0;i < arr.length;i++){
			arrNew[i] = arr[i];
		}
		System.out.println("请输入你要添加的数字");
		int j = myScanner.nextInt();
		arrNew[arrNew.length - 1] = j;
		arr = arrNew;
		System.out.println("添加成功");
		for(int i = 0;i < arr.length;i++){
			System.out.println(arr[i] + "\t");
		}
		System.out.println("是否继续添加y/n");
		String answer1 = myScanner.next();
		
		if("n".equals(answer1)){
			System.out.println("退出");
		break;
		}
		if("n".equals(answer)){
			System.out.println("退出");
		break;
		}
		}
	}while(true);
		
	}
}