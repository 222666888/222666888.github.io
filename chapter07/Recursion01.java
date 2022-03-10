import java.util.Scanner;
public class Recursion01 {
	public static void main(String[] args) {
		// T t = new T();
		// Scanner myScanner = new Scanner(System.in);
		// System.out.println("请输入你要的数字");
		// int i = myScanner.nextInt();
		// int a = t.fibonacci(i);
		// System.out.println("a=" + a);
	G g = new G();
	int a = g.monkey(1);
	System.out.println("a=" + a);

	}
}
class T{
	/*请使用递归的方式求出斐波那契数 1,1,2,3,5,8,13...给你一个整数 n，求出它的值是多 
	思路分析
	 1. 当 n = 1 斐波那契数 是 1 
	 2. 当 n = 2 斐波那契数 是 1 
	 3. 当 n >= 3 斐波那契数 是前两个数的和 
	 4. 这里就是一个递归的思路 */
	 public int fibonacci(int n){
	 	if(n ==1 || n == 2){
	 		return 1;
	 	}
	 	else if(n>=3){
	 		return fibonacci(n-1)+fibonacci(n-2);
	 	}else{
	 		System.out.println("你输出的数字有问题");
	 		return -1;
	 	}
	 
	 }
}

/*猴子吃桃子问题：有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！ 
以后每天猴子都吃其中的一半，然后再多吃一个。
当到第 10 天时， 想再吃时（即还没吃），
发现只有 1 个桃子了
。问题：最初共多少个桃子？ 思路分析 逆推

 */
class G{
	public int monkey(int n){
		if(n == 10){
			return 1;
		}
		if(n <= 9 && n >=1){
			return (monkey(n+1) + 1)*2;
		}
		return -1;
	}
}