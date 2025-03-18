package com.client;

import java.util.Scanner;

import com.service.RBI;
import com.serviceImpl.SBI;

public class Test {
	public static void main(String[] args) {
		
		RBI rbi = new SBI();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			  System.out.println("----- Bank Management -----");
	          System.out.println("1. Create Account..");
	          System.out.println("2. Display Account Details..");
	          System.out.println("3. Deposit Money..");
	          System.out.println("4. Withdraw Money..");
	          System.out.println("5. Check Balance..");
	          System.out.println("6. Exit..");
	          System.out.print("Enter Your Choice : ");
	          
	          int ch = sc.nextInt();
	          
	          switch (ch) {
	          	case 1: {
	          		rbi.createAccount();
	          		break;
				}
	          	case 2: {
	          		rbi.displayAllDetails();
	          		break;
	          	}
	          	case 3: {
	          		rbi.depositeMoney();
	          		break;
	          	}
	          	case 4: {
	          		rbi.withdrawal();
	          		break;
	          	}
	          	case 5: {
	          		rbi.balanceCheck();
	          		break;
	          	}
	          	case 6: {
	          		sc.close();
	          		System.exit(0);
	          	}
				default:
					System.out.println("You have Entered Wrong Choice..");
					System.out.println("just making changes..");
					System.out.println("just making another changes..");
	          }
		}
	}

}
