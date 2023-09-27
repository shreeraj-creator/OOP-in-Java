public class Node{

	Node left;
	int key;
	Node right;

	public Node (int data){

		this.left = null;
		this.key = data;
		this.right = null;
	}

	public int getData(){

		return this.key;
	}

}
