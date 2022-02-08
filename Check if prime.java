import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
                      Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for(int i = 1; i <= T; i++) {
            int num = scanner.nextInt();
            int count = 0;

            int sqrt = (int)Math.sqrt(num);
            for(int j = 2; j <= sqrt; j++) {
                if(num % j == 0) {
                    count = count + 1;
                }
            }

            if(count == 0) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
	}
}
