
public class Mirror {
	public static void main(String[] args) {
		Node root = Node.createBinaryTree();
		mirror(root);
		LevelOrderTraversal.levelOrder(root);
}
	public static void mirror(Node root)
	{
		if(root == null)
			return;
		Node temp = root.left;
		root.left = root.right;
		root.right = temp;
		mirror(root.left);
		mirror(root.right);
	}
}

