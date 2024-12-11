class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {

    Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println(data + " inserted at the end.");
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println(data + " inserted at the beginning.");
    }

    public void insertAfter(int prevData, int data) {
        Node temp = head;
        while (temp != null && temp.data != prevData) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Previous node not found.");
        } else {
            Node newNode = new Node(data);
            newNode.next = temp.next;
            temp.next = newNode;
            System.out.println(data + " inserted after " + prevData);
        }
    }

    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("Deleted " + head.data + " from the beginning.");
            head = head.next;
        }
    }

    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("The list is empty.");
        } else if (head.next == null) {
            System.out.println("Deleted " + head.data + " from the end.");
            head = null;
        } else {
            Node temp = head;
            while (temp.next != null && temp.next.next != null) {
                temp = temp.next;
            }
            System.out.println("Deleted " + temp.next.data + " from the end.");
            temp.next = null;
        }
    }

    public void deleteNode(int key) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        if (head.data == key) {
            System.out.println("Deleted " + head.data + " from the list.");
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println(key + " not found in the list.");
        } else {
            System.out.println("Deleted " + temp.next.data + " from the list.");
            temp.next = temp.next.next;
        }
    }

    public void traverse() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);

        list.traverse();

        list.insertAtBeginning(5);
        list.traverse();

        list.insertAfter(20, 25);
        list.traverse();

        list.deleteFromBeginning();
        list.traverse();

        list.deleteFromEnd();
        list.traverse();

        list.deleteNode(25);
        list.traverse();

        list.deleteNode(100);
    }
}

