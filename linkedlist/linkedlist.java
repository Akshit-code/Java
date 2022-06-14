import java.util.Scanner;

public class linkedlist {
    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void addAtHead(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
        
    }

    public void addAfter(int new_data,Node prev_node) {
        if (prev_node == null) {
            System.out.println("The previous node cannot be null");
            return;
        }

        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    public void addAtTail(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = null;

        if(head == null) {
            head  = new Node(new_data);
            return;
        }

        Node last = head;
        while(last.next != null) {
            last = last.next;
        }
        last.next = new_node;
        return;
    }


    public void deleteNode(int key) {
        Node temp = head;
        Node prev = null;

        if(temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while(temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        
        if(temp == null) {
            return;
        }

        prev.next = temp.next;
    }

    public void deleteNodeByPos(int key) {
        Node temp = head;
        Node prev = null;
        int count = 1;

        if(temp != null && count == key) {
            head = temp.next;
            return;
        }

        while(temp != null && count != key) {
            prev = temp;
            temp = temp.next;
            count ++;
        }
        
        if(count == key && temp == null) {
            return;
        }

        prev.next = temp.next;
    }

    public void printList() {
        Node n = head;
        while(n != null) {
            System.out.print(n.data + " "); 
            System.out.print(n.next + " ");
            n = n.next;
        }
    }

    public void deleteCompleteList() {
        head = null;
    } 

    public void listLength() {
        Node temp = head;
        int count = 0;
        while(temp != null) {
            temp = temp.next;
            count ++;
        }
        System.out.println("Length of List: " + count);
    }


    public void search(int new_data) {
        Node temp = head;
        while(temp != null && temp.data != new_data) {
            temp = temp.next;
        }

        System.out.println("Found Successfully: " + temp.data);
    }
    public static void main(String[] args) {
        linkedlist obj = new linkedlist();
        obj.addAtHead(1);
        obj.printList();
        System.out.println();

        obj.addAtTail(2);
        obj.printList();
        System.out.println();

        obj.addAtTail(3);
        obj.printList();
        System.out.println();

        obj.addAtTail(5);
        obj.printList();
        System.out.println();

        obj.addAtTail(6);
        obj.printList();
        System.out.println();

        obj.addAfter(10, linkedlist.head.next.next);
        obj.printList();
        System.out.println();

        obj.addAtTail(4);
        obj.printList();
        System.out.println();

        obj.addAtTail(7);
        obj.printList();
        System.out.println();

        obj.deleteNode(4);
        obj.printList();
        System.out.println();

        obj.deleteNodeByPos(2);
        obj.printList();
        System.out.println();

        obj.listLength();
        obj.search(10);
        
        // Taking user input
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number of Nodes: ");
        // int size = sc.nextInt();

        // for (int i=1; i<=size; i++) {
        //     int value = sc.nextInt();

        //     if(head == null) {
        //         obj.addAtHead(value);
        //     } else {
        //         obj.addAtTail(value);
        //     }
        // }

        // obj.printlist();
    }
}
