package edu.miu.cs.eShopping.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	
	private int itemCount;    
	private double totalPrice;
	private int capacity;	
	private List<Item>items =new ArrayList<Item>();
	
	public ShoppingCart() {
		super();
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	

}
