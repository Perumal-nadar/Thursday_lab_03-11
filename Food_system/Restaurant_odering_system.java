package Food_system;

import java.util.Scanner;

public class Restaurant_odering_system {

	public static void main(String[] args) {
		demo();

	}

	public static void demo() {
		int f_type,s_type,t_amount,mc_type,d_type,liq_type;
		char order_type = 'y';
		String bill = "";
		t_amount = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome! to Food Panda");
		do {
			System.out.println("Select the Items from menu:");
			System.out.println("By Choosing the number");
			System.out.println("1:Starter");
			System.out.println("2:Main course");
			System.out.println("3:Desert");
			System.out.println("4:Drinks");	
			System.out.println("\nEnter the number of the Desired Order:");
			f_type = scan.nextInt(); 
			switch (f_type) {
				
				case 1 :// Case using for Starter menu...
					System.out.println("Select the Starter Items from menu:");
					System.out.println("By choosing the Item numbers---");
					System.out.println("1:Kakori Kebabs --- 150rs");
					System.out.println("2:Dahi Kebabs --- 120rs");
					System.out.println("3:Paneer Tikka --- 110rs");
					System.out.println("4:Caprese Salad --- 100rs");
					System.out.println("\nEnter the number of Desired Starter:");
					s_type = scan.nextInt();//Starters type(s_type)
					
					if(s_type==1) {
						bill += "Kakori Kebabs --- 150rs....\n";
						t_amount += 150;// t_amount = Total amount
					}
					if(s_type==2) {
						bill += "Dahi Kebabs --- 120rs....\n";
						t_amount += 120;
					}
					if(s_type==3) {
						bill += "Paneer Tikka --- 110rs....\n";
						t_amount += 110;
					}
					if(s_type==4) {
						bill += "Caprese Salad --- 100rs....\n";
						t_amount += 100;
					}
					break;
					
				case 2 ://Case using for Main course menu....
					System.out.println("Select the Main Course Items from menu:");
					System.out.println("By choosing the Item numbers---");
					System.out.println("1:Curry Rice --- 200rs");
					System.out.println("2:Butter Chicken --- 180rs");
					System.out.println("3:Dal Makhani --- 210rs");
					System.out.println("4:Biryani --- 250rs");
					
					System.out.println("\nEnter the number of Desired Main Course:");
					mc_type = scan.nextInt();
					
					if(mc_type==1) {//mc_type = Main course type....
						bill += "Curry Rice --- 200rs....\n";
						t_amount += 200;
					}
					if(mc_type==2) {
						bill += "Butter Chicken --- 180rs....\n";
						t_amount += 180;
					}
					if(mc_type==3) {
						bill += "Dal Makhani --- 210rs....\n";
						t_amount += 210;
					}
					if(mc_type==4) {
						bill += "Biryani --- 250rs....\n";
						t_amount += 250;
					}
					break;
					
				case 3 ://Case using for Desert menu.....
					System.out.println("Select the Desert Items from menu:");
					System.out.println("By choosing the Item numbers---");
					System.out.println("1:Gulab jamun --- 70rs....");
					System.out.println("2:Kulfi --- 60rs....");
					System.out.println("3:tarte tain --- 80rs....");
					System.out.println("4:Chocolate cake --- 90rs....");
					
					System.out.println("\nEnter the number of Desired Main Course:");
					d_type = scan.nextInt();
					if(d_type==1) {//d_type = Desert type....
						bill += "Gulab jamun --- 70rs\n";
						t_amount += 70;
					}
					if(d_type==2) {
						bill += "Kulfi --- 60rs\n";
						t_amount += 60;
					}
					if(d_type==3) {
						bill += "tarte tain --- 80rs\n";
						t_amount += 80;
					}
					if(d_type==4) {
						bill += "Chocolate cake --- 90rs\n";
						t_amount += 90;
					}
					break;
					
				case 4 ://Case using for drinks menu....
					System.out.println("Select the Drinks from menu:");
					System.out.println("By choosing the Item numbers---");
					System.out.println("1:Daiquiri --- 120rs");
					System.out.println("2:Margarita --- 100rs");
					System.out.println("3:Martini --- 110rs");
					System.out.println("4:Bloody Mary --- 100rs");
					
					System.out.println("\nEnter the number of Desired Main Course:");
					liq_type = scan.nextInt();
					if(liq_type==1) {//liq_type = Drinks
						bill += "1:Daiquiri --- 120rs....\n";
						t_amount += 120;
					}
					if(liq_type==2) {
						bill += "Margarita --- 100rs....\n";
						t_amount += 100;
					}
					if(liq_type==3) {
						bill += "Martini --- 110rs....\n";
						t_amount += 110;
					}
					if(liq_type==4) {
						bill += "Bloody Mary --- 100rs....\n";
						t_amount += 100;
					}
					break;
					
				default : 
					System.out.println("Item not found!Try again......");
					
					}
			System.out.println("\nDo you want to order again:");
			System.out.println("If yes press y or else press n:");
			order_type = scan.next().charAt(0);
			if(order_type=='y') {
				 order_type = 't';// t for True.....
			}
			
		}while(order_type == 't');
		System.out.println("Total Items Ordered:");
		System.out.println(bill);
		System.out.print("Your total Bill is:");
		System.out.println(t_amount); 
		
	}
}
