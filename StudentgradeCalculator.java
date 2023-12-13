package srujan;

import java.util.Scanner;

public class StudentgradeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("student grade calculator");
		System.out.println("enter no of subjects");
		int n=sc.nextInt();
		int total=0;
		for(int i=0;i<n;i++) {
			System.out.println("enter marks obtained in" +i+":");
			int marks=sc.nextInt();
			total+=marks;
			
		}
		double averP=(double)total/n;
		char Grade;
		if(averP>=90) {
			Grade='0';
		}
		else if(averP>=80) {
			Grade='A';
			
		}
		else if(averP>=70) {
			Grade='B';
			
		}
		else if(averP>=60) {
			Grade='C';
		}
		else if(averP>=50) {
			Grade='D';
		}
		else if(averP>=40) {
			Grade='E';
		}
		else {
			Grade='F';
		}
		System.out.println("total marks scored is "+ total);
		System.out.println("average percentage gained is "+averP+"%");
		System.out.println("Grade: "+Grade);

	}

}
