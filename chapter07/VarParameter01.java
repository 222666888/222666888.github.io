public class VarParameter01{
	public static void main(String[] args) {
		HspMethod a = new HspMethod();
		int b = a.sum(1,5,100);
		System.out.println("b=" + b);
	}
}
class HspMethod{
	public int sum(int... nums){
		int res = 0;
		for(int i = 0;i < nums.length ;i++ ){
		res += nums[i];
	}
		return res;
		}
}