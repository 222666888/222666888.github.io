import java.util.Scanner;
public class Recursion01 {
	public static void main(String[] args) {
		// T t = new T();
		// Scanner myScanner = new Scanner(System.in);
		// System.out.println("��������Ҫ������");
		// int i = myScanner.nextInt();
		// int a = t.fibonacci(i);
		// System.out.println("a=" + a);
	G g = new G();
	int a = g.monkey(1);
	System.out.println("a=" + a);

	}
}
class T{
	/*��ʹ�õݹ�ķ�ʽ���쳲������� 1,1,2,3,5,8,13...����һ������ n���������ֵ�Ƕ� 
	˼·����
	 1. �� n = 1 쳲������� �� 1 
	 2. �� n = 2 쳲������� �� 1 
	 3. �� n >= 3 쳲������� ��ǰ�������ĺ� 
	 4. �������һ���ݹ��˼· */
	 public int fibonacci(int n){
	 	if(n ==1 || n == 2){
	 		return 1;
	 	}
	 	else if(n>=3){
	 		return fibonacci(n-1)+fibonacci(n-2);
	 	}else{
	 		System.out.println("�����������������");
	 		return -1;
	 	}
	 
	 }
}

/*���ӳ��������⣺��һ�����ӣ����ӵ�һ��������е�һ�룬���ٶ����һ���� 
�Ժ�ÿ����Ӷ������е�һ�룬Ȼ���ٶ��һ����
������ 10 ��ʱ�� ���ٳ�ʱ������û�ԣ���
����ֻ�� 1 ��������
�����⣺��������ٸ����ӣ� ˼·���� ����

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