package com.cts.services;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import com.cts.DAO.DBoperations;
import com.cts.beans.Orders;
import com.cts.beans.Products;

public class UserFunctions {
	Scanner sc = new Scanner(System.in);
	
	public void addProducts() {
		System.out.print("Enter the product name : ");
		String name = sc.next();
		System.out.print("Enter the product price : ");
		int price = sc.nextInt();
		System.out.print("Enter the product quantity : ");
		int qty = sc.nextInt();
		int pid = generator();
		Products p = new Products(pid, price, qty, name);
		
	}
	
	
	public void orders(int cid) {
		DBoperations db = new DBoperations();
		db.show();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		HashMap<Integer, Integer> amt = new HashMap<>();
		boolean close = false;
		while(!close) {
			System.out.print("Enter the product id :");
			int pid = sc.nextInt();
			System.out.print("Enter the quantity :");
			int qty = sc.nextInt();
			int id = generator();
			Orders o = new Orders(id,qty,pid,cid);
			
			map.put(pid, qty);
			System.out.println("Y|N");
			char ch = sc.next().charAt(0);
			int price = db.getPrices(pid);
			
			
			db.orderProduct(cid, pid, qty);
			amt.put(pid, qty*price);
			if(ch=='n') {
				close = true;
			}
		}
		
		
		int sum = 0;
		for(Map.Entry<Integer, Integer> e: amt.entrySet()) {
//			int prodid = e.getKey();
			int price = e.getValue();
			sum += price;
		}
		
		System.out.println(sum);
		db.Billing(cid, sum);
	}
	
	public static int generator() {
		Random r = new Random();
		int num = r.nextInt(9000)+1000;
		return num;
	}
	
	
	public int getValue() {
		System.out.println("Enter the ID : ");
		int id = sc.nextInt();
		DBoperations db = new DBoperations();
		boolean crt  = db.getLoginId(id);
		if(crt) {
			System.out.println(+id+"Present");
			return id;
		}else {
			System.out.println("F***");
			return 0;
		}
	}
}
