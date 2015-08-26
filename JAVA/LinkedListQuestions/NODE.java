
public class NODE {
	
	private int data;
	private NODE next;
	
	public NODE(int data) {
		this.data = data;
		this.next = null;
	}
	
	public NODE getNext() {
		return next;
	}
	
	public int getData() {
		return data;
	}
	
	public void setNext(NODE next) {
		this.next = next;
	}
	
	public void setData(int data) {
		this.data = data;
	}

}
