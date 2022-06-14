public class stack {

    int[] arr;
    int capacity;
    int top;

    stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity-1;
    }

    public void push (int x) {
        if(isFull()) {
            System.out.println("Stack is full");
        }
        arr[++top]= x;
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
        }
        int x = arr[top--];
        return x;
    }

    public int peek() {
        int x = arr[top];
        return x;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
          System.out.println(arr[i]);
        }
      }
    public static void main(String[] args) {
    stack obj = new stack(5);
  
    obj.push(1);
    obj.push(2);
    obj.push(3);
    obj.push(4);
    obj.peek();
    obj.pop();
    System.out.println("\nAfter popping out");
  
    obj.printStack();
    }
}
