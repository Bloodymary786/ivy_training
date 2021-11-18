package tree;
class Node{
	int key;
	Node left, right ;
	Node(int key){
		this.key=key;
	}
}
class Bst{
	Node root;
	void insert(int key) {
		Node newNode=new Node(key);
		if(root==null) {
			root =newNode;
		}else {
			Node curr=root;
			Node par=null;
			while(true) {
				par=curr;
				if(key<curr.key) {
					curr=curr.left;
					if(curr==null) {
						par.left=newNode;
						return;
					}
				}else {
					curr=curr.right;
					if(curr==null) {
						par.right=newNode;
						return;
					}
				}
			}
		}
	}
	//find max 
	Node findMax() {
		Node curr=root;
		Node last=null;
		while(curr!=null) {
			last=curr;
			curr=curr.right;
		}
		return last;
	}
	//find min
	Node findMin() {
		Node curr=root;
		Node last=null;
		while(curr!=null) {
			last=curr;
			curr=curr.left;
		}
		return last;
	}
}





public class DemoTree {

	public static void main(String[] args) {
		Bst bst =new Bst();
		bst.insert(10);
		bst.insert(5);
		bst.insert(3);
		bst.insert(8);
		System.out.println(bst.findMax().key);
		System.out.println(bst.findMin().key);
	}
}
