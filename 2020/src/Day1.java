//Day 1 COMPLETE(EZ)
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

public class Day1{
	public static void main(String[] args) {
		int[]ds = new int[200];
		int count = 0; 
		try {
			File reader = new File("dataSet.txt");
			Scanner myReader = new Scanner(reader);
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				int value = Integer.parseInt(data);
				ds[count]=value;
				count++;
			}
			myReader.close();
		}catch(FileNotFoundException e ) {
			System.out.println("You got no file bud");
			e.printStackTrace();
		}
		getTarget(ds,2020);

	}	
	public static void getTarget(int[] list,int target) {
		for(int i = 0; i < list.length;i++) {
			for(int j = 0;  j <list.length;j++) {
				for(int d = 0;  d <list.length;d++) {
					if((list[i]+list[j]+list[d])==target){
						System.out.println(list[j]+"+"+list[i] +"+"+list[d]+" = 2020");
						System.out.println(list[j]*list[i]*list[d]);
						//System.exit(0);
					}
				}
			}
		}
	}
}