package onlineshoppingsystem;
import java.util.Scanner;
public class Onlineshoppingsystem {
static String[] books = 
{"Book 1","Book 2", "Book 3"};
static boolean[] isBorrowed
=new boolean[3];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new
Scanner(System.in);
for(;;) {
	switch
	(sc.nextInt()) {
	case 1: for (int
			i =0; i < 3; i++)
		System.out.print((i+1) +"."
				+ books[i] + (isBorrowed[i] ? 
					"(Borrowed)" :""));
							break;
				case 2:
					isBorrowed[sc.nextInt()-1] =
							true;
					break;
				case 3:
					isBorrowed[sc.nextInt()-1] =
					false;
					break;
				case 4:
					return; 
					
							 
	}
}
	}

}
