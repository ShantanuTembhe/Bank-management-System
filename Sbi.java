package com.braindata.bankmanagement.serviceImpl;

import java.util.Scanner;

import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.service.Rbi;

public class Sbi implements Rbi {
	Account ac = new Account();
	Scanner sc = new Scanner(System.in);

	@Override
	public void createAccount() {

		System.out.println("Account number: ");
		int accno = sc.nextInt();
		ac.setAccNo(accno);

		System.out.println("Coustomer name : ");
		String cName = sc.next();
		ac.setName(cName);

		System.out.println("Mobile Number: ");
		String mob = sc.next();
		ac.setMobNo(mob);

		System.out.println("Adhar Number: ");
		String adhar = sc.next();
		ac.setAdharNo(adhar);

		System.out.println("Gender : ");
		String genderC = sc.next();
		ac.setGender(genderC);

		System.out.println("age: ");
		int ageC = sc.nextInt();
		ac.setAge(ageC);

		System.out.println("Balance : ");
		double balance = sc.nextDouble();
		ac.setBalance(balance);

	}

	@Override
	public void displayAllDetails() {
		System.out.println(ac.getAccNo());
		System.out.println(ac.getName());
		System.out.println(ac.getMobNo());
		System.out.println(ac.getAdharNo());
		System.out.println(ac.getGender());
		System.out.println(ac.getAge());
		System.out.println(ac.getBalance());
	}

	@Override
	public void depositMoney() {

		System.out.println("Enter Deposite Amount : ");
		double depo = sc.nextDouble();
		double bal = ac.getBalance();
		bal = bal + depo;
		ac.setBalance(bal);

	}

	@Override
	public void withdrawl() {

		System.out.println("Enter Withdrawl Amount :");
		double withdrawl = sc.nextDouble();
		double bal = ac.getBalance();
		bal = bal - withdrawl;
		ac.setBalance(bal);
	}

	@Override
	public void balanceCheck() {

		System.out.println(ac.getBalance());

	}

}
