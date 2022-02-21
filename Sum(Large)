import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    static String findSum(String str1, String str2) {

    // Swap strings to make sure length
    // of str2 is larger.
    if (str1.length() > str2.length()){
        String temp = str1;
        str1 = str2;
        str2 = temp;
    }
 
    // Empty String for storing result
    String str = "";
 
    // Calculate length of both String
    int n1 = str1.length(), n2 = str2.length();
 
    // Reverse both of Strings
    str1=new StringBuilder(str1).reverse().toString();
    str2=new StringBuilder(str2).reverse().toString();
 
    int carry = 0;
    for (int i = 0; i < n1; i++)
    {
        // Compute sum of current digits and carry
        int sum = ((int)(str1.charAt(i) - '0') +
                    (int)(str2.charAt(i) - '0') + carry);
        str += (char)(sum % 10 + '0');
 
        // Calculate carry for next step
        carry = sum / 10;
    }
 
    // Add remaining digits of larger number
    for (int i = n1; i < n2; i++)
    {
        int sum = ((int)(str2.charAt(i) - '0') + carry);
        str += (char)(sum % 10 + '0');
        carry = sum / 10;
    }
 
    // Add remaining carry
    if (carry > 0)
        str += (char)(carry + '0');
 
    // reverse resultant String
    str = new StringBuilder(str).reverse().toString();
 
    return str;
}
	public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(findSum(str1, str2));
       

	}
}
