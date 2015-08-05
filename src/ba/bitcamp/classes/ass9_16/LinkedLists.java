package ba.bitcamp.classes.ass9_16;

import java.util.Scanner;

public class LinkedLists {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Node head = null;
		Node last = null;

		System.out.println("Input positive numbers: ");
		
		while (true) {

			int n = s.nextInt();
			if (n > 0){
				Node newNode = new Node(n);
				
				if(head == null && last == null) {
					head = newNode;
					last = newNode;
				} else {
					last.setNext(newNode);
					last = newNode;
				}
			} else {
				break;
			}
		}
		
		int length = 0;
		Node currentNode = head;
		int sum = 0;
		
		while(currentNode != null){
			sum += currentNode.getValue();
			length++;
			currentNode = currentNode.getNext();
		}
		
		System.out.printf("You have entered %d positive numbers. \n", length);
		System.out.printf("Sum is %d. \n", sum);

	}

}
