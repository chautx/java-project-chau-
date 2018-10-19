package Session18102018;

public class MinMaxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]Numbers = {1,2,3,4,5,67};
		int max = Numbers[0];
		for( int i = 0; i < Numbers.length; i++) {
			if(max < Numbers[i]) {
				max = Numbers[i];
			}
				
		}
			System.out.println("max = " + max);
	}
}
