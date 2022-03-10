public class MethodExercise01 {
	//±àÐ´Ò»¸ö main ·½·¨
	public static void main(String[] args) {
		AA a = new AA();
		// if(a.isodd(2)){
		// 	System.out.println("ÊÇÆæÊý");
		// }else{
		// 	System.out.println("ÊÇÅ¼Êý");
		// }
 		a.print(10,4,'*');
	}
}
//±àÐ´Àà AA £¬ÓÐÒ»¸ö·½·¨£ºÅÐ¶ÏÒ»¸öÊýÊÇÆæÊý odd »¹ÊÇÅ¼Êý, ·µ»Ø boolean
class AA{
	//1. ·½·¨µÄ·µ»ØÀàÐÍ boolean
	//2. ·½·¨µÄÃû×Ö isodd
	//3. ·½·¨µÄÐÎ²Î (int num)
	//4. ·½·¨Ìå , ÅÐ¶Ï
	public boolean isodd(int num){
		return num%2 != 0;
	}
	

	//1. ·½·¨µÄ·µ»ØÀàÐÍ void
	//2. ·½·¨µÄÃû×Ö print
	//3. ·½·¨µÄÐÎ²Î (int row,int colunm,char c)
	//4. ·½·¨Ìå , Ñ­»·
	public void print(int row,int col,char c){
		for(int i =0;i < row;i++ ){
			for(int j = 0;j < col;j++){
				System.out.print(c);
			}
			System.out.println();
		}
	}
}