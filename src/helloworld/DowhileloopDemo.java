package helloworld;

import java.util.Scanner;

public class DowhileloopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("DowhileDemo");
		Scanner input = new Scanner(System.in);
		int choice = -1;
		do {
		System.out.println("Nhap lua chon cua ban:");
		choice = input.nextInt();
		
		switch(choice){
			case 1:
				System.out.println("chon menu 1");
				break;
			case 2:
				System.out.println("chon menu 2");
				break;
			case 3: 
				System.out.println("chon menu 3");
				break;				
		}
		}while(choice > 0);
		System.out.println("thoat");
      }
	}
