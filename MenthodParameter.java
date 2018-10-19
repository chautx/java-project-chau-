package Session18102018;

public class MenthodParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("so chan la: ");
		for(int i = 0 ; i <= 10 ; i++ ) {
			checksochan(i);
			}			
		System.out.println("so le la: ");
		for(int i = 0 ; i <= 10 ; i++ ) {
			checksole(i);
			}
	     }
		public static void checksochan(int num1) {
		if(num1 % 2 == 0) {
			System.out.println(num1);
	
		}
	}
	public static void checksole(int num2) {
		if(num2 % 2 != 0) {
			System.out.println(num2);
		}
	}
	
}



