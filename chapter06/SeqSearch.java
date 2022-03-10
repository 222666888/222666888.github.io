import java.util.Scanner;
public class SeqSearch {
	public static void main(String[] args) {
		/*有一个数列：白眉鹰王、金毛狮王、紫衫龙王、青翼蝠王猜数游戏：
		 从键盘中任意输入一个名称，判断数列中是否包含此名称【顺序查找】 要
		 求: 如果找到了，就提示找到，并给出下标值 思路分析 
		 1. 定义一个字符串数组
		 2. 接收用户输入, 遍历数组，逐一比较，如果有，则提示信息，并退出 
		 */
		String name[] = {"白眉鹰王", "金毛狮王","紫衫龙王" , "青翼蝠王" };
		int index = -1;
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输出你要找的名字");
		String findname = myScanner.next();
		for(int i = 0;i < name.length;i++){
			if(findname.equals(name[i])){
				System.out.println("恭喜你找到了");
				System.out.println("下标为" + i);
				index = 1;
				break;
				
			}
		}
		if(index == -1){
			System.out.println("没有找到");
		}
	}
}