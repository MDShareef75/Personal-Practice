package practice;
//@atomrex 10:50pm 02/06/2020
import java.util.Scanner;

public class LargePrime {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter largest number");
		int N = s.nextInt();
		boolean new_flag = true;
		for(int i=N-1 ; i>=1 ; i--) { // from i -> N to 1 iteration
			if(new_flag) {
				int arr[] = Int_to_array(i); //int to int array ex: 1000 to a[4] = [1,0,0,0];
				int prime_count = 0;
				for(int j = 0 ; j < arr.length ; j++) { //from j -> 0 to array length
					
					boolean flag = false;
					for(int k = 2 ; k <= arr[j]/2 ; ++k) { //checking prime
						//condition for not prime
						if(arr[j]%k == 0) {
							flag = true;
							break;
						}
					}
					if(!flag) {//if prime
						prime_count = prime_count+1;
						if(prime_count == arr.length) {//checking if all the digits are prime
							System.out.println(i);
							new_flag = false;
						}		
					}//else {
		//						System.out.println("not prime");
		//					}
							
				}//end of for
			}//end of if
		}//end of for
	}//end of main
	
	//program to convert int number to array
	static int[] Int_to_array(int n)
	{
		int j = 0;
		int len = Integer.toString(n).length();
		int[] arr = new int[len];
		while(n!=0)
		{
			arr[len-j-1] = n%10;
			n=n/10;
			j++;
		}
		return arr;
	}
}
