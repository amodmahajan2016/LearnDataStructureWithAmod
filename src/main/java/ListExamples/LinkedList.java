package ListExamples;

/*
 * A single linked list consists of zero or more nodes.
 * First node in LinkedList is called Head and last node in a LinkedList
 * is called a tail.
 */
public class LinkedList {

	private Node headNode; // start of list
	private Node tailNode; // end of list

	// To add a new node in LinkedList
	public LinkedList addNode(LinkedList list, int data) {
		// Create a new node with given data
		Node newNode = new Node(data);
		newNode.next = null;

		/*
		 * before adding a new node, check if list is empty. If list is empty, head and
		 * tail will be same.
		 */
		if (list.headNode == null) {
			list.headNode = newNode;
			list.tailNode = newNode;
		}
		// if list is not empty then set next of last node to new node from NULL
		// and new node will have already null from constructor
		else {
			list.tailNode.next = newNode;
			list.tailNode = newNode;
		}

		// Return the list by head
		return list;
	}

	// To print a LinkedList
	public void printList(LinkedList list) {

		// Get the hold of starting node
		Node currNode = list.headNode;
		System.out.print("Nodes in LinkedList are: ");
		// Traverse through the LinkedList till current node becomes null
		while (currNode != null) {
			// Print the data at current node
			System.out.print(currNode.data + " ");
			// Go to next node
			currNode = currNode.next;
		}
	}

}
