public class HomeWork09 {
	//编写一个 main 方法
	public static void main(String[] args) {
		Music music = new Music("笑傲江淑",300);
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
		System.out.println("音乐" + name + "正在播放时长为" + times + "秒");
	}
	public String getInfo(){
		return "音乐" + name + "播放时间为" + times;
	}
}