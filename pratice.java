import java.util.*;

class pratice {
    public static void main(String[] args) {
      ArrayList<Integer> arr1 = new ArrayList<>();
      ArrayList<Integer> arr2 = new ArrayList<>();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of Array");
      int size = sc.nextInt();

      for (int i=0; i<size; i++) {
        int value = sc.nextInt();
        arr1.add(value);
      }

      System.out.println(arr1);
      System.out.println(arr1.size());
      arr2.addAll(arr1);
      System.out.println(arr2);
      arr2.addAll(2,arr1);
      System.out.println(arr2);
      Collections.sort(arr2);
      System.out.println(arr2);
    
      sc.close();
    }
  }