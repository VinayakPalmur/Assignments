import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  Scanner sn = new Scanner(System.in);
						
					  long a =sn.nextLong();
					  long b = sn. nextLong();

					  long temp =0;
					  while (b!=0)
					  {
						  temp =b;
						  b=a%b;
						  a=temp;
					  }
					  System.out.println(a);
	}
}
