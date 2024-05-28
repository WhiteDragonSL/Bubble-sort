import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        bubbleSort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int a = 0; a < n - 1; a++) {
            for (int b = 0; b < n - a - 1; b++) {
                if (arr[b] > arr[b + 1]) {
                    int temp = arr[b];
                    arr[b] = arr[b + 1];
                    arr[b + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}