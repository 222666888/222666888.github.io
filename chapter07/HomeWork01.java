public class HomeWork01 {
	//��дһ�� main ����
	public static void main(String[] args) {
		double [] arr1= {};
		A01 a = new A01();
		Double b = a.max(arr1);
		if(b != null){
			System.out.print("max=" + b);
	
		}else{
			System.out.print("�����������");
		}
	}
}
class A01{
	public Double max(double [] arr){
	if(arr.length == 0 && arr == null){
		return null;
	}
	double temp = 0.0;	
	for(int i= 0;i < arr.length - 1;i++){//4���� arr.length - 1
		
		for(int j =0 ;j < arr.length - 1 -i ;j++){
			if(arr[j] > arr[j+1]){
				temp = arr[j+1];
				arr[j+1] = arr[j];
				arr[j] = temp;
			}
		}
	}
	return arr[arr.length - 1];
	
	//����2
	// double max = arr[0];//�ٶ���һ��Ԫ�ؾ������ֵ
	// 	for(int i = 1;i < arr.length;i++){
	// 		if(max < arr[i]){
	// 			max = arr[i];
	// 		}
	// 	}
	// 	return max;

	} 
}