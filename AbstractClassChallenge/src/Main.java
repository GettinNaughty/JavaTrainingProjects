
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList list = new MyLinkedList(null);
		list.transverse(list.getRoot());
		String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
		String[] data = stringData.split(" ");
		for(String s : data) {
			list.addItem(new Node(s));
		}
		list.transverse(list.getRoot());
	}

}
