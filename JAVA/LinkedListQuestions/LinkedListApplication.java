
public class LinkedListApplication {
	
	public static NODE createSampleList() {
		// create 5 nodes and link them
		NODE n1 = new NODE(1);
		NODE n2 = new NODE(2);
		NODE n3 = new NODE(3);
		NODE n4 = new NODE(4);
		NODE n5 = new NODE(5);
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		return n1;
	}

	public static void main(String[] args) {
		
		// create a sample list of nodes
		NODE sample_list =  createSampleList();
		
		// Initialize the linked list using this list of nodes
		MyLinkedList list = new MyLinkedList(sample_list);
		
		NODE node = new NODE(0);
		list.insertNodeInBeginning(node);
	
		list.insertDataInBeginning(-1);
		NODE n = new NODE(6);
		list.insertNodeInEnd(n);
		list.deleteFirstNode();
		list.deleteLastNode();
		
		list.traverse();
	}

}
