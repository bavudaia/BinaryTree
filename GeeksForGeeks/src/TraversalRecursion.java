
public class TraversalRecursion {
	public static void main(String[] args) {
		Node tree = Node.createBinaryTree();
		inOrder(tree);
	}
	
	public static void preOrder(Node root)
	{
		if(root == null)
			return;
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void postOrder(Node root)
	{
		if(root == null)
			return;		
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data);
	}
	public static void inOrder(Node root)
	{
		if(root == null)
			return;
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}
}

