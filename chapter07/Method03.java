public class Method03 {
	//编写一个 main 方法
	public static void main(String[] args) {
		int map [][]= {{0,0,1},{0,1,1},{1,1,1},};
		MyTools tool = new MyTools();
		tool.printarr(map);
	}
}


class MyTools{
	public void printarr(int map [][]){
		for(int i = 0;i < map.length;i++){
			for(int j = 0;j< map.length;j++){
				System.out.print(map[i][j] + "\t");
			}
			System.out.println();
		}
	}
}