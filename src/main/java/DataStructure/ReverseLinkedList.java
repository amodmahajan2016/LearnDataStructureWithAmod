package DataStructure;

public class ReverseLinkedList {

public static void main(String[] args) {
		// Create Linked list
		LinkedList linkedList = new LinkedList();
		linkedList.addNode(linkedList,1);
		linkedList.addNode(linkedList,2);
		linkedList.addNode(linkedList,3);
		linkedList.addNode(linkedList,4);
		linkedList.addNode(linkedList,5);
		
		linkedList.printList(linkedList);
		
		// Reverse LinkedList
		linkedList = linkedList.reverseList(linkedList);
		
		linkedList.printList(linkedList);
		
	}
}
