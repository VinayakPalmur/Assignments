import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     static void constructXOR(int A[], int n)
    {
         
        // calculate xor of array
        int XOR = 0;
        for (int i = 0; i < n; i++)
            XOR ^= A[i];
     
        // update array
        for (int i = 0; i < n; i++)
            A[i] = XOR ^ A[i];
    }
	public static void main (String[] args) {
                      // Your code here
                   Scanner sc = new Scanner(System.in);
	           
	                    int n = sc.nextInt();
                       int A[] = new int[n];
                       for(int i=0;i<n;i++){
                           A[i] = sc.nextInt();
                       }

                    //    int A[] = { 2, 4, 1, 3, 5};
        // int n = A.length;
        constructXOR(A, n);
     
        // print result
        for (int i = 0; i < n; i++)
            System.out.print(A[i] + " ");
                
	}
}
