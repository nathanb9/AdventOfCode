import java.util.List;

public class Day3A extends Day3{
	public static void main(String[] args) {
		List<String> list = loadFile("dataSet2.txt");
		System.out.println("Second solution : "+solution(1,1,list)*solution(3,1,list)*solution(5,1,list)*solution(7,1,list)*solution(1,2,list));
	}
	
}