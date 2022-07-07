package com.machine;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.machine.CoffeeTypes;
import com.machine.TokenGenerator;

public class ChitrakootCoffeeHome {

	public static void main(String[] args) throws InterruptedException {

		Scanner s = new Scanner(System.in);

		boolean token = true;
		while (token) {
			System.err.println("************HI Welcome To Chitrakoot Coffee Shop***********");
			Thread.sleep(1000);
			System.out.println(" How Can Help You Dear....!!" + " May I Know Your Name");
			System.out.println("Please Enter Yes Or No ....!!");
			String yes = s.nextLine();
			if (yes.equalsIgnoreCase("yes")) {
				System.out.println("Please Enter Your Name");
				String name = s.nextLine();
				System.out.println("HI " + name.toUpperCase() + " Welcome To Chitrakoot Coffee Shop ");

				System.out.println("............. Can I Show Menu Card ................!!");
				System.out.println("Please Enter Yes Or No ....!!");
				String menucard = s.nextLine();
				if (menucard.equalsIgnoreCase("yes")) {

					CoffeeTypes coffeeTypes = new CoffeeTypes();
					List<CoffeeTypes> showCoffee = coffeeTypes.showCoffee();
					for (CoffeeTypes coffeeTypes2 : showCoffee) {
						System.out.println(coffeeTypes2 + "20% OFF SPECIAL OFFER");

					}

					System.err.println(" ***ENTER COFFEE NAME***");
					String coffeeName = s.nextLine();
					System.err.println("***ENTER COFFEE AMOUNT***");
					double coffeeAmount = Double.parseDouble(s.nextLine());
					System.err.println("***ENTER COFFEE CUP***");
					int coffeeQty = Integer.parseInt(s.nextLine());

					Double totalBill = coffeeAmount * coffeeQty;
					double dis = totalBill * 20 / 100;
					double d = totalBill - dis;
					System.out.println(d);
					System.out.println(" Hi " + name + " You Are Selected Coffee Details ....\n");
					System.out.println("Coffee Name is- " + coffeeName + "\n");
					System.out.println("Coffee Price is- " + coffeeAmount + "\n");
					System.out.println("Coffee Cup is - " + coffeeQty + "\n");
					System.out.println("YOUR TOTAL PRICE IS- " + totalBill + "Discount Bill :" + d);
					System.out.println(" Hi " + name
							+ " This is Artificial Intelligence Machine So bill Token Generating PLEASE WAIT.....!!");
					Thread.sleep(3000);
					TokenGenerator tokenGenerator = new TokenGenerator();
					tokenGenerator.TokenGenerator(d);
					System.err.println("+++++++++++++++++++WAIT FOR THE RECEIPT++++++++++++++++++++++");
					Thread.sleep(5000);
					tokenGenerator.setTokenName("COFFEE NAME IS " + coffeeName + " CUSTOMER NAME IS : " + name);
					System.out.println(tokenGenerator);

					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");
					LocalDateTime now = LocalDateTime.now();
					System.err.println("YOUR ORDER IS COMPLETED.......!!" + " THANK YOU For ORDRING " + name + " "
							+ "DATE : " + dtf.format(now));
					Thread.sleep(5000);

					System.out.println("-------------------------DO YOU WANT NEXT ORDER----------------------------");
					System.out.println("YES OR NO");
					String exit = s.nextLine();
					if (exit.equalsIgnoreCase("yes")) {
						token = true;
					} else {
						token = false;
						System.err.println("THANK YOU FOR USING OUR SERVICE WE WILL MEET NEXT TIME......");
					}

				}

				else {
					System.out.println("SORRY YOU ARE ENTER NO OR OTHER KEY NEXT TIME WE WILL MEET !! "
							+ "PLEASE WAIT... 3 SECONDS");
					Thread.sleep(3000);
					System.out.println("Do You Want Again Run Option....");
					System.out.println("YES OR NO");
					String exit = s.nextLine();
					if (exit.equalsIgnoreCase("yes")) {
						token = true;
					} else {
						token = false;
					}
				}
			} else {
				System.out.println(
						"SORRY YOU ARE ENTER NO OR OTHER KEY NEXT TIME WE WILL MEET !! " + "PLEASE WAIT... 3 SECONDS");
				Thread.sleep(3000);
				System.out.println("Do You Want Again Run Option....");
				System.out.println("YES OR NO");
				String exit = s.nextLine();
				if (exit.equalsIgnoreCase("yes")) {
					token = true;
				} else {
					token = false;
				}
			}

		}
	}

}
