package com.tnsif.abstractpgm;

import java.util.Scanner;

public class Amazon {

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amt;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter amount");
		amt=sc.nextInt();
		Account a;
		a=new NonPrime(amt);
		a.delivaryCharges(amt);

	}

}
