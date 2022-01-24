package com.perscholas.java_basics;

import com.perscholas.inheritance.*;

public class InheritanceActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m= new Manager(126534,"Peter","Chennai India", 237844, 76000);
		System.out.println("Manager details:");
		System.out.println("calculated salary: "+m.calculateSalary());
		System.out.println("calculated Transport Allowance: "+m.calculateTransportAllowance());
		
		System.out.println("\nTrainee details");
		Trainee t= new Trainee(29846,"Jack","Mumbai India", 442085, 45000);
		System.out.println("calculated salary: "+t.calculateSalary());
		System.out.println("calculated Transport Allowance: "+t.calculateTransportAllowance());
		
		
	}

}
