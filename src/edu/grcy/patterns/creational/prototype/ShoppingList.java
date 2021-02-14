package edu.grcy.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList implements Cloneable{
	private List<String> shoppings;

//	konstruktor do obiektu wzorcowego
	public ShoppingList(){
		shoppings = new ArrayList<>();
		loadInitialData();
	}

//	konstruktor do otrzymywania kopii
	public ShoppingList(List<String> list){
		this.shoppings =list;
	}

	public void loadInitialData(){
		shoppings.add("ser");
		shoppings.add("pomidory");
		shoppings.add("chleb");
	}

	public List<String> getShoppings() {
		return shoppings;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
		List<String> localList = new ArrayList<>();
//		lokalna kopia listy domyslnej
//		zeby unikac sytuacji
//		gdzie w trakcie robienia klona lista domyslna zostanie zmieniona

		localList.addAll(shoppings);
		return new ShoppingList(localList);
	}

	public void setShoppings(List<String> mondayList) {
	}
}

