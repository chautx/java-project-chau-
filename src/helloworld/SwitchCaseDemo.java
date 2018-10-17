package helloworld;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// cau lenh dieu khien switchcase
		System.out.println("Nhap kenh Tivi:");
		int chanel ;
		Scanner scanner = new Scanner(System.in);  // use Scanner for input data from keyboard
	    chanel = scanner.nextInt();
		switch(chanel) {
		case 1:
			System.out.println("vtv1"); 
		break;
		case  2:
			System.out.println("vtv2");
		break;
		case 3:
		System.out.println("vtv3");
		break;
		default:
			System.out.println("kenh khong ton tai");
			break;
			
			
		
		
			
		}
 
	}

}
