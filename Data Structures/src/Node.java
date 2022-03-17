class Node{
	private int data;
	public Node left; 
	public Node right;
	
	public Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
	
	public int getData() {
		return data;
	}
	
	public String toString() {
		return Integer.toString(data) + " ";
	}
	public static void main(String[] args) {
		BTree tree = new BTree();
        tree.head = new Node(1);
        tree.head.left = new Node(2);
        tree.head.right = new Node(3);
        tree.head.left.left = new Node(4);
        tree.head.left.right = new Node(5);
		System.out.println(tree.bfs());
	}
	
}