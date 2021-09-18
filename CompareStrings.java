package week3.day1;

public class CompareStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1= "I am learning Java";
		String str2 = "I am Learning java";
		
		if(str1==str2) {
			System.out.println("The strings are equal in ==");
		}else if(str1.equals(str2)){
			System.out.println("The strings are equal in .equals ");
		}else if(str1.equalsIgnoreCase(str2)){
			System.out.println("The strings are equal in equalsignorecase");
		}else {
			System.out.println("No condition satisfies");
		}
	}

}
