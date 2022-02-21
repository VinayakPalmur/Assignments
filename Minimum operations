import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     public static int minimumOneBitOperations(int n, int res)
    {
       
        // Base Case
        if (n == 0)
            return res;
 
        // Store the highest power of 2
        // less than or equal to n
        int b = 1;
        while ((b << 1) <= n)
            b = b << 1;
 
        // Return the result
        return minimumOneBitOperations((b >> 1) ^ b ^ n, res + b);
    }
	public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int N = sc.nextInt();
                        //   int N = 6;
 
        // Function call
        System.out.println(minimumOneBitOperations(N, 0));
	}
}
