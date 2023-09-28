package advanced.day4;

import java.util.Arrays;

public class UniqueElements {

	public static void main(String[] args) {
		int arr[]= {5,6,7,7,3,5,1,4,10,4,7};
		Arrays.sort(arr);
		int count=1;
		for(int i=0;i<arr.length;i++) {
			while((i+1<arr.length-1)&&(arr[i]==arr[i+1])){
				count++;
				i++;
				
			}
			if(count==1) {
				System.out.println("Element "+arr[i]+" is unique");
			}else {
				System.out.println("Element "+arr[i]+" has occured "+count+ " times" );
			}
			
		}
		
	}

}
