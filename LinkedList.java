public class LinkedList {

	private Node start;

	public LinkedList() {
		start = null;
	}

	public void insert(int x) {
		if(start == null) {
			start = new Node(x, start);
		} else {  
			Node temp = start;

			while(temp.getNext() != null) {
				temp = temp.getNext();
			}
			Node newNode = new Node(x,null);
			temp.setNext(newNode);
		}
	}

	public void display() {
		int count = 0;

		if(start == null) {
			System.out.println("\n List is empty !!");
		} else {
			Node temp = start;

			while(temp.getNext() != null) {
				System.out.println("count("+count+") , node value="+temp.getData());
				count++;
				temp = temp.getNext();
			}
		}
	}

	public void delete(int x) {
		Node previous =  start;
		Node temp = start;

		while(temp.getData() != x) {
			if(temp.getNext() == null) {
				System.out.println("\nElement "+ x + " not found !");
				break;
			}

			previous = temp;
			temp = temp.getNext();

		}
		if(temp == start) {
			start = start.getNext();
		} else {
			previous.setNext(temp.getNext());
		}
	}
	
	public Node getStart()
	{
		return start;
	}
	public void setStart(Node n)
	{
		this.start = n;
	}
}
