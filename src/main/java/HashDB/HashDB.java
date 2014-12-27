package HashDB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import manh.vu.DataBinding.Restaurent;
import manh.vu.DataBinding.Tour;

public class HashDB {
	public static HashMap<String, Restaurent> restaurentList = new HashMap<String, Restaurent>();
	public static HashMap<String, Tour> tourList = new HashMap<String, Tour>();
	
	public static Restaurent getRestaurent(String restaurentName) {
		return HashDB.restaurentList.get(restaurentName);
	}
	
	public static ArrayList<String> restaurentNameList () {
		ArrayList<String> restaurentNameList = new ArrayList<String>();
		
		for(Map.Entry entry : restaurentList.entrySet()) {
			restaurentNameList.add(entry.getKey().toString());
		}
		
		return restaurentNameList;
	}
	
	public static ArrayList<String> tourNameList() {
		ArrayList<String> tourNameList = new ArrayList<String>();
		
		for(Map.Entry entry : tourList.entrySet()) {
			restaurentNameList().add(entry.getKey().toString());
		}
		return tourNameList;
	}
	
	public static Tour getTour(String tourName) {
		return HashDB.tourList.get(tourName);
	}
}
