import java.util.Scanner;

// Java recursive program to solve tower of hanoi puzzle

class towerofhanoi
{
	static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod)
	{
		if (n == 1)
		{
 			System.out.println("Move disk 1 from rod " + from_rod + " to rod " + to_rod);
			return;
		}
		towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
		System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod);
		towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
	}
	
	// Driver method
	public static void main(String args[])
	{
		// int n = 3; // Number of disks
		System.out.print("Enter the number of disks:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(); 
		s.close();
		towerOfHanoi(n, 'A', 'C', 'B');
	}
}
