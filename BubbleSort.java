import java.util.Scanner;

class BubbleSort{
	static Scanner sc = new Scanner(System.in); 
	public static void main(String [] args){
		int [] arr = new int[10];
		System.out.println("Enter 10 elements");
		for(int i=0;i<10;i++){
			arr[i]=sc.nextInt();
		}
		int [] x = Bubble(arr);
		for(int k=0;k<10;k++){
			System.out.println(x[k]);
		}
		
	}
	public static int [] Bubble(int [] ar){
		int temp;
		for(int i=0;i<ar.length-1;i++){
			for(int j=0;j<ar.length-i-1;j++){
				if(ar[j]>ar[j+1]){
					temp = ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;		
				}
			}
		}
		return ar;
	}
}
