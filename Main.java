public class Main{
	public static void main(String [ ] args){

		BST tree = new BST(4);
		System.out.println("Root Node: " + tree.getRoot());
		Node n = new Node(3);
		Node n2 = new Node(7);
		Node n3 = new Node(2);
		Node n4 = new Node(8);
		Node n5 = new Node(6);

		tree.insertNode(n);
		tree.insertNode(n2);
		tree.insertNode(n3);
		tree.insertNode(n4);
		tree.insertNode(n5);
		System.out.println("preorder:");
		tree.preOrder(tree.getRoot());
		System.out.println("");
		System.out.println("inorder:");
		tree.inOrder(tree.getRoot());
		System.out.println("");
		System.out.println("postorder:");
		tree.postOrder(tree.getRoot());
		


		
	}
}