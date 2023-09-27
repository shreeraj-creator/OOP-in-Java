public class BST {

	Node root;

	public BST(int data) {
		root = new Node(data);
	}

	public Node getRoot() {
		return root;
	}

	public void insertNode(Node n) {

		Node current = root;
		if(root == null){
			root = n;
			return;
		}

		while(true) {
			if(current.getData() > n.getData()) {
				if(current.left == null){
					current.left = n;
					return;
				}
				current = current.left;
			} 
			else if(current.getData() < n.getData()) {
				if(current.right == null){
					current.right = n;
					return;
				}
				current = current.right;
			}
			else{
				return; 
			}
		}
	}
	public void preOrder(Node root) {

		if(root != null){
			System.out.print(root.getData()+ ",");
			preOrder(root.left);
			preOrder(root.right);

		}
		else{
			return;
		}
	}

	public void inOrder(Node root) {

		if(root != null){
			inOrder(root.left);
			System.out.print(root.getData() + ",");
			inOrder(root.right);

		}
		else{
			return;
		}
	}

	public void postOrder(Node root) {

		if(root != null){
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.getData()+ ",");

		}
		else{
			return;
		}
	}


	


}