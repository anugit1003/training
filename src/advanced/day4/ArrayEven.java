package advanced.day4;
import java.util.Scanner;

public class ArrayEven {
	
	private int arr[];
	
	
	public void onlyEven() {
		
		for(int i=0;i<arr.length;i++) {
		if(arr[i]%2 ==0) 
			System.out.println(arr[i]+" is an even number");
		}
	}

	public static void main(String[] args) {
		ArrayEven avn =new ArrayEven();
		 
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n= scn.nextInt();
		avn.arr = new int[n];
		
		System.out.println("Enter the array elements:");
		
		for(int i=0;i<avn.arr.length;i++) {
			avn.arr[i]=scn.nextInt();

		}
		

        
        avn.onlyEven();
	}

			
	}


