import java.util.Scanner;
public class Array02 {
	//编写一个 main 方法
	public static void main(String[] args) {
		//演示
		//输入5个成绩，保存到double数组。并输出
		//1.先建立一个double数组
		//double scores[] = new double[5];第一种分配方式
		//2.动态分配如下
		double scores[];//声明一个数组
		scores = new double[5];//动态分配方式	
		Scanner myScanner = new Scanner(System.in);
		for(int i = 0;i < scores.length;i++){
			System.out.println("请输入第" + (i+1) + "个元素的值");
			scores[i] = myScanner.nextDouble();
		}
		//输出遍历数组
		for(int i = 0;i < scores.length;i++){
			System.out.println("第"+ (i+1) + "个元素的值=" + scores[i]);
		}
	}
}