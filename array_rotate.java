import java.util.*;

class array_rotate {
	
	public static void rotate(int arr[], int d, int n)
	{
        int maxx=0;
        for (int i = 0; i < n; i++) {    
            int product=0;        
            int p = 1;
            while (p <= d) {
                int last = arr[0];
                for (int j = 0; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[n - 1] = last;
                p++;
            }
    
            for (int j = 0; j < n; j++) {
                // System.out.print(arr[j] + " ");
                product+=(j*arr[j]);
            }
            // System.out.println(product);
            maxx=Math.max(maxx, product);
            d++;
        }
        System.out.println(maxx);
	}
	
	public static void main(String[] args)
	{
        Scanner in=new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
		int d = 0;
		rotate(arr, d, n);
	}
}
