package manh.vu.ServicesImpl;

import java.util.ArrayList;

import HashDB.HashDB;
import manh.vu.DataBinding.BookRecipe;
import manh.vu.DataBinding.Tour;
import manh.vu.Services.TourBook;

public class TourBookImpl implements TourBook {

	@Override
	public ArrayList<String> getTourList() {
		return HashDB.tourNameList();
	}

	@Override
	public Tour getTourInfo(String tourName) {
		return HashDB.getTour(tourName);
	}

	@Override
	public BookRecipe customerConfirm(String name, String phoneNumber,
			String idNumber, String email, String tourName,
			String customerNumber, String gatherLocation, String startTime,
			String endTime, int price) {
		
		BookRecipe tourRecipe = new BookRecipe();
		tourRecipe.printTourBookRecipe(name, phoneNumber, idNumber, email, tourName, customerNumber, gatherLocation, startTime, endTime, price);
		return tourRecipe;
	}
	
}
