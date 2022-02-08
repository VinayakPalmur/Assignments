import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  Scanner sc= new Scanner(System.in);
					  int[] array= new int[5];
					  for(int i = 0; i< array.length; i++)
					  {
						  array[i] = sc.nextInt();
						 }
						 int count = 0;
						 for (int i =0; i < array.length; i++)
						 {
							 count =count + array[i];
						 }
						 int j = 0;
						 while(j <= 4)
						 {
							 if(array[j] >= count -array[j])
							 {
								 System.out.println("SPD Emergency");
								 return;
							 }
							 j++;
						 } System.out.println("Stable");
	}
}
