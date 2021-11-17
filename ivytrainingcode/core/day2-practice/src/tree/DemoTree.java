package tree;

class Node {
	int key;
	Node leftChild, rightChild;

	Node(int keyVal) {
		key = keyVal;
	}
}

class BST {

	private Node root;

	public void insert(int key) {

		Node newNode = new Node(key);
		if (root == null) {
			root = newNode;
		} else {

			Node current = root;
			Node parent;

			while (true) {
				parent = current;
				if (key < current.key) {
					current = current.leftChild;
					if (current == null) {
						parent.leftChild = newNode;
						return;
					}
				} else {
					current = current.rightChild;
					if (current == null) {
						parent.rightChild = newNode;
						return;
					}

				}

			}
		}
	}

	public Node findMin() {
		Node current = root;
		Node last = null;

		while (current != null) {
			last = current;
			current = current.leftChild;
		}
		return last;
	}

	public Node findMax() {
		Node current = root;
		Node last = null;

		while (current != null) {
			last = current;
			current = current.rightChild;
		}
		return last;
	}

}

public class DemoTree {

	public static void main(String[] args) {
		BST tree = new BST();
		tree.insert(10);
		tree.insert(20);
		tree.insert(22);
		tree.insert(18);
		tree.insert(19);
		tree.insert(17);

		System.out.println(tree.findMin().key);
		System.out.println(tree.findMax().key);
	}
}
