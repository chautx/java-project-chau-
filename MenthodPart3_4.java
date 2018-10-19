package Session18102018;

public class MenthodPart3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("so chan la: ");
		for(int i = 0 ; i <= 10 ; i++ ) {
		    boolean isEven = checkSoChan(i);
			if(isEven){
				System.out.println("so chan la: " + i);
			}		
		}
      public static void boolean checkSoChan(int num) {
		boolean isSoChan = num % 2 == 0;
		return isSoChan;
      }

	}
	
}
