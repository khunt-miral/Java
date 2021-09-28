import java.util.Scanner;

public class selectionsort {
    static Scanner sc = new Scanner(System.in);

    public static void selectionSort(int a[]) {
        int temp, minindex = 0;
        for (int i = 0; i < a.length - 1; i++) {

            for (int j = i + 1; j < a.length; j++) {
                if (a[minindex] > a[j]) {
                    minindex = j;
                }
                
                    temp = a[i];
                    a[i] = a[minindex];
                    a[minindex] = temp;
                
            }
        }
    }

    public static void main(String args[]) {
        int array[] = takeInput();
        selectionSort(array);
        display(array);
    }

    public static int[] takeInput() {
        System.out.println("How many elements do you want to enter?");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + (i + 1) + " element");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}