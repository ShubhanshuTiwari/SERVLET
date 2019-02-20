package com.seed.beans;

import java.awt.List;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

//TODO:0	Modification required
public class ShoppingCart {
	private java.util.Collection<Integer> productIds;	

	public ShoppingCart() {
		productIds=new LinkedList();
		
		
//		TODO:1 Create object of LinkedList,
//		which will be referred using member variable "productIds"
	}	
	
	public java.util.Set<Integer> getProductSet() {
		return (Set<Integer>) productIds;
//		TODO:2 return set of product ids stored in this shopping cart
	}

	public void setProductList(String[] newProductIds) {
//		TODO:3	add newProductIds into existing list of product ids
		for(String i:newProductIds)
		productIds.add(Integer.parseInt(i));
	}	
}
