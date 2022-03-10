public class HomeWork04 {
	//编写一个 main 方法
	public static void main(String[] args) {
		int [] oldArr = {10,30,20};
		A03 t = new A03;
		int [] newArr = t.copyArr(oldArr);

	}
}
class A0{
	public int[] copyArr(int [] oldArr){
		int [] newArr = new int [ oldArr.length];
		for(int i = 0 ;i < oldArr.length;i++){
			newArr[i] = oddArr[i];
		}
		return newArr;
	}
}