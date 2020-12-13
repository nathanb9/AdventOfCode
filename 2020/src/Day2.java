//COMPLETED DAY2 PART1(EZ)
import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.ArrayList;
import java.util.Scanner;

public class Day2 extends FileUtil{
	public static void main(String[] args) {
		ArrayList<String>list = new ArrayList<String>();
		int validCount = 0; 
		
		try {
			File reader = new File("dataSet1.txt");
			Scanner myReader = new Scanner(reader);
			
			while(myReader.hasNextLine()) {
				Boolean valid = false;
				String data = myReader.nextLine();
				String[]split = data.split(" ");
				//RANGE SPLIT
				String[]split1=split[0].split("-");
				int min = Integer.parseInt(split1[0]);
				int max = Integer.parseInt(split1[1]);
				// SPLIT for character
				String[]split2=split[1].split(":");
				char target = split[1].charAt(0);
				//PASSWORD SPLIT
				String[] password = split[2].split("");
				int count = 0;
				for(int i = 0; i < password.length;i++) {
					if(password[i].charAt(0) == target) {
						count++;
					}
				}
				System.out.print(data);
				if(count >= min && count <= max) {
					validCount++; 
					valid = true;
					System.out.print(" ** VALID **");
				}
				System.out.println();
			}
			System.out.println(validCount);
			myReader.close();
		}catch(FileNotFoundException e ) {
			System.out.println("You got no file bud");
			e.printStackTrace();
		}

	}
}