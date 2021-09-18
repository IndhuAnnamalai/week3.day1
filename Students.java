package week3.day1;

public class Students {

	public void getStudentInfo(int studId) {
		// TODO Auto-generated method stub
System.out.println("The student Id is: " + studId);
	}
	
	public void getStudentInfo(int studID, String studName) {
		// TODO Auto-generated method stub
		System.out.println("The Student ID is: " + studID);
		System.out.println("The Student name is: "+ studName);

	}
	
	public void getStudentInfo(String studEmail, long studPhone) {
		// TODO Auto-generated method stub
		System.out.println("The Student Email ID is: "+studEmail);
		System.out.println("The Student Phone number is: "+studPhone);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students stuObj = new Students();
		stuObj.getStudentInfo(1589);
		stuObj.getStudentInfo(1589, "Indhu");
		stuObj.getStudentInfo("indhu.02@gmail.com", 9940134454L);
	}

	
}
