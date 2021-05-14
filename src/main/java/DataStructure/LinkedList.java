package DataStructure;

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
		System.out.println();
	}

	// To reverse a Linked List
	public LinkedList reverseList(LinkedList list) {
		Node current;
		Node previous = null;
		Node next;
		current = list.headNode;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		list.headNode = previous;
		return list;
	}
	
	// To delete a node from list
	public LinkedList deleteNode(LinkedList list, int dataToBeDeleted)
	{
		// If the LinkedList is empty
		if(list.headNode == null)
			return list;
		// Get a temp pointer to head node of list to traverse
		Node cur = list.headNode;
		// Check if head node is node to be deleted
		if(cur.data == dataToBeDeleted)
		{
			list.headNode = headNode.next;
			return list;
		}
		// Another Node reference to pointer to prev node
		Node prev = null;
		/* Need to traverse to list till we reach last of list or
		 we found node to be deleted
		 */
		while(cur != null && cur.data != dataToBeDeleted)
		{
			prev = cur;
			cur = cur.next;
		}
		/* If dataToBeDeleted is not found in list
		 * then cur will point to null after traverse 
		*/
		if(cur == null)
			return list;
		/* If data is found in the list
		 * then to delete the desired node we need to skip reference
		 * of node to be deleted.
		 */
		prev.next = cur.next;
		return list;
	}

}
