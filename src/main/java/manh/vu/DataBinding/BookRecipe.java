package manh.vu.DataBinding;

public class BookRecipe {
//	private String name;
//	private String phoneNumber;
//	private String idNumber;
//	private String email;
//	private String restaurentName;
//	private String date;
//	private String startTime;
//	private String location;
//	private int customerNumber;
//	
//	private String tourName;
//	private String gatherLocation;
//	private String endTime;
//	private String otherService;
	
	public void printRestaurentBookRecipe(String name, String phoneNumber, String idNumber, String email, String restaurentName, 
			String location,int customerNumber, String otherDemand) {
		System.out.println("Print restaurent book recipe!");
	}
	
	public void printTourBookRecipe(String name, String phoneNumber, String idNumber, String email, 
			String tourName, String customerNumber, String gatherLocation, String startTime, String endTime, int price) {
		System.out.println("Print tour book recipe!");
	}
}
