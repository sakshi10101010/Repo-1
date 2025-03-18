package com.serviceImpl;

import java.util.Random;
import java.util.Scanner;

import com.model.Account;
import com.service.RBI;

public class SBI implements RBI {

	private Account acc = new Account();
	private Scanner sc = new Scanner(System.in);
	
	@Override
	public void createAccount() {
		
		Random r = new Random();
		int accNo = r.nextInt(99999); //Getting random no. in accNo
		
		//Setting Account Number
		acc.setAccNo(accNo);
		
		System.out.println("Creating account...");
		System.out.println("Generated Acccount Number : " + accNo);
		
		System.out.println("Enter Name : " );
		String name = sc.nextLine();
		acc.setName(name);
		
		System.out.println("Enter Mobile Number : ");
		String mobNo = sc.nextLine();
		acc.setMobNo(mobNo);
		
		System.out.println("Enter Adhar Number :");
		String AdharNo = sc.nextLine();
		acc.setAdharNo(AdharNo);

		System.out.println("Enter your Gender :");
		String gender = sc.nextLine();
		acc.setGender(gender);
		
		System.out.println("Enter your Age :");
		acc.setAge(sc.nextInt());
		
		System.out.println("Enter Initial Amount :");
		acc.setBalance(sc.nextDouble());
		
		System.out.println("Account Created Succesfully... \n \n" );
		
	}

	@Override
	public void displayAllDetails() {
		System.out.println("Account Details..");
		
		System.out.println("Account Number : " + acc.getAccNo());
		System.out.println("Name : " + acc.getName());
		System.out.println("Mobile Number : " + acc.getMobNo());
		System.out.println("Adhar Number : " + acc.getAdharNo());
		System.out.println("Gender : " + acc.getGender());
		System.out.println("Age : " + acc.getAge());
		System.out.println("Balance : " + acc.getBalance() + "\n \n");
		
	}

	@Override
	public void depositeMoney() {
		System.out.println("Enter Deposite Amount : ");
		double amount = sc.nextDouble();
		
		if(amount>0) {
			acc.setBalance(acc.getBalance() + amount);
			System.out.println(amount + " Deposite Successfully");
		}else
		{
			System.out.println("Invalid Amount,Deposite Failed");
		}
				
	}

	@Override
	public void withdrawal() {
		System.out.println("Enter Withdrwal Account : ");
		double amount = sc.nextDouble();
		if(amount>0) {
			acc.setBalance(acc.getBalance() - amount);
			System.out.println(amount + "Amount Withdraw Succesfully");
		}else 
		{
			System.out.println("Withdraw Failed,Invalid Amount");
		}
		
	}

	@Override
	public void balanceCheck() {
		System.out.println("Your Balance is : " + acc.getBalance());
	}

}
