import java.util.*;

public class RotateArray {
    public static void main (String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of shifts");
        int shift = sc.nextInt();
        System.out.println("Enter Size of array");
        int size = sc.nextInt();
        System.out.println("Enter Elements of array");

        int[] arr = new int[size];
        for (int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Original Array = " + Arrays.toString(arr));
        rightrotate(shift, arr);
        System.out.println("Right Shift = " + Arrays.toString(arr));
        leftrotate(shift, arr);
        System.out.println("Left shift = " + Arrays.toString(arr));
        sc.close();
    }

    public static int[] rightrotate(int shift, int[] arr) {
        for(int i=1; i<=shift; i++) {
            int last = arr[arr.length-1];
            for(int j=arr.length-1; j>0; j-- ) {
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }
        return arr;
    }

    public static int[] leftrotate(int shift, int[] arr) {
        for(int i=1; i<=shift; i++) {
            int first = arr[0];
            for(int j=0; j<arr.length-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = first;
        }
        return arr;
    }
}
