public class Array01 {
	//编写一个 main 方法
	public static void main(String[] args) {
		//思路分析
		//1.定义6个变量double，
		//2.平均=总/6
		//定义6个变量很蠢
		//所以因引用出数组，不用传统的方法
		//所以定义数组
		//1.double[] 表示 是double类型的数组， 数组名 hens
		//2.{3, 5, 1, 3.4 ,2 ,50}表示数组的值/元素
		double[] hens = {3, 5, 1, 3.4 ,2 ,50};
		//遍历数组得到数组的所有元素的和，用for循环
		//老韩解读
		//1.我们可以通过hens[下标]来访问元素
		//下标从0开始编号第一个元素就是hens[0] , 第二个就是hens[1]
		//2.通过for就可以循环访问 
		System.out.println("数组的长度=" + hens.length );
		double totalWeight = 0;
		for(int i = 0;i < hens.length;i++ ){
			totalWeight += hens[i]; 
		}
		System.out.println("平均体重=" + (totalWeight/hens.length));
	}
}