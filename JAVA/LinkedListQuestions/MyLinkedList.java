
public class MyLinkedList {
	private NODE head;
	
	public MyLinkedList(NODE listPtr) {
		head = listPtr;
	}
	
	public MyLinkedList() {
		head = null;
	}
	
	public void traverse() {
		NODE ptr = head;
		while(ptr != null) {
			System.out.println(ptr.getData());
			ptr = ptr.getNext();
		}
	}
	
	// Needs a node as an input
	public void insertNodeInBeginning(NODE node) {
		if(head == null) return;
		
		if(node != null) {
			node.setNext(head);
			head = node;
		}
	}
	
	// Needs data in the beginning
	public void insertDataInBeginning(int data) {
		
		if(head == null) return;
		
		NODE n = new NODE(data);
		n.setNext(head);
		head = n;
	}
	
	public void insertNodeInEnd(NODE node) {
		if(head == null) return;
		
		NODE ptr = head;
		while(ptr.getNext() != null) {
			ptr = ptr.getNext();
		}
		
		// Now ptr is pointing to the last node.
		// node.next is already null
		ptr.setNext(node);
	}
	
	public void deleteFirstNode() {
		if(head == null) return;
		
		NODE ptr = head;
		head = ptr.getNext();
		// when we leave this function we loose reference to ptr
		// ptr will be marked for garbage collection (?)
	}
	
	public void deleteLastNode() {
		if(head == null) return;
		
		NODE ptr = head;
		NODE prev = null;
		
		while(ptr.getNext() != null) {
			prev = ptr;
			ptr = ptr.getNext();
		}
		
		if (prev != null) {
			// This is the second last node
			// Set its next to be null
			// memory pointed by ptr will be reclaimed
			// at the end of this function
			prev.setNext(null);
		} else {
			// There is only one node
			// delete head
			// no exclusive delete is required just change the reference of head
			head = null;
		}
	}

}
