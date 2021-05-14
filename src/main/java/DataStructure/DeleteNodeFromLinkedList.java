package DataStructure;

public class DeleteNodeFromLinkedList {

	public static void main(String[] args) {
		// Create Linked List
		LinkedList linkedList = new LinkedList();
		linkedList.addNode(linkedList,10);
		linkedList.addNode(linkedList,12);
		linkedList.addNode(linkedList,9);
		linkedList.addNode(linkedList,4);
		linkedList.addNode(linkedList,23);
		// Print linked List
		System.out.println("Before Deleting :");
		linkedList.printList(linkedList);
		// Delete first node from list
		linkedList.deleteNode(linkedList, 10);
		System.out.println("After Deleting first node:");
		linkedList.printList(linkedList);
		linkedList.deleteNode(linkedList, 23);
		System.out.println("After Deleting last node:");
		linkedList.printList(linkedList);
		linkedList.deleteNode(linkedList, 9);
		System.out.println("After Deleting any other node:");
		linkedList.printList(linkedList);
		linkedList.deleteNode(linkedList, 90);
		System.out.println("After Deleting non existing node:");
		linkedList.printList(linkedList);
	}
}
