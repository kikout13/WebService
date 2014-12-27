package manh.vu.Services;

import manh.vu.DataBinding.Restaurent;
import manh.vu.DataBinding.BookRecipe;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface RestaurentBook {
	@WebMethod
	public ArrayList<String> getRestaurentList();
	
	@WebMethod
	public Restaurent getRestaurentInfo(String restaurentName);
	
	@WebMethod
	public ArrayList<String> tableSearch (Restaurent restaurent, int customerNumber, String date, String time);
	
	@WebMethod
	public BookRecipe customerConfirm (String name, String phoneNumber, String idNumber, String email, String restaurentName, 
			String location,int customerNumber, String otherDemand);
}
