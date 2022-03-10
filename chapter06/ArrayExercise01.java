public class ArrayExercise01 {
	//编写一个 main 方法
	//思路分析
	//1.定义一个数组 char array[] = new char[26]
	//2.因为'A' + 1 = 'B'类推，所以老师使用for来赋值
	//3.使用for循环访问所有元素
	public static void main(String[] args) {
		char array[] = new char[26];
		for(int i = 0;i < array.length;i++){
			array[i] = (char)('A' + i);//A + i 是int  要强转！
			System.out.println(array[i] + "");
		}
	}
}