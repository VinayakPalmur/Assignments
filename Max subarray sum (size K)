import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


class Main {
	public static void main (String[] args) {
                     
		int n,k;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int sum = 0;
		for(int i=0;i<k;i++)
			sum+=a[i];//sum of first subarray of size k
		int ans = sum;
		for(int i=k;i<n;i++) {
			sum += a[i]-a[i-k];
			if(sum>ans)
				ans=sum;
		}
		System.out.println(ans);
	}
}
