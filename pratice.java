import java.util.*;

public class pratice {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        

        for (int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        leftrotate(arr);
        System.out.println(Arrays.toString(arr));
        rightrotate(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(" ");
        reverse_Order(arr);
        System.out.println(" ");
        even_index_elements(arr);
        System.out.println(" ");
        odd_index_elements(arr);
        System.out.println(" ");
        largest_elements(arr);
        System.out.println(" ");
        smallest_elements(arr);
        System.out.println(" ");

        sc.close();
    }

    static int[] leftrotate(int arr[]) {
        int last = arr[0];
        for (int i=0; i<arr.length-1; i++) {
            arr[i] = arr[i +1];
        }
        arr[arr.length-1]= last;
        return arr;
    }

    static int[] rightrotate(int arr[]) {
        int first = arr[arr.length-1];
        for (int i=arr.length-1; i>0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = first;
        return arr;
    }

    static void reverse_Order(int arr[]) {

        for (int i=arr.length-1; i>=0; i-- ) {
            System.out.print(arr[i] + " ");
        }
    }

    static void even_index_elements(int arr[]) {

        for (int i=0; i<arr.length; i= i+2 ) {
            System.out.print(arr[i] + " ");
        }
    }

    static void odd_index_elements(int arr[]) {

        for (int i=1; i<arr.length; i= i+2 ) {
            System.out.print(arr[i] + " ");
        }
    }

    static void largest_elements(int arr[]) {
        int max = arr[0];
        for (int i=1; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; 
            }  
        }
        System.out.println(max);
    }

    static void smallest_elements(int arr[]) {
        int min = arr[0];
        for (int i=1; i<arr.length; i++) {
            if (arr[i] < max) {
                min = arr[i]; 
            }  
        }
        System.out.println(min);
    }

    static void descending_oder(int arr[]) {
        int count = 0;

        for (int i=0; i<arr.length; i++) {
            
        }
    }
}