import java.util.List;

public class Day4 extends FileUtil{

	public static boolean checkIfValid(String password) {
		System.out.println(password);
		if(password.contains("byr")&&password.contains("iyr")&&password.contains("eyr")&&password.contains("hgt")&&password.contains("hcl")&&password.contains("ecl")&&password.contains("pid")) {
			System.out.println("valid");
			return true;


		}else {
			System.out.println("invalid");
			return false;
		}

	}

	public static boolean checkIfValid2(String password) {
		if(!checkIfValid(password)){
			return false;
		}
		String[]test1 = password.split(" ");

		for(int i = 0; i < password.length();i++) {
			try {
				if(test1[i].charAt(0)=='b') {
					int birthday = Integer.parseInt(test1[i].substring(test1[i].indexOf(':')+1));
					if(birthday<1000 || birthday>1920||birthday<2002) {
						return false;
					}
				}
				if(test1[i].charAt(0)=='i') {
					int birthday = Integer.parseInt(test1[i].substring(test1[i].indexOf(':')+1));
					if(birthday<1000 || birthday>2010||birthday<2020) {
						return false;
					}
				}
				if(test1[i].charAt(0)=='e'&&test1[i].charAt(1)=='y') {
					int birthday = Integer.parseInt(test1[i].substring(test1[i].indexOf(':')+1));
					if(birthday<1000 || birthday>2020||birthday<2030) {
						return false;
					}
				}
				if(test1[i].charAt(0)=='h'&&test1[i].charAt(1)=='g') {
					String mes = test1[i].substring(test1[i].length()-2);
					if(!test1[i].substring(test1[i].length()-2).contains("cm")||!(test1[i].substring(test1[i].length()-2).contains("cm"))){
						return false;
					}
					if(test1[i].substring(test1[i].))
				}
				
			} catch (Exception e){            
				continue;
			}

		}
		return true;
	}
	public static void main(String[] args) {
		int validpassword = 0;
		String single = "";

		List<String>list = loadFile("dataSet3.txt");
		for(int i = 0; i< list.size();i++) {
			single = single + list.get(i)+"\n";
		}
		String[]lol=single.split("\\n\\n");
		for(int j = 0; j < lol.length;j++) {

			if(checkIfValid(lol[j])) {
				validpassword++;
			}

		}
		System.out.println(validpassword);
	}
}
