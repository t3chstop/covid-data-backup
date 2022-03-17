import java.util.Queue;
import java.util.LinkedList;

public class BTree {
	//"Top" of the tree
	Node head;
	int size;


	public BTree() {
		head = null;
		size = 0;
	}

	/**
	 * Add node to the tree!
	 * keeps the tree in a sorted fashion
	 * every node to the right of a node is great-than-or-equal-to that node
	 * every node to the left of a node is less-than that node
	 * @param arg
	 */
	public void add(Node n) {
	    Node newNode = n;
	    if (head == null) {
	        head = newNode;
	        size++;
	    } else {
	        Node current = head;
	        Node parent;
	        while (true) {
	            parent = current;
	            if (newNode.getData() < current.getData()) {
	                current = current.left;
	                if (current == null) {
	                    parent.left = newNode;
	                    size++;
	                    return;
	                }
	            } else {
	                current = current.right;
	                if (current == null) {
	                    parent.right = newNode;
	                    size++;
	                    return;
	                }
	            }
	        }
	    }

	}

	public void print() {
		Node current = head;
		while (current.left!=null) {
			System.out.println(current.left.toString());
			current = current.left;
		}
		while (current.right!=null) {
			System.out.println(current.left.toString());
			current = current.right;
		}
	}


	public String bfs() {
		// return a string representation of the nodes
		// in a breath-first-search order
		  /* to be completed */
		
		String builder = "";
		for (int i = 1; i<=size; i++) {
			builder+= currentLevel(this.head, i);
		}
		System.out.println("bruh");
		return builder;
	}
	
	public String currentLevel(Node root, int level) {
		String builder = "";
		if (root==null) {
			return "";
		} else if(level==1) {
			return root.toString();
		} else if (level>1) {
			builder += currentLevel(root.right, level-1);
			builder += currentLevel(root.left, level-1);
		}
		
		
		return builder;
	}

	//pre-order depth-first-search traversal
	public String dfs() {
	      /* to be completed */
		return builddfs(head);
	}
	
	public String builddfs(Node node) {
		String builder = "";
		if (node==null) {
			return "";
		}
		builder += node.getData() + " ";
		builder += builddfs(node.left);
		builder+= builddfs(node.right);
		return builder;
	}






}
