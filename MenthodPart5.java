package Session18102018;

public class MenthodPart5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ham return- xu ly va tra ve ket qua
		// Tong cua num1 va num 2
		int a = 1;
		int b = 2;
		int sum1 = tinhTong(a,b);
		System.out.println("Tong cua num1 va num 2 la: " + sum1);
		// Sum of num1+ num 2
		int c = 3;
		int d = 4;
		int sum2 = tinhTong(c,d);
		System.out.println("Sum of num1 and num 2 la: " + sum2);
	}
		public static int tinhTong(int num1,int num2) {
			int sum = num1 + num2;
			return sum;
		}
	
	}

