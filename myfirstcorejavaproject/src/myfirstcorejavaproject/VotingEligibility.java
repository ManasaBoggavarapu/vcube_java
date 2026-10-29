package myfirstcorejavaproject;

import java.util.Scanner;

public class VotingEligibility {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ENTER YOUR AGE:");
		int age=sc.nextInt();
		
		if(age>=18 ) {
			System.out.println("YES BOSS YOU ARE ELIGIBLE For Voting !!!");
			
			System.out.println("are you indian??");
			boolean indiancitizen=sc.nextBoolean();
			if(indiancitizen) {
				System.out.println("yes bro you are eligilbe!!! ");
				
				System.out.println("do  you have voter id:");
				boolean voterid=sc.nextBoolean();
				
				if(voterid) {
					System.out.println("yes boss you are eligible!!");
				}
				else {
					System.out.println("no you are not eligible bro ");
				}
				
				
				
			}
			else {
				System.out.println(" sorry hope for the best ");
			}
		}
		else {
			System.out.println("pakkakelli aduko bro!!!");
		}

	}

}
