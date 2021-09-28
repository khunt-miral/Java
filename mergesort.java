

public class mergesort {
    void merge(int arr[], int beg, int mid, int end) {

        int l = mid - beg + 1;
        int r = end - mid;

        int LeftArray[] = new int[l];
        int RightArray[] = new int[r];

        for (int i = 0; i < l; ++i)
            LeftArray[i] = arr[beg + i];

        for (int j = 0; j < r; ++j)
            RightArray[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = beg;
        while (i < l && j < r) {
            if (LeftArray[i] <= RightArray[j]) {
                arr[k] = LeftArray[i];
                i++;
            } else {
                arr[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i < l) {
            arr[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j < r) {
            arr[k] = RightArray[j];
            j++;
            k++;
        }
    }

    void sort(int arr[], int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            sort(arr, beg, mid);
            sort(arr, mid + 1, end);
            merge(arr, beg, mid, end);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 90, 23, 101, 45, 65, 67, 89, 34 };
        // Arrays.sort(arr);
        mergesort ob = new mergesort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
            System.out.print("\t");
        }
        System.out.println("\n");
    }
}
// import java.io.*;
// import java.util.*;


// class java2s {
//     public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//         // bufferedreader br = new bufferedreader(new inputstreamreader(System.in));
//         int t = sc.nextInt();
//         while (t-- > 0) {
//             // stringtokenizer st = new stringtokenizer(br.readline());
//             int x = sc.nextInt();
//             int y = sc.nextInt();
//             int sum = x + y;
//             for (int i = 1; i < 100; i++) {
//                 int res = sum + i;
//                 if (res == 3 || res == 5 || res == 7) {
//                     System.out.println(i);
//                     break;
//                 } else if ((res % 2) != 0 && (res % 3) != 0 && (res % 5) != 0 && (res % 7) != 0) {
//                     System.out.println(i);
//                     break;
//                 }
//             }
//         }
//         sc.close();
//     }
// }