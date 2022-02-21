import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
                      //String[] arr ={"AS","KF","ER","DD","JK"};
                    
                    Scanner sc = new Scanner(System.in);
                    //int n=sc.nextInt();
		String arr[]=new String[5];

    for(int i=0;i<5;i++) arr[i]=sc.next();
int count = 0;
String sortedArray[] = sort_sub(arr, arr.length); 
for(int i=0;i<sortedArray.length;i++){
System.out.print(sortedArray[i]+" ");
}
}

public static String[] sort_sub(String array[], int f){
String temp="";
for(int i=0;i<f;i++){
for(int j=i+1;j<f;j++){
if(array[i].compareToIgnoreCase(array[j])>0){
temp = array[i];
array[i]=array[j];
array[j]=temp;
}
}
}
return array;
}
}
