public class   {

	public static void main(String[] args) {
		Method g = new Method();
		g.m(10);
		g.m(10,20);
		g.m("叭叭叭");
		double a = g.max(20.0,30.0,40);
		System.out.println("max=" + a);
	}
}
class Method{
	public void m(int n1){
		System.out.println("结果=" + n1*n1);
	}
	public void m(int n1,int n2){
		System.out.println("结果=" + n1 * n2);
	}
	public void m(String str){
		System.out.println("结果=" + str );
	}
	public void max(int n1,int n2){
		if(n1 > n2){
			System.out.println("max=" + n1);
		}else{
			System.out.println("max=" + n2);
		}
	}
	
	public void max(double n1,double n2){
		if(n1 > n2){
			System.out.println("max=" + n1);
		}else{
			System.out.println("max=" + n2);
		}
	}
		public double max(double n1,double n2,double n3){
		double max = n1 > n2 ? n1:n2;
		return max > n3 ? max : n3;
		}
		
}