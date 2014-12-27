package manh.vu.DataBinding;

import java.util.HashMap;

public class Restaurent {
	private String name;
	private String location;
	private int qualityRate;
	private int priceRate;
	private String description;
	private String menu;
	private String openTime;
	private int currentCustomerAmount;
	private int customerAmount;
	private HashMap<String, Integer> tableList;
	private String date;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setQualityRate(int qualityRate) {
		this.qualityRate = qualityRate;
	}
	
	public int getQualityRate() {
		return qualityRate;
	}
	
	public void setPriceRate(int priceRate) {
		this.priceRate = priceRate;
	}
	
	public int getPriceRate() {
		return priceRate;
	}
	
	public void setDescription(String desciption) {
		this.description = desciption;
	}
	
	public String getDesciption() {
		return description;
	}
	
	public void setMenu(String menu) {
		this.menu = menu;
	}
	
	public String getMenu() {
		return menu;
	}
	
	public void setOpenTime(String OpenTime) {
		this.openTime = OpenTime;
	}
	
	public String getOpenTime() {
		return openTime;
	} 
	
	public void setCustomerAmount(int customerAmount) {
		this.customerAmount = customerAmount;
	}
	
	public int getCustomerAmount() {
		return customerAmount;
	}
	
	public void setCurrentCustomerAmount(int currentCustomerAmount) {
		this.currentCustomerAmount = currentCustomerAmount;
	}
	
	public int getCurrentCustomerAmount() {
		return currentCustomerAmount;
	}
	
	public void setTableList(HashMap<String, Integer> tableList) {
		this.tableList = tableList;
	}
	
	public HashMap<String, Integer> getTableList() {
		return tableList;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getDate() {
		return date;
	}
}