import java.util.Scanner;
public class LIS {
		public static void main(String args[]){
		      Scanner sc=new Scanner(System.in);
		      System.out.println("Enter length of array:");
		      int n=sc.nextInt();
		      //reading array elements
		      System.out.println("Enter array of elements:");
		      int arr[]=new int[n];
		      for (int i = 0; i < n; i++)
		    	  arr[i]=sc.nextInt();
		      
		      System.out.println("List of array elements:");
		       for (int i = 0; i < n; i++) {
		           System.out.print(arr[i] + " ");
		       }
		      System.out.println("\nThe length of longest increasing subsequence is: " +  long_incr_subseq(arr, n));
		   }
		static int long_incr_subseq(int arr[], int n){
		      int arr_seq[] = new int[n];
		      int i, j, max = 0;
		      //giving values for all indexes
		      for (i = 0; i < n; i++)
		         arr_seq[i] = 1;
		      for (i = 1; i < n; i++) {
		    	  for (j = 0; j < i; j++) {
		    		  if (arr[i] > arr[j] && arr_seq[i] < arr_seq[j] + 1)
		    			  arr_seq[i] = arr_seq[j] + 1;
		    	  }
		    }
		      for (i = 0; i < n; i++) {
		    	  if (max < arr_seq[i])
		    		  max = arr_seq[i];
		      }
		      return max;
		   }	   
	}

