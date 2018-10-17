package helloworld;

import java.util.Scanner;

public class ScannerDemo {

	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variable DataType Part 7
		// Đọc dữ liệu từ bàn phím bằng scanner
	
		scanner = new Scanner(System.in);
		System.out.println("nhap ten cua hero:");
		String heroname = scanner.nextLine();	
		System.out.println("Ten cua hero la:" + heroname);	
		System.out.println("Nhap muc do trong thuong:");
		int damage = scanner.nextInt();		
		int health = 200;
		boolean isAlive = health - damage > 0;
		if(isAlive) {
			System.out.println("Hero is alive");			
		}else {
			System.out.println("Hero is dead");
		}
			}

}
