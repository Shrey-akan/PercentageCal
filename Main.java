package com.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[]= new int[5];
		SubjectName s = new SubjectName();
		int sum =0;
		System.out.println("Enter Student Name ");
		String student = br.readLine();
		while(true) {
		System.out.println("1.English \n2.Physics \n3.Chemistry \n4.Math \n5.Computer Science \n6.Total");
		System.out.println("Choose Option");
		int ch = Integer.parseInt(br.readLine());
		
		
		if(ch==1) {
			System.out.println("Enter marks obtained");
			int ss = Integer.parseInt(br.readLine());
			sum=sum+ss;
		}
		else if(ch==2) {
			System.out.println("Enter marks obtained");
			int ss = Integer.parseInt(br.readLine());
			sum=sum+ss;
		}
		else if(ch==3) {
			System.out.println("Enter marks obtained");
			int ss = Integer.parseInt(br.readLine());
			sum=sum+ss;
		}
		else if(ch==4) {
			System.out.println("Enter marks obtained");
			int ss = Integer.parseInt(br.readLine());
			sum=sum+ss;
		}
		else if(ch==5) {
			System.out.println("Enter marks obtained");
			int ss = Integer.parseInt(br.readLine());
			sum=sum+ss;
		}
		else if(ch==6) {
			Percentage p = s.getMark("Total");
			p.marks();
			double res = p.percentage(sum);
			if(res>=90) {
				System.out.println(student+" Grade A+ Excellent");
			}
			else if((res<90)&&(res>80)) {
				System.out.println(student+" Grade A \n Good");
			}
			else if((res<80)&&(res>70)) {
				System.out.println(student+" Grade B+ \n Fair");
			}
			else if((res<70)&&(res>65)) {
				System.out.println(student+" Grade B \n Can do better");
			}
			else if((res<65)&&(res>45)) {
				System.out.println(student +" Grade C ");
			}
			else {
					System.out.println(student+" is Fail");
			}
			break;
		}
		else {
			System.out.println("Please Enter correct Subject");
		}
	}
  }
}