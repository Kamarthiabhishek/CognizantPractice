package com.cts.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import java.util.Scanner;

//import com.cts.DAO.AdminDao;
import com.cts.DAO.DBOperations;
import com.cts.models.Admin;
import com.cts.models.Customer;
import com.cts.models.Orders;
import com.cts.models.Products;

public class UserFunctions {
	static DBOperations op = new DBOperations();
	static boolean rs = op.Connect2DB();
	static Scanner sc = new Scanner(System.in);
	static int custId = 0;
	static int adminId = 0;

	public static void CustomerFunctions() {
		boolean close = false;
		while (!close) {
			System.out.println("1. REGISTER\n2. LOGIN\n3. READ ALL\n" + "4. SEARCH USING ID\n"
					+ "5. SEARCH USING CATEGORY\n" + "6. FILTER USING PRICE RANGE\n" + "7. BUY\n" + "8. EXIT");
			System.out.print("Enter your choice : ");
			char ch = sc.next().charAt(0);
			switch (ch) {

			case '1':
				InputFunctions.Details(2);
				break;
			case '2':

				if (custId != 0) {
					System.out.println("Already Logged In!!");
				} else {
					int logstat = UserFunctions.getValue("CUSTOMER");
					custId = logstat;
					System.out.println("Welcome " + custId);
					op.ReadAll();
					
				}

//				boolean fncs = true;
//				while(fncs) {
//					UserFunctions.LoginDetails("ADMIN");
//				}
				break;
			case '3':
				if (custId == 0) {
					System.out.println("login to continue!!");
				} else {
					System.out.println("READ ALL");
					if (rs) {
						boolean i = op.ReadAll();
						if (i) {
						} else {
							System.out.println("PRODUCT COULDN'T BE READ");
						}
					} else {
						System.out.println("CONNECTION FAILED");
					}
				}

				break;
			case '4':
				if (custId == 0) {
					System.out.println("Login to continue!!");
				} else {
					System.out.println("SEARCH USING ID");
					System.out.print("Enter the ID : ");
					String id1 = sc.next();
					if (rs) {
						op.SearchUsingID(id1);

					} else {
						System.out.println("CONNECTION FAILED");
					}
				}

				break;
			case '5':
				if (custId == 0) {
					System.out.println("Login to continue!");
				} else {
					System.out.println("SEARCH USING CATEGORY");
					System.out.print("Enter the category : ");
					String cat = sc.next();
					if (rs) {
						boolean i = op.SearchUsingCat(cat);
						if (i) {
							System.out.println("------------- END OF THE LIST -------------");
						} else {
							System.out.println("PRODUCT COULDN'T BE READ");
						}
					}

					else {
						System.out.println("CONNECTION FAILED");
					}
				}

				break;
			case '6':
				if (custId == 0) {
					System.out.println("Login to continue");
				} else {
					System.out.println("FILTER USING PRICE RANGE");
					System.out.println("Enter price ranges : ");
					int price1 = sc.nextInt();
					int price2 = sc.nextInt();
					if (price1 < price2) {
						if (rs) {
							op.Filter(price1, price2);
						} else {
							System.out.println("CONNECTION FAILED");
						}
					} else {
						System.out.println("Price1 should be less than price2");
					}
				}

				break;
			case '7':
				if (custId == 0) {
					System.out.println("Login to order!!");
				} else {
					InputFunctions.orders(custId);
				}

				break;
			case '8':
				System.out.println("Closing connection!!");
				System.exit(0);
			default:
				System.out.println("Enter the correct option!!");

			}
		}
	}

	public static void AdminFunctions() {
		boolean close = false;
		while (!close) {
			System.out
					.println("1. REGISTER\n2. LOGIN\n3. ADD A PRODUCT\n" + "4. UPDATE PRICE USING ID\n" + "5. DELETE\n"
							+ "6. READ ALL\n" + "7. SEARCH USING ID\n" + "8. SEARCH USING CATEGORY\n" + "9. EXIT");
			System.out.print("Enter your choice : ");
			char ch = sc.next().charAt(0);
			switch (ch) {
			case '1':

				InputFunctions.Details(1);
				break;
			case '2':
				if (adminId != 0) {
					System.out.println("Already logged in!");
				} else {
					int logstat = UserFunctions.getValue("ADMIN");
					adminId = logstat;
					System.out.println("Welcome " + adminId);
				}
				break;
			case '3':
				if (adminId == 0) {
					System.out.println("Login to continue!!");
				} else {
					System.out.println("ADD A PRODUCT");
					int ProdId = UserFunctions.RandomNumberGenerator();
					System.out.print("Enter the Product Name : \n");
					sc.nextLine();
					String ProdName = sc.nextLine();
					System.out.print("Enter the Product Description : \n");
					String ProdDesc = sc.next();
					System.out.print("Enter the Product Quantity : \n");
					int qty = sc.nextInt();
					System.out.print("Enter the price of the product : ");
					int price = sc.nextInt();
					new Products(ProdId, ProdName, ProdDesc, qty, price);
					if (rs) {
						boolean i = op.Insert2Table("PRODUCTS");
						if (i) {
							System.out.println("PRODUCT ADDED SUCCESSFULLY WITH PRODUCT ID : " + ProdId);
						} else {
							System.out.println("PRODUCT COULDN'T BE ADDED");
						}
					} else {
						System.out.println("CONNECTION FAILED");
					}

				}
				break;

			case '4':
				if (adminId == 0) {
					System.out.println("Login to continue!!");
				} else {
					System.out.println("UPDATE PRICE USING ID");
					System.out.print("Enter the Product Id : ");
					String id = sc.next();
					// ===========================================>
					System.out.print("Enter the Price : ");
					int amt = sc.nextInt();
					if (rs) {
						boolean i = op.UpdatePrice(id, amt);
						if (i) {
							System.out.println("PRODUCT UPDATED SUCCESSFULLY!!");
						} else {
							System.out.println("PRODUCT COULDN'T BE UPDATED");
						}
					} else {
						System.out.println("CONNECTION FAILED");
					}
				}

				break;
			case '5':
				if (adminId == 0) {
					System.out.println("Login to continue!!");
				} else {
					System.out.println("DELETE PRODUCT");
					System.out.print("Enter the product Id : ");
					String pid = sc.next();
					if (rs) {
						boolean i = op.DeleteProduct(pid);
						if (i) {
							System.out.println("PRODUCT DELETED SUCCESSFULLY!!");
						} else {
							System.out.println("PRODUCT COULDN'T BE DELETED");
						}
					} else {
						System.out.println("CONNECTION FAILED");
					}
				}

				break;
			case '6':
				if (adminId == 0) {
					System.out.println("Login to continue!!");
				} else {
					System.out.println("READ ALL");
					if (rs) {
						boolean i = op.ReadAll();
						if (i) {
							System.out.println("PRODUCT READ SUCCESSFULLY!!");
						} else {
							System.out.println("PRODUCT COULDN'T BE READ");
						}
					} else {
						System.out.println("CONNECTION FAILED");
					}
				}

				break;
			case '7':
				if (adminId == 0) {
					System.out.println("Login to continue!!");
				} else {
					System.out.println("SEARCH USING ID");
					System.out.print("Enter the ID : ");
					String id1 = sc.next();
					if (rs) {
						op.SearchUsingID(id1);
					} else {
						System.out.println("CONNECTION FAILED");
					}
				}

				break;
			case '8':
				if (adminId == 0) {
					System.out.println("Login to continue!!");
				} else {
					System.out.println("SEARCH USING CATEGORY");
					System.out.print("Enter the category : ");
					String cat = sc.next();
					if (rs) {
						op.SearchUsingCat(cat);
					} else {
						System.out.println("CONNECTION FAILED");
					}
				}

				break;
			case '9':
				System.out.println("CLOSING CONNECTION!!!");
				System.exit(0);
			default:
				System.out.println("Enter the correct option!!");

			}
		}
	}

	public static int RandomNumberGenerator() {
		Random r = new Random();
		int num = r.nextInt(9000) + 1000;
		return num;
	}

	public static void LoginDetails(String name) {
		if (name.equals("ADMIN")) {
			System.out.println("Enter the User name : ");
			String lname = sc.next();
			System.out.println("Enter the password : ");
			String pass = sc.next();
			try {
				// AdminDao ad = new AdminDao();
				DBOperations db = new DBOperations();
				boolean sxd = db.loginAdmin(lname, pass, "ADMIN");
				if (sxd) {
					System.out.println("Login Successfully");
					UserFunctions.AdminFunctions();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (name.equals("CUSTOMER")) {
			System.out.println("Enter the User name : ");
			String lname = sc.next();
			System.out.println("Enter the password : ");
			String pass = sc.next();
			try {
				// AdminDao ad = new AdminDao();
				DBOperations db = new DBOperations();
				boolean sxd = db.loginAdmin(lname, pass, "CUSTOMER");
				if (sxd) {
					System.out.println("Login Successfully");
					UserFunctions.CustomerFunctions();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static int generator() {
		Random r = new Random();
		int num = r.nextInt(9000) + 1000;
		return num;
	}

	public static int getValue(String name) {
		int id = Validations.IdCheck();
//		System.out.println("Enter ID : ");
//		int id = sc.nextInt();
		System.out.print("Enter the password : ");
		String pass = sc.next();
		DBOperations db = new DBOperations();
		boolean crt = db.getLoginId(id, pass, name);
		if (crt) {
			return id;
		} else {
			System.out.println("Invalid credentials");
			return 0;
		}
	}
}
