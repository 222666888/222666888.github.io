public class ArrayExercise01 {
	//��дһ�� main ����
	//˼·����
	//1.����һ������ char array[] = new char[26]
	//2.��Ϊ'A' + 1 = 'B'���ƣ�������ʦʹ��for����ֵ
	//3.ʹ��forѭ����������Ԫ��
	public static void main(String[] args) {
		char array[] = new char[26];
		for(int i = 0;i < array.length;i++){
			array[i] = (char)('A' + i);//A + i ��int  Ҫǿת��
			System.out.println(array[i] + "");
		}
	}
}