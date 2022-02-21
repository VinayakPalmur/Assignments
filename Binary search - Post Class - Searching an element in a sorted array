static int isPresent(long arr[], int n, long k){
	// Your code here
    Main ob = new Main();
    int result = ob.binarySearch(arr, 0, n - 1, k);
    if (result == -1){
        return -1;
    }
    else{
        return 1;
    }
}

int binarySearch(long arr[], int l, int r, long x){
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x){
                return mid;
            }

            if (arr[mid] > x){
                return binarySearch(arr, l, mid - 1, x);
            }

            return binarySearch(arr, mid + 1, r, x);
        }

        return -1;
    }
