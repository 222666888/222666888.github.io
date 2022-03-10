public class Method01 {
	//簣𦟌𦻕棺𨪜鄞蜆 main 繚翻繚穡
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.speak();
	}
}

class Person{
	String name;
	int age;
	//䙛甄威衛Ⅹ亂
	//1. public 簣穩㧾壇溘蝓溘並𢝵繒竄聶穠
	//2. void 瞿繙 簣穩㧾壇溘蝓溘並罈𥖄𦻕溘肅酵㻊鶥
	//3. speak() : speak 𢝵繚翻繚穡羶瞿竅 () 懚羗笛𦍑𦻕掙
	//4.{} 繚翻繚穡䁱氐竅聶甙𠜎碈𦻕棺𦍑𠜎𨪜秉鶥棺懚𦻕腕織繳禱
	//5.System.out.println("𦍑𠜎𢝵𨪜鄞蜆黑疑"); 簣穩㧾壅𦍑𠜎繕繚翻繚穡職㮼𢝵𢝵刈傢亂𨪜鄞壅刈鄞
	public void speak() {
		System.out.println("𦍑𠜎𢝵𨪜鄞蜆黑疑");
	public void cal01() {
		int res = 0;
		for(int i = 1 ;i <= 1000;i++){
			res += i;
		}
	}
	System.out.println("翹屮翻獺繒羶=" + res);
	}
}