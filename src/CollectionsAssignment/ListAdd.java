package CollectionsAssignment;

public class ListAdd {

	public Mnode head = null;

	public void addFront(int element) {
		Mnode nd = new Mnode(element);
		System.out.println("Adding: " + element);
		if (head == null)
			head = nd;
		else {
			nd.next = head;
			head = nd;
		}
	}

	public void traverse() {
		System.out.println("list of elements:");
		Mnode curr = head;
		while (curr != null) {
			System.out.println(curr.data);
			curr=curr.next;
		}

	}

	public static void main(String[] args) {
		ListAdd ls = new ListAdd();
		ls.addFront(10);
		ls.addFront(50);
		ls.addFront(60);
		ls.addFront(20);
		ls.addFront(30);
		ls.traverse();
		

	}

}
