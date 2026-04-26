package com.braindata.bankmanagement.Client;

import java.util.Scanner;

import com.braindata.bankmanagement.service.Rbi;
import com.braindata.bankmanagement.serviceImpl.Sbi;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rbi bank = new Sbi();
		boolean flag = true;
		while (flag) {
			System.out.println("============Welcome to SBi Bank==============");
			System.out.println("Enter 1 for create Account");
			System.out.println("Enter 2 for Display All Details");
			System.out.println("Enter 3 for Deposite Money");
			System.out.println("Enter 4 for Withdrawl Money");
			System.out.println("Enter 5 for Balance Check ");
			System.out.println("Enter 6 for Exit");
			System.out.println("*********************************************");

			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				(bank).createAccount();
				break;
			case 2:
				bank.displayAllDetails();
				break;
			case 3:
				bank.depositMoney();
				break;
			case 4:
				bank.withdrawl();
				break;
			case 5:
				bank.balanceCheck();
				break;
			case 6:
				System.out.println("Thanks for visiting us.......");
				flag = false;
				break;
		    default:
				System.out.println("Wrong Input Provided........");
				break;

			}

		}
	}

}
