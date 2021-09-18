package week3.day1;

public class ReplaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="I am working with Java8";
		String replaceAll = str.replaceAll("\\d", "11");
		System.out.println("The replaced string is: "+replaceAll);
		String substring = str.substring(5, 14);
		System.out.println("The substring is: "+substring);
	}

}
