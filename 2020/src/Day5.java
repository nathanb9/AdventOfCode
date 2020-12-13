import java.util.List;

public class Day5 extends FileUtil {
	public static void main(String[] args) {

		List<String>list = loadFile("dataSet4.txt");
		
		
		int largest = 0; 
		int a = 0;

		for(int i = 0; i < list.size();i++) {
			a = solution(list.get(i));
		
			if(a > largest) {
				largest = a; 
			}
			
		}
		
		System.out.println(largest);

	}
	public static int solution(String  barcode) {
		double row = 127;
		double rowmin = 0;
		double col = 8;
		double colmin = 0;
	
		for(int i = 0; i < 7;i++) {
			char curr = barcode.charAt(i);
			
			if(curr=='F') {

				row = Math.ceil((row+rowmin)/2);



			}else {
				rowmin = Math.ceil((row+rowmin)/2);

			}


		}


		for(int j = 7;j<barcode.length();j++) {
			char curr = barcode.charAt(j);
			if(curr=='L') {

				col = Math.ceil((col+colmin)/2);
				


			}else {
				colmin = Math.ceil((col+colmin)/2);
				
			}
		}
		
		return (int)(Math.ceil((rowmin*8)+colmin));

	}


}
