public class HomeWork09 {
	//��дһ�� main ����
	public static void main(String[] args) {
		Music music = new Music("Ц������",300);
		music.play();
		System.out.println(music.getInfo());
	}
}
class Music{
	String name;
	double times;
	public Music(String name,double times){
		this.name = name;
		this.times = times;
	}
	public void play(){
		System.out.println("����" + name + "���ڲ���ʱ��Ϊ" + times + "��");
	}
	public String getInfo(){
		return "����" + name + "����ʱ��Ϊ" + times;
	}
}