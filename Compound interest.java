import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
                      double intAmount;
                      Scanner sn = new Scanner (System.in);
                      int P = sn.nextInt();
                      int R = sn.nextInt();
                      int Tm = sn.nextInt();

                      double intRate = R/100f;
                      double befPower = 1+(intRate/1);
                      float nt = 1*Tm;
                      double afterPower = Math.pow(befPower, nt);
                      
                      double totalAmount = P* afterPower;
                      intAmount = totalAmount - P;
                      System.out.printf("%.2f", intAmount);

	}
}
