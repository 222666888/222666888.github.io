public class factorial {
	public static void main(String[] args) {
		T t1 = new T();
		int a = t1.test(4);
	}
}


class T{
	public int test(int n){
		if( n == 1){
			return 1;
	
		}else{
			return test(n - 1) + test (n - 2)
		}


}