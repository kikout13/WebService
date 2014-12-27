package manh.vu.Services;

import manh.vu.DataBinding.Tour;
import manh.vu.DataBinding.BookRecipe;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface TourBook {
	@WebMethod
	public ArrayList<String> getTourList();
	
	@WebMethod
	public Tour getTourInfo(String tourName);
	
	@WebMethod
	public BookRecipe customerConfirm (String name, String phoneNumber, String idNumber, String email, 
			String tourName, String customerNumber, String gatherLocation, String startTime, String endTime, int price);
}
