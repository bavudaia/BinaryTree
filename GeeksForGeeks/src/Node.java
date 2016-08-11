;
public class Node {
	public int data;
	public Node left;
	public Node right;
	public Node(){}
	public Node(int data)
	{
		this.data = data;
	}
	
	public static Node createBinaryTree()
	{
		Node node = new Node(1);
		node.left = new Node(2);
		node.right = new Node(3);
		node.left.left = new Node(4);
		node.left.right = new Node(5);
		node.right.left = new Node(6);
		node.right.right = new Node(7);
		node.left.left.left = new Node(8);
		return node;
	}
}
