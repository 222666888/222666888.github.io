public class Object02 {
	//��дһ�� main ����
	public static void main(String[] args) {
		AA a = new AA();
		int res [] = a.getSumAndSub(1,4);
		System.out.println(res[0] + "");
		System.out.println(res[1] + "");
	}
}

class AA{
	//1. һ�����������һ������ֵ [˼������η��ض����� �������� ]
	public int[] getSumAndSub(int n1,int n2){
		int arr1[] = new arr[2];
		arr1[0] = n1 + n2;
		arr2[1] = n1 - n2;
		return arr1;
	}
	//3. �������Ҫ���з����������ͣ��򷽷���������ִ��������Ϊ return ֵ
	//����Ҫ�󷵻�ֵ���ͱ���� return ��ֵ����һ�»����
	public double[] f1(){
		double d1 = 1.1*3;
		return d1;
	//��������� void���򷽷����п���û�� return ��䣬���� ֻд return ; //�Ϻ���ʾ����ʵ�ʹ����У����ǵķ�������Ϊ�����ĳ�����ܣ����Է�����Ҫ��һ������
	//����Ǽ���֪��
	}
}