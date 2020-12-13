
import java.util.ArrayList;
import java.util.List;
import java.util.List;


public class Day3 extends FileUtil{

	public static void main(String[] args) {
		
		
		List<String> list = loadFile("dataSet2.txt");
		System.out.println("First solution : "+ solution(3,1,list));
		
		
		
	}
public static int solution(int xSlope, int ySlope, List<String>list) {
	char[][]grid = toCharGrid(list);
	
	for(int i = 0; i < list.size();i++) {
		String currLine = list.get(i);
		char[] listofchars = currLine.toCharArray();
		for(int s = 0; s < listofchars.length; s++) {
			grid[i][s]=listofchars[s];
		}
	}
	int x = 0; 
	int y = 0;
	
	int treecount = 0; 
	while(y<323) {
		
		if(grid[y][x]=='#') {
			treecount++;
		}
		x = (x+xSlope)%31;
		y +=ySlope;
	}
	return treecount;
}
}
