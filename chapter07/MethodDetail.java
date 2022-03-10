public class Object02 {
	//编写一个 main 方法
	public static void main(String[] args) {
		AA a = new AA();
		int res [] = a.getSumAndSub(1,4);
		System.out.println(res[0] + "");
		System.out.println(res[1] + "");
	}
}

class AA{
	//1. 一个方法最多有一个返回值 [思考，如何返回多个结果 返回数组 ]
	public int[] getSumAndSub(int n1,int n2){
		int arr1[] = new arr[2];
		arr1[0] = n1 + n2;
		arr2[1] = n1 - n2;
		return arr1;
	}
	//3. 如果方法要求有返回数据类型，则方法体中最后的执行语句必须为 return 值
	//而且要求返回值类型必须和 return 的值类型一致或兼容
	public double[] f1(){
		double d1 = 1.1*3;
		return d1;
	//如果方法是 void，则方法体中可以没有 return 语句，或者 只写 return ; //老韩提示：在实际工作中，我们的方法都是为了完成某个功能，所以方法名要有一定含义
	//最好是见名知意
	}
}