package ListExamples;

public class CreateLinkedList {

	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();
		// Add notes to a List
		linkedList.addNode(linkedList,1);
		linkedList.addNode(linkedList,2);
		linkedList.addNode(linkedList,3);
		linkedList.addNode(linkedList,4);
		linkedList.addNode(linkedList,5);
		
		// Print nodes
		linkedList.printList(linkedList);
	}
}
