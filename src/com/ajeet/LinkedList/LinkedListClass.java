package com.ajeet.LinkedList;

public class LinkedListClass {
   static class Node {
       int data;
       Node next;
       public Node(int data) {
           this.data = data;
           this.next = null;
       }

   }

   //1.Search the elements in linked list

    public static boolean searchNode(Node head, int data) {

       Node temp = head;
       while (temp != null) {
           if (temp.data == data) {
               return true;
           }
           temp = temp.next;
       }
       return false;
    }

    //2. insert the new Node at given postions
public static Node insertNodeAtKThPos(Node head, int data, int k) {
       Node temp = head;
       for (int i = 0; i < k; i++) {
           temp = temp.next;
       }
       //create a node
    Node newNode = new Node(data);
       //insert the node
    newNode.next = temp.next;
    temp.next = newNode;
    return head;

}
    //delete the elements


    //insert at positions

    //delete at positions

    // access the Kth Elements

    public static void print(Node head) {
       Node temp = head;
       if(temp==null){
           return;
       }
       while (temp != null) {
           System.out.print(temp.data + " ");
           temp = temp.next;
       }

    }
}
