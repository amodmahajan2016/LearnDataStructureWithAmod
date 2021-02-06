package ListExamples;

/*
 * A node with two components-  First one is data another one is a pointer to next node.
 * If a node does not point to any other node, it will be NULL or point to NULL.
 */
public class Node {

	// Data component
	int data; 
	// Pointer component
	Node next; 
	
	// A constructor to create a node
	Node(int d) 
	{ 
		data = d; 
		// Since while creating a node we can not say in advance about next node so pointer will be null
		next = null; 
	}
}

