package advanced.day2;

public class BubbleSort {
	//Sorting array in ascending order
	
	public static void bubblesortAsc(int arr[]) {
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
	}
	
	public static void bubblesortDsc(int arr[]) {
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-1;j++) {
				if(arr[j]>arr[j-1]) {
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
			
		}
	}

	public static void main(String[] args) {
		int arr[]= {62,51,49,55,87};
		System.out.println("Array before sorting:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		bubblesortAsc(arr);
		
		System.out.println("array in ascending order:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
			
		}
		System.out.println();
		bubblesortDsc(arr);
		System.out.println("Array in descending order:");
		for(int a=0;a<arr.length;a++) {
			System.out.print(arr[a]+" ");
		}
	}

}
